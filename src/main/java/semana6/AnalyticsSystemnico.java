package semana6;

import java.util.*;
import java.util.stream.Collectors;

public class AnalyticsSystemnico {

    public List<Studentnico> obtenerEstudiantesNaranja(List<Studentnico> students) {
        return students.stream()
                .filter(student -> "NARANJA".equalsIgnoreCase(student.getTeam()))
                .collect(Collectors.toList());
    }

    public List<String> obtenerNombresOrdenados(List<Studentnico> students) {
        return students.stream()
                .map(Studentnico::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public double calcularPromedioGeneral(List<Studentnico> students) {
        return students.stream()
                .flatMap(student -> student.getGrades().stream())
                .mapToDouble(Gradenico::getScore)
                .average()
                .orElse(0.0);
    }

    public Map<String, Double> obtenerPromediosPorMateria(Studentnico student) {
        return student.getGrades().stream()
                .collect(Collectors.groupingBy(
                        Gradenico::getSubject,
                        Collectors.averagingDouble(Gradenico::getScore)
                ));
    }

    public Optional<Studentnico> obtenerMejorEstudiante(List<Studentnico> students) {
        return students.stream()
                .max(Comparator.comparingDouble(this::calcularPromedioEstudiante));
    }

    private double calcularPromedioEstudiante(Studentnico student) {
        return student.getGrades().stream()
                .mapToDouble(Gradenico::getScore)
                .average()
                .orElse(0.0);
    }

    public Map<String, Long> obtenerMateriasReprobadasPorEquipo(List<Studentnico> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Studentnico::getTeam,
                        Collectors.summingLong(student ->
                                student.getGrades().stream()
                                        .filter(grade -> !grade.isPassed())
                                        .count()
                        )
                ));
    }

    public List<Studentnico> obtenerTop3Aprobadas(List<Studentnico> students) {
        return students.stream()
                .sorted(Comparator.comparingLong(this::contarMateriasAprobadas).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    private long contarMateriasAprobadas(Studentnico student) {
        return student.getGrades().stream()
                .filter(Gradenico::isPassed)
                .count();
    }

    public Map<String, List<Studentnico>> agruparPorEstadoAcademico(List<Studentnico> students) {
        return students.stream()
                .collect(Collectors.groupingBy(student -> {
                    double promedio = calcularPromedioEstudiante(student);
                    if (promedio >= 4.5) {
                        return "ALTO RENDIMIENTO";
                    } else if (promedio >= 3.5) {
                        return "REGULAR";
                    } else {
                        return "RIESGO";
                    }
                }));
    }

    public Optional<String> obtenerMateriaConMasReprobaciones(List<Studentnico> students) {
        return students.stream()
                .flatMap(student -> student.getGrades().stream())
                .filter(grade -> !grade.isPassed())
                .collect(Collectors.groupingBy(Gradenico::getSubject, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public LinkedHashMap<String, Double> analisisEquipoNaranja(List<Studentnico> students) {
        return students.stream()
                .filter(student -> "NARANJA".equalsIgnoreCase(student.getTeam()))
                .flatMap(student -> student.getGrades().stream())
                .filter(Gradenico::isPassed)
                .collect(Collectors.groupingBy(
                        Gradenico::getSubject,
                        Collectors.averagingDouble(Gradenico::getScore)
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }
}
