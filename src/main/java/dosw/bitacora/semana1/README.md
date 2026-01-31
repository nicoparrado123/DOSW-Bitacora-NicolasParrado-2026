Semana 1 - Streams en Java

Ejercicios realizados

Ejercicio 1: Numeros pares mayores a 10
Descripcion: Dada una lista de numeros enteros, obtener una nueva lista solo con los numeros pares mayores a diez.

Codigo: Ver streams/Ejercicio1ParesMAyoresDiez.java

Aprendizajes:
- Uso de filter para filtrar elementos
- Encadenar multiples filtros
- Uso de collect para obtener una lista

---

Ejercicio 2: Palabras en mayusculas
Descripcion: Filtrar palabras con mas de 4 caracteres, convertirlas en mayusculas, ordenarlas alfabeticamente y contar el total.

Codigo: Ver streams/Ejercicio2PalabrasMayusculas.java

Aprendizajes:
- Uso de map para transformar elementos
- Uso de sorted para ordenar
- Uso de peek para ver elementos durante el proceso
- Uso de count para contar elementos

---

Ejercicio 3: Usuarios activos
Descripcion: Filtrar usuarios activos, obtener nombres en mayuscula y ordenar alfabeticamente.

Codigo: Ver streams/Ejercicio3UsuariosActivos.java

Aprendizajes:
- Trabajar con objetos personalizados
- Uso de metodos de referencia (Usuario::isActive)
- Combinar filter, map y sorted

---

Ejercicio 4: Mayores de edad
Descripcion: Filtrar personas mayores de edad y obtener sus nombres.

Codigo: Ver streams/Ejercicio4MayoresEdad.java

Aprendizajes:
- Filtrar por atributos numericos
- Extraer propiedades especificas de objetos

---

Ejercicio 5: Validacion de transacciones
Descripcion: Procesar transacciones bancarias, usar peek para ver cada una, verificar si hay transacciones no aprobadas y determinar si el lote es valido.

Codigo: Ver streams/Ejercicio5Transacciones.java

Aprendizajes:
- Uso de peek para debugging
- Uso de anyMatch para verificar condiciones
- Logica de negocio con streams

---

Autoevaluacion Semanal

Que entendia mal antes?
- Al principio pensaba que los streams modificaban la lista original, pero en realidad crean un nuevo flujo de datos sin alterar la fuente.
- Confundia cuando usar map y cuando usar filter. Ahora entiendo que filter es para seleccionar elementos y map es para transformarlos.
- No entendia bien para que servia peek, pensaba que era lo mismo que forEach.

Que entiendo ahora?
- Los streams son una forma declarativa de procesar colecciones, mas legible que los bucles tradicionales.
- Puedo encadenar multiples operaciones intermedias (filter, map, sorted) y terminar con una operacion terminal (collect, count, anyMatch).
- peek es util para debugging porque me permite ver los elementos sin consumir el stream.
- anyMatch es perfecto para validaciones, retorna true si al menos un elemento cumple la condicion.

Que me falta reforzar?
- Practicar mas con flatMap para trabajar con listas anidadas.
- Entender mejor las diferencias entre anyMatch, allMatch y noneMatch.
- Mejorar en el uso de Collectors mas avanzados como groupingBy y partitioningBy.
- Practicar mas con streams de objetos complejos y multiples filtros.
