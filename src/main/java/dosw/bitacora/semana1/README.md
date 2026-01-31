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
- Pensaba que tenia que usar un for para recorrer listas, no sabia que los streams hacian eso automaticamente.
- Creia que filter y map eran lo mismo, me confundia cual usar.
- No entendia por que a veces usaba collect y otras veces forEach.
- Pensaba que el :: era un error de sintaxis, no sabia que era para referenciar metodos.

Que entiendo ahora?
- Los streams son como una cadena de pasos que se aplican a cada elemento de la lista.
- filter es para quedarse solo con algunos elementos, map es para cambiarlos.
- forEach es para imprimir o hacer algo con cada elemento al final.
- anyMatch sirve para preguntar si al menos uno cumple una condicion.
- peek es como un System.out.println en medio del stream para ver que esta pasando.

Que me falta reforzar?
- Practicar mas con objetos como Usuario y Transaction, todavia me cuesta un poco.
- Entender mejor cuando usar collect y cuando usar forEach.
- Aprender mas operaciones como allMatch y noneMatch.
- Practicar combinando varios filtros y maps juntos.
