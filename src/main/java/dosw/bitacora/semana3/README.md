# Semana 3 - Patrones de Diseño

## Ejercicios realizados

### Ejercicio 8: Patron Chain of Responsibility
Descripcion: Sistema de control migratorio para ingresar a Estados Unidos. Cada control puede aprobar o rechazar y si rechaza el proceso se detiene.

Componentes principales:
- Control: Clase base abstracta con referencia al siguiente
- ControlPasaporteVisa: Verifica documentos
- ControlAntecedentes: Revisa historial
- ControlMotivoViaje: Valida razon del viaje
- AprobacionMigracion: Aprobacion final
- Persona: Objeto que pasa por la cadena

Aprendizajes:
- La cadena permite procesar solicitudes de forma secuencial
- Cada manejador decide si procesa o delega al siguiente
- Se puede detener el proceso en cualquier punto
- Desacopla el emisor del receptor

---

### Ejercicio 9: Patron Command
Descripcion: Sistema de comandos para un personaje de videojuego. Cada accion es un comando independiente que el control ejecuta sin conocer su implementacion.

Componentes principales:
- Comando: Interfaz con metodo ejecutar
- ComandoCaminar, ComandoSaltar, ComandoAtacar, ComandoDefender: Comandos concretos
- Personaje: Receptor que ejecuta las acciones
- ControlJuego: Emisor que activa los comandos

Aprendizajes:
- Convierte solicitudes en objetos independientes
- Permite encolar y ejecutar operaciones
- Desacopla quien invoca de quien ejecuta
- Facilita agregar nuevos comandos sin modificar el control

---

### Ejercicio 10: Patron Iterator
Descripcion: Recorrido de lugares turisticos en Roma. El patron permite recorrer una coleccion sin conocer su estructura interna.

Diagrama UML: diagrama ejercicio 10.png

Componentes principales:
- Iterator: Interfaz con hasNext() y next()
- Aggregate: Interfaz para crear iteradores
- TourRoute: La coleccion que tiene los lugares
- RomeIterator: El iterador que recorre los lugares
- Lugar: Cada lugar turistico
- Tourist: El que usa el iterador para hacer el tour

Aprendizajes:
- El patron Iterator separa como recorres algo de como esta guardado
- Puedes tener varios recorridos al mismo tiempo sobre la misma coleccion
- La logica de recorrer queda en un objeto aparte
- Puedes cambiar como guardas las cosas sin afectar al que las usa

---

### Ejercicio 11: Patron Strategy
Descripcion: Aplicacion de navegacion que calcula rutas con diferentes algoritmos. El usuario puede cambiar la estrategia de calculo en tiempo de ejecucion.

Componentes principales:
- EstrategiaRuta: Interfaz comun para los algoritmos
- RutaCarro, RutaBicicleta, RutaCaminando, RutaTransportePublico: Estrategias concretas
- Navegador: Contexto que mantiene la estrategia actual

Aprendizajes:
- Permite cambiar algoritmos en tiempo de ejecucion
- Evita tener multiples clases similares con if/else
- Desacopla la logica del algoritmo del contexto
- Facilita agregar nuevas estrategias sin modificar el navegador

---

## Autoevaluacion Semanal

### Que entendia mal antes?
- Pensaba que para recorrer una coleccion siempre tenias que saber como estaba hecha por dentro
- No entendia para que servia separar la logica de recorrer en otra clase
- Creia que los patrones de comportamiento eran mas complicados de lo que son

### Que entiendo ahora?
- Los patrones de comportamiento se enfocan en la comunicacion entre objetos
- Chain of Responsibility permite crear pipelines de procesamiento flexibles
- Command encapsula acciones como objetos lo que da mucha flexibilidad
- Iterator te da una forma estandar de recorrer cosas sin importar como esten guardadas
- Strategy permite intercambiar algoritmos sin modificar quien los usa
- Las inner classes son utiles para hacer iteradores que necesitan acceder a lo interno de la coleccion

### Que me falta reforzar?
- Hacer iteradores que vayan para adelante y para atras
- Practicar el patron con estructuras mas complejas como arboles o grafos
- Implementar comandos con undo/redo
- Combinar varios patrones en un mismo proyecto
