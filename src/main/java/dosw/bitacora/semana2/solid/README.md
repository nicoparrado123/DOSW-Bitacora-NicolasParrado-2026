# Respuestas SOLID - Semana 2

## 1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?

El polimorfismo te permite que diferentes objetos respondan al mismo método pero de forma distinta, sin tener que usar un montón de if o switch. Por ejemplo, en vez de preguntar "¿eres un perro o un gato?" y luego hacer algo diferente según la respuesta, simplemente llamas al método hacerSonido() y cada animal sabe qué hacer. Esto hace que el código sea más limpio, fácil de mantener y si quieres agregar un nuevo animal, solo creas la clase sin tocar el código que ya funciona.

## 2. ¿Por qué una clase inmutable puede mejorar la seguridad?

Una clase inmutable no se puede modificar después de crearla, entonces nadie puede cambiar sus valores por error o de forma maliciosa. Esto es útil cuando compartes objetos entre diferentes partes del programa porque sabes que siempre van a tener los mismos valores. También ayuda cuando trabajas con hilos porque no hay riesgo de que dos hilos modifiquen el mismo objeto al mismo tiempo.

## 3. ¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?

Si los atributos son públicos, cualquiera puede cambiarlos directamente sin ningún control. Esto puede causar problemas como poner valores inválidos (por ejemplo, una edad negativa o un precio de -100), romper las reglas del negocio, y hace que sea muy difícil cambiar cómo funciona la clase por dentro sin romper todo el código que la usa. Con getters y setters puedes validar los datos antes de guardarlos.

## 4. ¿Según el principio de Abierto/Cerrado, como deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?

Deberías usar interfaces o clases abstractas para extender el comportamiento. En vez de modificar las clases que ya existen, creas nuevas clases que implementen las interfaces o hereden de las clases base. Así agregas funcionalidad nueva sin tocar el código que ya funciona. Por ejemplo, si tienes una calculadora y quieres agregar una nueva operación, solo creas una nueva clase que implemente la interfaz Operacion, sin modificar la calculadora.

## 5. ¿Por qué es importante que una clase cumpla con el Principio de única responsabilidad y que ejemplo sencillo podrías dar donde se vulnere?

Es importante porque hace que el código sea más fácil de entender, mantener y probar. Si una clase hace muchas cosas, cuando algo falla no sabes qué parte está mal, y si necesitas cambiar algo, puedes romper otras funcionalidades sin querer.

Ejemplo donde se vulnera: Una clase Usuario que maneja los datos del usuario (nombre, email, edad) y además se encarga de guardarse en la base de datos. Debería haber dos clases: Usuario (solo maneja los datos) y UsuarioRepository (se encarga de guardar en la base de datos).

## 6. ¿Qué es y porque usamos el pom.xml?

El pom.xml es el archivo de configuración de Maven donde defines todo lo que necesita tu proyecto: las dependencias (librerías externas), los plugins, la versión de Java que usas, y la información básica del proyecto como el nombre y la versión. Lo usamos porque Maven gestiona automáticamente las dependencias y la compilación del proyecto sin tener que descargar e instalar todo manualmente.

## 7. ¿Qué diferencia hay entre mvn compile, mvn package y mvn install?

- mvn compile: Solo compila el código fuente (.java -> .class) y lo pone en la carpeta target/classes
- mvn package: Compila el código y además crea el archivo empaquetado (.jar o .war) listo para distribuir
- mvn install: Hace todo lo anterior y además instala el .jar en tu repositorio local de Maven (~/.m2/repository) para que otros proyectos en tu máquina puedan usarlo

## 8. ¿Qué diferencia existe entre una interfaz y una clase abstracta?

Una interfaz es como un contrato que dice "estas son las cosas que debes hacer" pero no dice cómo hacerlas. No tiene constructores ni atributos normales, solo define métodos que las clases deben implementar.

Una clase abstracta es como una plantilla que puede tener código compartido, constructores, atributos normales y métodos ya implementados. Se usa cuando varias clases comparten código en común.

La diferencia principal es que una clase solo puede heredar de una clase abstracta, pero puede implementar múltiples interfaces.
