# DOSW - Bitácora Técnica - Nicolás Parrado 2026

Bitácora técnica del curso DOSW. Este repositorio documenta el progreso semanal, ejercicios prácticos y autoevaluaciones del proceso de aprendizaje.

## Estructura del Proyecto

Este es un proyecto Maven organizado por semanas:

```
src/main/java/dosw/bitacora/
├── semana1/
│   ├── README.md
│   └── streams/
├── semana2/
│   ├── README.md
│   ├── solid/
│   └── patrones/
└── semana3/
    └── README.md
```

## Objetivo

Reforzar conceptos técnicos mediante práctica constante y documentación del proceso de aprendizaje, desarrollando la capacidad de aplicar, razonar y codificar soluciones de forma consistente.

## Contenido por Semana

- **[Semana 1](src/main/java/dosw/bitacora/semana1/)**: Streams en Java
- **[Semana 2](src/main/java/dosw/bitacora/semana2/)**: SOLID y Patrones de Diseño
- **[Semana 3](src/main/java/dosw/bitacora/semana3/)**: [Por definir]

## Metodología GitFlow

Cada semana se trabaja en una rama feature independiente:
- `feature/semana-1`
- `feature/semana-2`
- `feature/semana-3`

Las features se mezclan en `develop` al finalizar cada semana.

## Cómo ejecutar

```bash
# Compilar el proyecto
mvn compile

# Ejecutar un ejercicio específico
mvn exec:java -Dexec.mainClass="dosw.bitacora.semana1.streams.EjemploStreams"
```

## Autoevaluación

Cada semana incluye una autoevaluación en su README con:
- ¿Qué entendía mal antes?
- ¿Qué entiendo ahora?
- ¿Qué me falta reforzar?

---

**Estudiante:** Nicolás Parrado  
**Año:** 2026  
**Curso:** DOSW
