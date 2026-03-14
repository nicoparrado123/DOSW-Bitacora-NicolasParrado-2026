# semana 6 - sistema de analisis academico

este proyecto analiza el rendimiento de estudiantes usando programacion funcional con streams de java.

## que hace el sistema

el sistema procesa informacion de estudiantes y sus notas para sacar estadisticas y analisis del rendimiento academico. todo usando streams, sin ciclos for ni while.

## clases principales

- **studentnico** - representa un estudiante con su id, nombre, equipo y lista de notas
- **gradenico** - representa una nota con materia, puntaje, fecha y si aprobo o no
- **analyticssystemnico** - tiene todos los metodos de analisis usando streams

## funcionalidades implementadas

1. **filtrar estudiantes por equipo** - obtiene todos los del equipo naranja
2. **ordenar nombres** - lista alfabetica de todos los estudiantes
3. **promedio general** - calcula el promedio de todas las notas del sistema
4. **promedio por materia** - para cada estudiante, su promedio en cada materia
5. **mejor estudiante** - encuentra quien tiene el promedio mas alto
6. **materias reprobadas por equipo** - cuenta cuantas materias reprobo cada equipo
7. **top 3 aprobadas** - los 3 estudiantes con mas materias aprobadas
8. **clasificacion academica** - agrupa en alto rendimiento, regular o riesgo
9. **materia mas reprobada** - cual materia tiene mas reprobaciones
10. **analisis complejo naranja** - analisis detallado del equipo naranja con notas aprobadas

## como usar

todas las funciones reciben una lista de estudiantes y retornan el resultado procesado:

```java
AnalyticsSystemnico analytics = new AnalyticsSystemnico();
List<Studentnico> estudiantes = // tu lista de estudiantes

// obtener equipo naranja
List<Studentnico> naranja = analytics.obtenerEstudiantesNaranja(estudiantes);

// calcular promedio general
double promedio = analytics.calcularPromedioGeneral(estudiantes);

// obtener mejor estudiante
Optional<Studentnico> mejor = analytics.obtenerMejorEstudiante(estudiantes);
```

## pruebas unitarias

el proyecto tiene cobertura de pruebas mayor al 80%. las pruebas verifican:

- filtrado correcto de equipos
- ordenamiento alfabetico
- calculos de promedios
- agrupaciones por estado
- casos borde como listas vacias
- precision de calculos numericos

para ejecutar las pruebas:

```bash
mvn clean test
```

para ver la cobertura con jacoco:

```bash
mvn clean test jacoco:report
```

el reporte queda en `target/site/jacoco/index.html`

## requisitos cumplidos

- sin ciclos for ni while, todo con streams
- uso correcto de map, filter, flatmap, collect, groupingby, etc
- cobertura de pruebas mayor al 80%
- proyecto estructurado con maven
- codigo limpio y comentado de forma coloquial
- nombres de clases terminan en "nico"

## estructura del codigo

todo el codigo usa programacion funcional:
- `stream()` para procesar colecciones
- `filter()` para filtrar elementos
- `map()` para transformar datos
- `flatMap()` para aplanar listas
- `collect()` para recolectar resultados
- `groupingBy()` para agrupar
- `sorted()` para ordenar
- `max()`, `min()`, `average()` para calculos

ningun ciclo tradicional, todo declarativo y funcional.
