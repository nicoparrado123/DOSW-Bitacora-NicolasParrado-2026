# Semana 3 - Patrones de Diseño

## Ejercicios realizados

### Ejercicio 10: Patron Iterator
Descripcion: Hice un ejercicio del patron Iterator para recorrer lugares turisticos en Roma. Basicamente el patron te deja recorrer una coleccion sin tener que saber como esta hecha por dentro.

Diagrama UML: iagrama ejercicio 10.png

Componentes principales:
- Iterator:Interfaz con hasNext() y next()
- Aggregate: Interfaz para crear iteradores
- TourRoute: La coleccion que tiene los lugares
- RomeIterator: El iterador que recorre los lugares 
- Place: Cada lugar turistico
- Tourist: El que usa el iterador para hacer el tour

Aprendizajes:
- El patron Iterator separa como recorres algo de como esta guardado
- Puedes tener varios recorrids al mismo tiempo sobre la misma coleccion
- La logica de recorrer queda en un objetp aparte
- Puedes cambiar como guardas las cosas sin afectar al que las usa

---

## Autoevaluacion Semanal

### Que entendia mal antes?
- Pensaba que para recorrer una coleccion siempre tenias que saber como estaba hecha por dentro
- No entendia para que servia separar la logica de recorrer en otra clase

### Que entiendo ahora?
- El patron Iterator te da una forma estandar de recorrer cosas sin importar como esten guardadas
- Las inner classes son utiles para hacer iteradores que necesitan acceder a lo interno de la coleccion
- El patron sigue el principio de responsabilidad unica: la coleccion guarda los datos, el iterador los recorre

### Que me falta reforzar?
- Hacer iteradores que vayan para adelantey para atras
- Practicar el patron con estructuras mas complejas como arboles o grafos
