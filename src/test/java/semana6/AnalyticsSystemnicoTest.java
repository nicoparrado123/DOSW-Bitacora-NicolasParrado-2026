package semana6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AnalyticsSystemnicoTest {
    private AnalyticsSystemnico analytics;
    private List<Studentnico> students;

    @BeforeEach
    void setUp() {
        analytics = new AnalyticsSystemnico();
        students = crearDatos();
    }

    private List<Studentnico> crearDatos() {
        List<Studentnico> lista = new ArrayList<>();

        lista.add(new Studentnico("001", "ana", "NARANJA", Arrays.asList(
                new Gradenico("DOSW", 4.8, LocalDate.now(), true),
                new Gradenico("BD", 4.5, LocalDate.now(), true),
                new Gradenico("REDES", 4.7, LocalDate.now(), true)
        )));

        lista.add(new Studentnico("002", "carlos", "AZUL", Arrays.asList(
                new Gradenico("DOSW", 3.8, LocalDate.now(), true),
                new Gradenico("BD", 3.5, LocalDate.now(), true),
                new Gradenico("REDES", 2.9, LocalDate.now(), false)
        )));

        lista.add(new Studentnico("003", "maria", "VERDE", Arrays.asList(
                new Gradenico("DOSW", 3.0, LocalDate.now(), false),
                new Gradenico("BD", 3.2, LocalDate.now(), true),
                new Gradenico("REDES", 2.8, LocalDate.now(), false)
        )));

        lista.add(new Studentnico("004", "pedro", "NARANJA", Arrays.asList(
                new Gradenico("DOSW", 4.0, LocalDate.now(), true),
                new Gradenico("BD", 3.8, LocalDate.now(), true),
                new Gradenico("REDES", 3.9, LocalDate.now(), true)
        )));

        lista.add(new Studentnico("005", "lucia", "AZUL", Arrays.asList(
                new Gradenico("DOSW", 2.5, LocalDate.now(), false),
                new Gradenico("BD", 3.0, LocalDate.now(), false),
                new Gradenico("REDES", 3.3, LocalDate.now(), true)
        )));

        return lista;
    }

    @Test
    void testObtenerEstudiantesNaranja() {
        List<Studentnico> naranja = analytics.obtenerEstudiantesNaranja(students);
        assertEquals(2, naranja.size());
        assertTrue(naranja.stream().allMatch(s -> "NARANJA".equalsIgnoreCase(s.getTeam())));
    }

    @Test
    void testObtenerNombresOrdenados() {
        List<String> nombres = analytics.obtenerNombresOrdenados(students);
        assertEquals(5, nombres.size());
        assertEquals("ana", nombres.get(0));
    }

    @Test
    void testCalcularPromedioGeneral() {
        double promedio = analytics.calcularPromedioGeneral(students);
        assertTrue(promedio > 0);
    }

    @Test
    void testObtenerPromediosPorMateria() {
        Studentnico estudiante = students.get(0);
        Map<String, Double> promedios = analytics.obtenerPromediosPorMateria(estudiante);
        assertEquals(3, promedios.size());
    }

    @Test
    void testObtenerMejorEstudiante() {
        Optional<Studentnico> mejor = analytics.obtenerMejorEstudiante(students);
        assertTrue(mejor.isPresent());
        assertEquals("ana", mejor.get().getName());
    }

    @Test
    void testObtenerMateriasReprobadasPorEquipo() {
        Map<String, Long> reprobadas = analytics.obtenerMateriasReprobadasPorEquipo(students);
        assertTrue(reprobadas.containsKey("NARANJA"));
        assertEquals(0L, reprobadas.get("NARANJA"));
    }

    @Test
    void testObtenerTop3Aprobadas() {
        List<Studentnico> top3 = analytics.obtenerTop3Aprobadas(students);
        assertEquals(3, top3.size());
    }

    @Test
    void testAgruparPorEstadoAcademico() {
        Map<String, List<Studentnico>> grupos = analytics.agruparPorEstadoAcademico(students);
        assertTrue(grupos.containsKey("ALTO RENDIMIENTO"));
    }

    @Test
    void testObtenerMateriaConMasReprobaciones() {
        Optional<String> materia = analytics.obtenerMateriaConMasReprobaciones(students);
        assertTrue(materia.isPresent());
    }

    @Test
    void testAnalisisEquipoNaranja() {
        LinkedHashMap<String, Double> analisis = analytics.analisisEquipoNaranja(students);
        assertNotNull(analisis);
        assertTrue(analisis.size() > 0);
    }

    @Test
    void testConListaVacia() {
        List<Studentnico> vacia = new ArrayList<>();
        assertEquals(0, analytics.obtenerEstudiantesNaranja(vacia).size());
        assertEquals(0.0, analytics.calcularPromedioGeneral(vacia));
    }
}
