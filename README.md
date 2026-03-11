# Refuerzo - Combinación de Patrones de Diseño

## Ejercicio 1: Sistema de Notificaciones

### Patrones Utilizados

#### 1. Strategy (Estrategia)
- **Tipo**: Patrón de Comportamiento
- **Justificación**: Permite cambiar dinámicamente el tipo de notificación (Email, SMS, Push) sin modificar el código del servicio. Cada canal de notificación es una estrategia diferente que implementa la misma interfaz.

#### 2. Singleton
- **Tipo**: Patrón Creacional
- **Justificación**: Garantiza que solo exista una instancia del ServicioNotificaciones en todo el sistema, evitando múltiples instancias y centralizando el envío de notificaciones.

### Cómo funciona
- El ServicioNotificaciones es único (Singleton)
- Puedes cambiar el canal de notificación en cualquier momento (Strategy)
- Agregar nuevos canales solo requiere crear una nueva clase que implemente Notificacion

---

## Ejercicio 2: Sistema de Procesamiento de Pagos

### Patrones Utilizados

#### 1. Adapter (Adaptador)
- **Tipo**: Patrón Estructural
- **Justificación**: Cada proveedor de pago (PayPal, Stripe) tiene su propia API con métodos diferentes. El Adapter convierte estas APIs externas a una interfaz común (ProcesadorPago) que nuestro sistema entiende.

#### 2. Chain of Responsibility (Cadena de Responsabilidad)
- **Tipo**: Patrón de Comportamiento
- **Justificación**: Las validaciones (saldo, fraude, límite) se ejecutan en cadena. Cada validador decide si el proceso continúa o se detiene. Puedes agregar o quitar validaciones fácilmente sin afectar el resto del código.

#### 3. Facade (Fachada)
- **Tipo**: Patrón Estructural
- **Justificación**: SistemaPagos simplifica el uso del sistema completo. El usuario solo llama a procesarPago() y el sistema internamente coordina las validaciones y el procesamiento.

### Cómo funciona
- Los Adapters traducen las APIs externas a nuestra interfaz
- La cadena de validadores verifica el pago paso a paso
- El Facade (SistemaPagos) coordina todo el proceso de forma simple

---

## Ejecutar las Pruebas

```bash
mvn clean test
```

## Generar Reporte de Cobertura con Jacoco

```bash
mvn clean test jacoco:report
```

El reporte se genera en: `target/site/jacoco/index.html`

## Análisis Estático con SonarQube

```bash
mvn clean verify sonar:sonar
```
