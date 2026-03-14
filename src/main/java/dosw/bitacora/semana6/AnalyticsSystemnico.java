package dosw.bitacora.semana6;

import java.util.*;
import java.util.stream.Collectors;

// clase principal que analiza el rendimiento academico de los estudiantes
public class AnalyticsSystemnico {

    // obtiene todos los estudiantes del equipo naranja
    public List<Studentnico> obtenerEstudiantesNaranja(List<Studentnico> students) {
        return students.stream()
                .filter(student -> "NARANJA".equalsIgnoreCase(student.getTeam()))
                .collect(Collectors.toList());
    }

    // obtiene los nombres de todos los estudiantes ordenados alfabeticamente
    public List<String> obtenerNombresOrdenados(List<Studentnico> students) {
        return students.stream()
                .map(Studentnico::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    // calcula el promedio general de todas las notas del sistema
    public double calcularPromedioGeneral(List<Studentnico> students) {
        return students.stream()
                .flatMap(student -> student.getGrades().stream())
                .mapToDouble(Gradenico::getScore)
                .average()
                .orElse(0.0);
    }

    // retorna el promedio por materia de un estudiante especifico
    public Map<String, Double> obtenerPromediosPorMateria(Studentnico student) {
        return student.getGrades().stream()
                .collect(Collectors.groupingBy(
                        Gradenico::getSubject,
                        Collectors.averagingDouble(Gradenico::getScore)
                ));
    }

    // retorna el estudiante con el promedio general mas alto
    public Optional<Studentnico> obtenerMejorEstudiante(List<Studentnico> students) {
        return students.stream()
                .max(Comparator.comparingDouble(this::calcularPromedioEstudiante));
    }

    // metodo auxiliar para calcular el promedio de un estudiante
    private double calcularPromedioEstudiante(Studentnico student) {
        return student.getGrades().stream()
                .mapToDouble(Gradenico::getScore)
                .average()
                .orElse(0.0);
    }

    // retorna la cantidad de materias reprobadas por equipo
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

    // retorna el top 3 de estudiantes con mas materias aprobadas
    public List<Studentnico> obtenerTop3Aprobadas(List<Studentnico> students) {
        return students.stream()
                .sorted(Comparator.comparingLong(this::contarMateriasAprobadas).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    // metodo auxiliar para contar materias aprobadas de un estudiante
    private long contarMateriasAprobadas(Studentnico student) {
        return student.getGrades().stream()
                .filter(Gradenico::isPassed)
                .count();
    }

    // agrupa estudiantes por su estado academico segun su promedio
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

    // obtiene la materia con mas reprobaciones en todo el sistema
    public Optional<String> obtenerMateriaConMasReprobaciones(List<Studentnico> students) {
        return students.stream()
                .flatMap(student -> student.getGrades().stream())
                .filter(grade -> !grade.isPassed())
                .collect(Collectors.groupingBy(Gradenico::getSubject, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    // analisis complejo: equipo naranja, notas aprobadas, promedio por materia ordenado
    public LinkedHashMap<String, Double> analisisEquipoNaranja(List<Studentnico> students) {
        return students.stream()
                // toma solo estudiantes del equipo naranja
                .filter(student -> "NARANJA".equalsIgnoreCase(student.getTeam()))
                // obtiene todas sus notas
                .flatMap(student -> student.getGrades().stream())
                // filtra solo notas aprobadas
                .filter(Gradenico::isPassed)
                // agrupa por materia y calcula promedio
                .collect(Collectors.groupingBy(
                        Gradenico::getSubject,
                        Collectors.averagingDouble(Gradenico::getScore)
                ))
                .entrySet().stream()
                // ordena descendente por promedio
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                // retorna un linkedhashmap preservando el orden
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }
}
