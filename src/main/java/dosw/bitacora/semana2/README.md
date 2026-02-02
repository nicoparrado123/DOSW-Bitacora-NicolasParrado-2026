# Semana 2 - SOLID y Patrones de Diseño

## Ejercicios realizados

### SOLID

#### Ejercicio 1: Calculadora con SOLID
**Descripción:** Implementé una calculadora que aplica los principios SOLID. Cada operación (suma, resta, multiplicación, división) está en su propia clase y todas implementan la interfaz Operacion. Así puedo agregar nuevas operaciones sin modificar la calculadora.

**Código:** Ver `solid/reto4/`

**Aprendizajes:**
- Cada clase debe tener una sola responsabilidad
- Las interfaces permiten extender funcionalidad sin modificar código existente
- El polimorfismo hace el código más flexible y mantenible

---

### Patrones de Diseño

#### Reto 1: Factory Method (Notificaciones)
**Descripción:** Sistema de notificaciones que puede enviar mensajes por email, SMS o push. Usé Factory Method para crear las notificaciones sin que el código principal dependa de las clases concretas.

**Código:** Ver `patrones/reto1/`

**Aprendizajes:**
- El Factory encapsula la creación de objetos
- El código cliente no necesita saber qué clase concreta está usando
- Facilita agregar nuevos tipos de notificaciones

#### Reto 2: Adapter (Impresoras)
**Descripción:** Tenía dos impresoras que funcionan diferente (una simple y una detallada). Usé Adapter para que ambas se puedan usar de la misma forma sin modificar las clases originales.

**Código:** Ver `patrones/reto2/`

**Aprendizajes:**
- El Adapter permite que clases incompatibles trabajen juntas
- No necesitas modificar código existente para adaptarlo
- Útil cuando trabajas con código legacy o librerías externas

#### Reto 3: Memento (Editor de texto)
**Descripción:** Editor que puede guardar estados del texto y restaurarlos (deshacer cambios). El Memento guarda el estado sin exponer los detalles internos del editor.

**Código:** Ver `patrones/reto3/`

**Aprendizajes:**
- Memento permite guardar y restaurar estados de objetos
- Mantiene el encapsulamiento del objeto original
- Útil para implementar funcionalidades de undo/redo

---

## Autoevaluación Semanal

### ¿Qué entendía mal antes?
- Pensaba que los patrones de diseño eran complicados y solo para proyectos grandes
- Creía que SOLID era solo teoría sin aplicación práctica

### ¿Qué entiendo ahora?
- Los patrones de diseño son soluciones simples a problemas comunes
- SOLID hace que el código sea más fácil de mantener y extender
- Separar responsabilidades y usar interfaces hace el código más flexible

### ¿Qué me falta reforzar?
- Practicar más identificando cuándo usar cada patrón en situaciones reales
- Aplicar todos los principios SOLID juntos en un mismo proyecto
