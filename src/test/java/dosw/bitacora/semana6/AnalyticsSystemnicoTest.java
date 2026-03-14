package dosw.bitacora.semana6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

// pruebas unitarias para el sistema de analytics
class AnalyticsSystemnicoTest {
    private AnalyticsSystemnico analytics;
    private List<Studentnico> students;

    @BeforeEach
    void setUp() {
        analytics = new AnalyticsSystemnico();
        students = crearDatosPrueba();
    }

    // crea datos de prueba para usar en todos los tests
    private List<Studentnico> crearDatosPrueba() {
        List<Studentnico> lista = new ArrayList<>();

        // estudiante 1 - equipo naranja con buen rendimiento
        lista.add(new Studentnico("001", "ana lopez", "NARANJA", Arrays.asList(
                new Gradenico("DOSW", 4.8, LocalDate.now(), true),
                new Gradenico("BD", 4.5, LocalDate.now(), true),
                new Gradenico("REDES", 4.7, LocalDate.now(), true)
        )));

        // estudiante 2 - equipo azul con rendimiento regular
        lista.add(new Studentnico("002", "carlos ruiz", "AZUL", Arrays.asList(
                new Gradenico("DOSW", 3.8, LocalDate.now(), true),
                new Gradenico("BD", 3.5, LocalDate.now(), true),
                new Gradenico("REDES", 2.9, LocalDate.now(), false)
        )));

        // estudiante 3 - equipo verde en riesgo
        lista.add(new Studentnico("003", "maria gomez", "VERDE", Arrays.asList(
                new Gradenico("DOSW", 3.0, LocalDate.now(), false),
                new Gradenico("BD", 3.2, LocalDate.now(), true),
                new Gradenico("REDES", 2.8, LocalDate.now(), false)
        )));

        // estudiante 4 - equipo naranja con rendimiento medio
        lista.add(new Studentnico("004", "pedro sanchez", "NARANJA", Arrays.asList(
                new Gradenico("DOSW", 4.0, LocalDate.now(), true),
                new Gradenico("BD", 3.8, LocalDate.now(), true),
                new Gradenico("REDES", 3.9, LocalDate.now(), true)
        )));

        // estudiante 5 - equipo azul con bajo rendimiento
        lista.add(new Studentnico("005", "lucia martinez", "AZUL", Arrays.asList(
                new Gradenico("DOSW", 2.5, LocalDate.now(), false),
                new Gradenico("BD", 3.0, LocalDate.now(), false),
                new Gradenico("REDES", 3.3, LocalDate.now(), true)
        )));

        return lista;
    }

    // prueba que filtre correctamente estudiantes del equipo naranja
    @Test
    void testObtenerEstudiantesNaranja() {
        List<Studentnico> naranja = analytics.obtenerEstudiantesNaranja(students);
        assertEquals(2, naranja.size());
        assertTrue(naranja.stream().allMatch(s -> "NARANJA".equalsIgnoreCase(s.getTeam())));
    }

    // prueba que los nombres se ordenen alfabeticamente
    @Test
    void testObtenerNombresOrdenados() {
        List<String> nombres = analytics.obtenerNombresOrdenados(students);
        assertEquals(5, nombres.size());
        assertEquals("ana lopez", nombres.get(0));
        assertEquals("carlos ruiz", nombres.get(1));
        assertEquals("lucia martinez", nombres.get(2));
        assertEquals("maria gomez", nombres.get(3));
        assertEquals("pedro sanchez", nombres.get(4));
    }

    // prueba el calculo del promedio general de todas las notas
    @Test
    void testCalcularPromedioGeneral() {
        double promedio = analytics.calcularPromedioGeneral(students);
        assertTrue(promedio > 0);
        assertTrue(promedio < 5);
    }

    // prueba que calcule correctamente el promedio por materia de un estudiante
    @Test
    void testObtenerPromediosPorMateria() {
        Studentnico estudiante = students.get(0);
        Map<String, Double> promedios = analytics.obtenerPromediosPorMateria(estudiante);
        assertEquals(3, promedios.size());
        assertTrue(promedios.containsKey("DOSW"));
        assertTrue(promedios.containsKey("BD"));
        assertTrue(promedios.containsKey("REDES"));
    }

    // prueba que encuentre al mejor estudiante
    @Test
    void testObtenerMejorEstudiante() {
        Optional<Studentnico> mejor = analytics.obtenerMejorEstudiante(students);
        assertTrue(mejor.isPresent());
        assertEquals("ana lopez", mejor.get().getName());
    }

