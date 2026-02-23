# Semana 3 - Patrones de Diseño

## Ejercicios realizados

### Ejercicio 1: Patron Factory Method
Descripcion: Sistema de pagos donde puedes pagar con tarjeta, PayPal o transferencia. Cada forma de pago se crea con su propia fabrica.

Que hace:
- Tienes diferentes fabricas para crear cada tipo de pago
- Cada fabrica sabe como crear su tipo de pago especifico
- El codigo que usa los pagos no necesita saber como se crean

Aprendizajes:
- Factory Method te deja crear objetos sin decir exactamente que clase vas a usar
- Cada fabrica se encarga de crear un tipo especifico de objeto
- Es facil agregar nuevos tipos de pago sin tocar el codigo existente

---

### Ejercicio 2: Patron Abstract Factory
Descripcion: Motor de juego que funciona para PlayStation y Xbox. Cada consola tiene su propio control, juego e interfaz grafica.

Que hace:
- Una fabrica para PlayStation que crea todo lo de PlayStation
- Una fabrica para Xbox que crea todo lo de Xbox
- El motor del juego usa la fabrica sin importar cual consola sea

Aprendizajes:
- Abstract Factory crea familias completas de objetos relacionados
- Garantiza que todos los componentes sean compatibles entre si
- Cambiar de una familia a otra es solo cambiar la fabrica

---

### Ejercicio 3: Patron Builder
Descripcion: Construccion de muñecos de accion y muñecas clasicas. Cada uno se construye paso a paso con diferentes caracteristicas.

Que hace:
- Un builder para muñecos de accion con armas y accesorios
- Un builder para muñecas clasicas con vestidos y peinados
- Un director que coordina el proceso de construccion

Aprendizajes:
- Builder separa la construccion de un objeto complejo de su representacion
- Puedes crear diferentes versiones del mismo objeto usando el mismo proceso
- El director controla el orden de construccion

---

### Ejercicio 4: Patron Adapter
Descripcion: Sistema de carga para vehiculos electricos y surtidor para vehiculos de combustion. Los cargadores tienen interfaces diferentes pero el sistema central necesita usarlos igual.

Que hace:
- Adapters que convierten la interfaz de los cargadores a lo que el sistema espera
- El sistema central puede usar cualquier cargador sin saber sus diferencias
- Los surtidores tambien se adaptan para funcionar con el sistema

Aprendizajes:
- Adapter permite que clases con interfaces incompatibles trabajen juntas
- No necesitas modificar el codigo existente de las clases
- Es como un traductor entre dos sistemas diferentes

---

### Ejercicio 5: Patron Bridge
Descripcion: Formas geometricas que pueden tener diferentes colores. Las formas y los colores estan separados para poder combinarlos libremente.

Que hace:
- Formas como circulo y cuadrado
- Colores como rojo, azul y verde
- Puedes combinar cualquier forma con cualquier color

Aprendizajes:
- Bridge separa la abstraccion de su implementacion
- Puedes cambiar formas y colores independientemente
- Evita tener que crear una clase para cada combinacion posible

---

### Ejercicio 6: Patron Composite
Descripcion: Sistema de bodega con productos y cajas. Las cajas pueden contener productos u otras cajas, y puedes calcular el precio total de todo.

Que hace:
- Productos individuales con su precio
- Cajas que pueden contener productos u otras cajas
- Calcular el precio total de una caja suma todo lo que tiene adentro

Aprendizajes:
- Composite te deja tratar objetos individuales y grupos de la misma forma
- Puedes crear estructuras de arbol con objetos
- Es perfecto para jerarquias parte-todo

---

### Ejercicio 7: Patron Decorator
Descripcion: Barco basico al que le puedes agregar mejoras como radar, misiles, blindaje y sistema antitorpedos. Cada mejora añade funcionalidad.

Que hace:
- Un barco basico con ataque y defensa inicial
- Decoradores que envuelven el barco y le agregan capacidades
- Puedes apilar mejoras una sobre otra

