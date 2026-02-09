# Semana 3 - Patrones de Diseño

## Ejercicios realizados

### Ejercicio 10: Patrón Iterator
**Descripción:** Implementación del patrón Iterator para recorrer una colección de lugares turísticos en Roma. El patrón permite acceder secuencialmente a los elementos de una colección sin exponer su representación interna.

**Diagrama UML:** Ver `diagrama ejercicio 10.png`

**Componentes principales:**
- `Iterator<T>`: Interfaz que define los métodos hasNext() y next()
- `Aggregate<T>`: Interfaz para crear iteradores
- `TourRoute`: Colección concreta que implementa Aggregate
- `RomeIterator`: Iterador concreto (inner class) que recorre los lugares
- `Place`: Clase que representa cada lugar turístico
- `Tourist`: Cliente que usa el iterador para explorar el tour

**Aprendizajes:**
- El patrón Iterator desacopla el algoritmo de recorrido de la estructura de datos
- Permite múltiples recorridos simultáneos sobre la misma colección
- Encapsula la lógica de iteración dentro de un objeto separado
- Facilita cambiar la implementación interna de la colección sin afectar al cliente

---

## Autoevaluación Semanal

### ¿Qué entendía mal antes?
- Pensaba que siempre era necesario exponer la estructura interna de una colección para recorrerla
- No comprendía la ventaja de separar la lógica de iteración en una clase aparte

### ¿Qué entiendo ahora?
- El patrón Iterator proporciona una forma uniforme de acceder a elementos sin conocer la implementación
- Las inner classes son útiles para encapsular iteradores que necesitan acceso a la estructura interna
- El patrón sigue el principio de responsabilidad única: la colección maneja los datos, el iterador maneja el recorrido

### ¿Qué me falta reforzar?
- Implementar iteradores bidireccionales y con filtros
- Practicar el patrón con estructuras de datos más complejas (árboles, grafos)