    // prueba el conteo de materias reprobadas por equipo
    @Test
    void testObtenerMateriasReprobadasPorEquipo() {
        Map<String, Long> reprobadas = analytics.obtenerMateriasReprobadasPorEquipo(students);
        assertTrue(reprobadas.containsKey("NARANJA"));
        assertTrue(reprobadas.containsKey("AZUL"));
        assertTrue(reprobadas.containsKey("VERDE"));
        assertEquals(0L, reprobadas.get("NARANJA"));
        assertTrue(reprobadas.get("AZUL") > 0);
        assertTrue(reprobadas.get("VERDE") > 0);
    }

    // prueba que retorne el top 3 de estudiantes con mas materias aprobadas
    @Test
    void testObtenerTop3Aprobadas() {
        List<Studentnico> top3 = analytics.obtenerTop3Aprobadas(students);
        assertEquals(3, top3.size());
        assertEquals("ana lopez", top3.get(0).getName());
    }

    // prueba la agrupacion de estudiantes por estado academico
    @Test
    void testAgruparPorEstadoAcademico() {
        Map<String, List<Studentnico>> grupos = analytics.agruparPorEstadoAcademico(students);
        assertTrue(grupos.containsKey("ALTO RENDIMIENTO"));
        assertTrue(grupos.containsKey("REGULAR"));
        assertTrue(grupos.containsKey("RIESGO"));
        assertFalse(grupos.get("ALTO RENDIMIENTO").isEmpty());
    }

    // prueba que encuentre la materia con mas reprobaciones
    @Test
    void testObtenerMateriaConMasReprobaciones() {
        Optional<String> materia = analytics.obtenerMateriaConMasReprobaciones(students);
        assertTrue(materia.isPresent());
        assertTrue(Arrays.asList("DOSW", "BD", "REDES").contains(materia.get()));
    }

    // prueba el analisis complejo del equipo naranja
    @Test
    void testAnalisisEquipoNaranja() {
        LinkedHashMap<String, Double> analisis = analytics.analisisEquipoNaranja(students);
        assertNotNull(analisis);
        assertTrue(analisis.size() > 0);
        // verifica que sea un linkedhashmap y preserve el orden
        assertTrue(analisis instanceof LinkedHashMap);
    }

    // prueba con lista vacia
    @Test
    void testConListaVacia() {
        List<Studentnico> vacia = new ArrayList<>();
        assertEquals(0, analytics.obtenerEstudiantesNaranja(vacia).size());
        assertEquals(0.0, analytics.calcularPromedioGeneral(vacia));
        assertFalse(analytics.obtenerMejorEstudiante(vacia).isPresent());
    }

    // prueba que el promedio general sea correcto con valores conocidos
    @Test
    void testPromedioGeneralPreciso() {
        List<Studentnico> simple = Arrays.asList(
                new Studentnico("001", "test", "NARANJA", Arrays.asList(
                        new Gradenico("DOSW", 4.0, LocalDate.now(), true),
                        new Gradenico("BD", 5.0, LocalDate.now(), true)
                ))
        );
        double promedio = analytics.calcularPromedioGeneral(simple);
        assertEquals(4.5, promedio, 0.01);
    }

    // prueba que el top 3 funcione con menos de 3 estudiantes
    @Test
    void testTop3ConMenosEstudiantes() {
        List<Studentnico> pocos = Arrays.asList(students.get(0), students.get(1));
        List<Studentnico> top = analytics.obtenerTop3Aprobadas(pocos);
        assertEquals(2, top.size());
    }

    // prueba que la agrupacion por estado sea correcta
    @Test
    void testEstadoAcademicoAltoRendimiento() {
        Map<String, List<Studentnico>> grupos = analytics.agruparPorEstadoAcademico(students);
        List<Studentnico> altoRendimiento = grupos.get("ALTO RENDIMIENTO");
        assertNotNull(altoRendimiento);
        assertTrue(altoRendimiento.stream()
                .allMatch(s -> s.getGrades().stream()
                        .mapToDouble(Gradenico::getScore)
                        .average()
                        .orElse(0) >= 4.5));
    }

    // prueba que el analisis naranja solo incluya notas aprobadas
    @Test
    void testAnalisisNaranjaSoloAprobadas() {
        LinkedHashMap<String, Double> analisis = analytics.analisisEquipoNaranja(students);
        // todas las notas deben ser de materias aprobadas
        analisis.values().forEach(promedio -> assertTrue(promedio >= 3.0));
    }
}