Aprendizajes:
- Decorator añade funcionalidad a objetos sin modificar su clase
- Puedes combinar decoradores para crear muchas variaciones
- Es mas flexible que usar herencia para agregar funcionalidad

---

### Ejercicio 8: Patron Chain of Responsibility
Descripcion: Control migratorio para entrar a Estados Unidos. Pasas por varios controles y si uno te rechaza, no sigues.

Que hace:
- Cada control revisa algo diferente: pasaporte, antecedentes, motivo de viaje
- Si pasas un control, vas al siguiente
- Si te rechazan en uno, ahi se acaba todo
- La persona no sabe en cual control fallo

Aprendizajes:
- Chain of Responsibility pasa una solicitud por una cadena de manejadores
- Cada uno decide si la procesa o la pasa al siguiente
- Puedes detener la cadena en cualquier momento
- Los manejadores no necesitan saber quien viene despues

---

### Ejercicio 9: Patron Command
Descripcion: Personaje de videojuego que puede caminar, saltar, atacar y defenderse. Cada accion es un boton que ejecuta un comando.

Que hace:
- Cada accion del personaje es un comando separado
- El control del juego solo presiona botones
- No le importa que hace cada boton, solo lo ejecuta
- Puedes cambiar que hace cada boton facilmente

Aprendizajes:
- Command convierte acciones en objetos
- Separa quien pide la accion de quien la ejecuta
- Puedes guardar comandos, hacer cola con ellos o deshacerlos
- Agregar nuevas acciones es super facil

---

### Ejercicio 10: Patron Iterator
Descripcion: Tour turistico por Roma visitando lugares famosos. El patron te deja recorrer los lugares sin saber como estan guardados.

Diagrama UML: diagrama ejercicio 10.png

Que hace:
- Una lista de lugares turisticos en Roma
- Un iterador que va de lugar en lugar
- El turista usa el iterador para hacer el recorrido
- No importa si los lugares estan en un array, lista o lo que sea

Aprendizajes:
- Iterator separa como recorres algo de como esta guardado
- Puedes tener varios recorridos al mismo tiempo
- La logica de recorrer queda en un objeto aparte
- Si cambias como guardas los datos, el que los usa no se entera

---

### Ejercicio 11: Patron Strategy
Descripcion: App de navegacion tipo Google Maps que calcula rutas. Puedes elegir ir en carro, bici, caminando o en transporte publico.

Que hace:
- Cada forma de transporte calcula la ruta diferente
- El navegador usa la estrategia que le digas
- Puedes cambiar de estrategia cuando quieras
- El navegador no necesita saber como funciona cada estrategia

Aprendizajes:
- Strategy te deja cambiar algoritmos en tiempo de ejecucion
- Evitas tener un monton de ifs para cada caso
- Cada algoritmo esta en su propia clase
- Agregar nuevas formas de calcular rutas es facil

---

## Autoevaluacion Semanal

### Que entendia mal antes?
- Pensaba que los patrones eran solo teoria y no se usaban en la vida real
- Creia que usar patrones hacia el codigo mas complicado
- No entendia cuando usar cada patron
- Pensaba que tenia que memorizar todos los patrones

### Que entiendo ahora?
- Los patrones resuelven problemas comunes que aparecen todo el tiempo
- Hacen el codigo mas facil de mantener y extender
- Cada patron tiene un proposito especifico y casos de uso claros
- Los patrones creacionales se enfocan en como crear objetos
- Los patrones estructurales organizan como se relacionan las clases
- Los patrones de comportamiento manejan la comunicacion entre objetos
- No necesitas saber todos, solo los que vas usando

### Que me falta reforzar?
- Practicar combinando varios patrones en un mismo proyecto
- Identificar cuando usar cada patron en situaciones reales
- Hacer ejercicios mas complejos que mezclen patrones
- Ver ejemplos de patrones en frameworks y librerias conocidas
