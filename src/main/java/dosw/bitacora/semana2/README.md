# Semana 2 - SOLID y Patrones de Diseno

## Ejercicios realizados

### SOLID

#### Ejercicio 1: Calculadora con SOLID
Descripcion: Hice una calculadora que aplica los principios SOLID. Cada operacion como suma, resta, multiplicacion y division esta en su propia clase y todas implementan la interfaz Operacion. Asi puedo agregar nuevas operaciones sin tocar la calculadora.

Codigo: Ver solid reto4

Aprendizajes:
- Cada clase debe tener una sola responsabiliad
- Las interfaces permiten extender funcionalidad sin modificar codigo existente
- El polimorfismo hace el codigo mas flexible y mantenible

---

### Patrones de Diseno

#### Reto 1: Factory Method
Descripcion: Sistema de notificaciones que puede enviar mensajes por email, SMS o push. Use Factory Method para crear las notificaciones sin que el codigo principal dependa de las clases concretas.

Codigo: Ver patrones reto1

Aprendizajes:
- El Factory encapsula la creacion de objetos
- El codigo cliente no necesita saber que clase concreta esta usando
- Facilita agregar nuevos tipos de notificaciones

#### Reto 2: Adapter
Descripcion: Tenia dos impresoras que funcionan diferente, una simple y una detallada. Use Adapter para que ambas se puedan usar de la misma forma sin modificar las clases originales.

Codigo: Ver patrones reto2

Aprendizajes:
- El Adapter permite que clases incompatibles trabajen juntas
- No necesitas modificar codigo existente para adaptarlo
- Util cuando trabajas con codigo legacy o librerias externas

#### Reto 3: Memento
Descripcion: Editor que puede guardar estados del texto y restaurarlos para deshacer cambios. El Memento guarda el estado sin exponer los detalles internos del editor.

Codigo: Ver patrones reto3

Aprendizajes:
- Memento permite guardar y restaurar estados de objetos
- Mantiene el encapsulamiento del objeto original
- Util para implementar funcionalidades de deshacer

---

## Autoevaluacion Semanal

### Que entendia mal antes?
- Pensaba que los patrones de diseno eran complicados y solo para proyectos grandes
- Creia que SOLID era solo teoria sin aplicacion practica

### Que entiendo ahora?
- Los patrones de diseno son soluciones simples a problemas comunes
- SOLID hace que el codigo sea mas facil de mantener y extender
- Separar responsabilidades y usar interfaces hace el codigo mas flexible

### Que me falta reforzar?
- Practicar mas identificando cuando usar cada patron en situaciones reales
- Aplicar todos los principios SOLID juntos en un mismo proyecto
