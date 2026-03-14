# Refuerzo de Patrones de Diseño - Nico

Bueno, acá está el refuerzo de patrones de diseño. La idea era combinar varios patrones en un mismo sistema para ver cómo trabajan juntos y resolver problemas reales.

## Ejercicio 1: Sistema de Notificaciones

Imaginate que tenés una app que necesita mandar notificaciones a los usuarios. Pero no siempre querés mandarlas de la misma forma, a veces por email, a veces por SMS, a veces por push. Y además, no querés tener mil instancias del servicio de notificaciones dando vueltas por todos lados.

### Qué patrones use?

**Singleton** - Básicamente hice que el Servicionico sea único en todo el sistema. No importa cuántas veces lo llames, siempre te va a dar la misma instancia. Así evitás tener servicios duplicados y todo queda centralizado.

**Strategy** - Acá está lo copado. Podés cambiar el tipo de notificación cuando quieras sin tocar el código del servicio. Tenés Emailnico, SMSnico y Pushnico, y cada uno sabe cómo enviar su tipo de notificación. Si mañana querés agregar notificaciones por Telegram, solo creás una clase nueva y listo.

### Las clases

- `Notificonico` - La interfaz que define cómo se envía una notificación
- `Emailnico`, `SMSnico`, `Pushnico` - Las diferentes formas de notificar
- `Servicionico` - El servicio único que coordina todo
- `ServicionicoTest` - Las pruebas para verificar que todo funciona

---

## Ejercicio 2: Sistema de Procesamiento de Pagos

Este es más complejo. Tenés una tienda online que acepta pagos por PayPal, Stripe, tarjeta de crédito, lo que sea. El tema es que cada proveedor tiene su propia forma de hacer las cosas, sus propios métodos y todo. Y encima, antes de procesar cualquier pago, tenés que validar un montón de cosas: que haya saldo, que no sea fraude, que no se pase del límite, etc.

### Qué patrones use?

**Adapter** - Cada proveedor de pago habla su propio idioma. PayPal tiene un método `enviarPago()`, Stripe tiene `charge()`, y así. Los adapters (PayPalAdapternico y StripeAdapternico) traducen todo eso a una interfaz común que nuestro sistema entiende. Es como un traductor universal.

**Chain of Responsibility** - Las validaciones se ejecutan en cadena, una tras otra. Primero valida el saldo (Saldonico), después el fraude (Fraudenico), y por último el límite (Limitnico). Si alguna falla, se corta todo y no se procesa el pago. Si todas pasan, seguís adelante. Lo bueno es que podés agregar o sacar validaciones fácilmente sin romper nada.

**Facade** - El Sistemico es como la cara visible de todo esto. Vos solo llamás a `procesarPago()` y él se encarga de coordinar las validaciones y el procesamiento. No tenés que saber cómo funciona todo por dentro, solo usás el sistema y listo.

### Las clases

- `Procesadornico` - La interfaz común para todos los procesadores de pago
- `PayPalnico`, `Stripenico` - Las APIs externas de cada proveedor
- `PayPalAdapternico`, `StripeAdapternico` - Los adaptadores que traducen las APIs
- `Validonico` - La clase base para las validaciones en cadena
- `Saldonico`, `Fraudenico`, `Limitnico` - Las validaciones concretas
- `Sistemico` - El que coordina todo
- `SistemicopTest` - Las pruebas del sistema


