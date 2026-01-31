DOSW - Bitacora Tecnica - Nicolas Parrado 2026

Bitacora tecnica del curso DOSW. Este repositorio documenta el progreso semanal, ejercicios practicos y autoevaluaciones del proceso de aprendizaje.

Estructura del Proyecto

Este es un proyecto Maven organizado por semanas:

src/main/java/dosw/bitacora/
- semana1/
  - README.md
  - streams/
- semana2/
  - README.md
  - solid/
  - patrones/
- semana3/
  - README.md

Objetivo

Reforzar conceptos tecnicos mediante practica constante y documentacion del proceso de aprendizaje, desarrollando la capacidad de aplicar, razonar y codificar soluciones de forma consistente.

Contenido por Semana

- Semana 1: Streams en Java
- Semana 2: SOLID y Patrones de Diseno
- Semana 3: Por definir

Metodologia GitFlow

Cada semana se trabaja en una rama feature independiente:
- feature/semana-1
- feature/semana-2
- feature/semana-3

Las features se mezclan en develop al finalizar cada semana.

Como ejecutar

Compilar el proyecto:
mvn compile

Ejecutar un ejercicio especifico:
mvn exec:java -Dexec.mainClass="dosw.bitacora.semana1.streams.EjemploStreams"

Autoevaluacion

Cada semana incluye una autoevaluacion en su README con:
- Que entendia mal antes?
- Que entiendo ahora?
- Que me falta reforzar?

Estudiante: Nicolas Parrado
Ano: 2026
Curso: DOSW
