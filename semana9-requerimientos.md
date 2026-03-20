# Analisis de requerimientos - Plataforma Bakugan

## 1. Identificacion de requerimientos

### Explicitos (lo que dice el enunciado)

- Los usuarios coleccionan criaturas Bakugan
- Los usuarios mejoran sus criaturas
- Hay combates estrategicos entre jugadores
- Tiene mecanicas de progresion
- Tiene gestion de inventario
- Los combates no son en tiempo real
- Los resultados deben ser consistentes
- Debe haber balance entre criaturas y habilidades
- Emparejamientos justos entre jugadores
- Persistencia de informacion de partidas
- Facil de evolucionar a futuro

### Implicitos (cosas que se asumen)

- Registro de usuarios
- Login y autenticacion
- Perfil de usuario
- Sistema de niveles o experiencia
- Historial de combates
- Estadisticas de victorias/derrotas
- Visualizacion de caracteristicas de criaturas
- Sistema de recursos para mejoras
- Validacion de reglas de combate
- Notificaciones de resultados
- Proteccion de datos
- Respaldos de informacion

## 2. Clasificacion

### Funcionales

**RF01** - El sistema permite registrar usuarios con email y contraseña
- Es funcional porque define una accion especifica que hace el sistema

**RF02** - El sistema permite hacer login con credenciales
- Es funcional porque es una operacion concreta del sistema

**RF03** - El sistema muestra la coleccion de criaturas del usuario
- Es funcional porque es una funcionalidad visible para el usuario

**RF04** - El sistema permite obtener nuevas criaturas
- Es funcional porque define como se adquieren las criaturas

**RF05** - El sistema permite mejorar criaturas usando recursos
- Es funcional porque describe una mecanica del juego

**RF06** - El sistema calcula las mejoras aplicadas a las criaturas
- Es funcional porque procesa datos de forma especifica

**RF07** - El sistema permite seleccionar criaturas para combate
- Es funcional porque es una accion del usuario en el sistema

**RF08** - El sistema busca un oponente de nivel similar
- Es funcional porque define el comportamiento del matchmaking

**RF09** - El sistema ejecuta el combate aplicando reglas definidas
- Es funcional porque es la mecanica principal del juego

**RF10** - El sistema calcula el resultado del combate
- Es funcional porque procesa quien gana o pierde

**RF11** - El sistema otorga recompensas al ganador
- Es funcional porque define que pasa despues del combate

**RF12** - El sistema guarda el historial de combates
- Es funcional porque almacena datos especificos

**RF13** - El sistema muestra estadisticas del jugador
- Es funcional porque presenta informacion al usuario

**RF14** - El sistema valida que las criaturas cumplan las reglas
- Es funcional porque verifica condiciones antes de permitir acciones

### No funcionales

**RNF01** - El sistema responde en menos de 3 segundos
- Es no funcional porque define un requisito de rendimiento

**RNF02** - El sistema encripta las contraseñas
- Es no funcional porque es un requisito de seguridad

**RNF03** - El sistema funciona en Chrome, Firefox y Safari
- Es no funcional porque define compatibilidad

**RNF04** - El sistema hace respaldos diarios automaticos
- Es no funcional porque es un requisito de confiabilidad

**RNF05** - El sistema garantiza resultados reproducibles en combates
- Es no funcional porque define consistencia del sistema

**RNF06** - El sistema tiene arquitectura modular
- Es no funcional porque define como esta construido

**RNF07** - El sistema es responsive para moviles
- Es no funcional porque define usabilidad

**RNF08** - El sistema previene inyeccion SQL
- Es no funcional porque es requisito de seguridad

## 3. Priorizacion

### Alta prioridad

- **RF01** (Registro) - sin usuarios no hay plataforma, es la base
- **RF02** (Login) - necesario para acceder a todo
- **RF03** (Ver coleccion) - funcionalidad principal del producto
- **RF04** (Obtener criaturas) - sin esto no hay juego
- **RF07** (Seleccionar para combate) - necesario para pelear
- **RF09** (Ejecutar combate) - es la mecanica core
- **RF10** (Calcular resultado) - define quien gana
- **RF12** (Guardar historial) - persistencia critica
- **RNF02** (Encriptar contraseñas) - seguridad basica obligatoria
- **RNF05** (Resultados reproducibles) - genera confianza en el sistema

### Media prioridad

- **RF05** (Mejorar criaturas) - importante para retencion pero puede venir despues
- **RF06** (Calcular mejoras) - depende de RF05
- **RF08** (Matchmaking) - importante pero puede ser basico al inicio
- **RF11** (Dar recompensas) - motiva pero no bloquea funcionalidad
- **RF13** (Ver estadisticas) - valor agregado
- **RF14** (Validar reglas) - puede empezar simple
- **RNF01** (Tiempo respuesta) - se optimiza despues
- **RNF03** (Compatibilidad) - puede empezar con un navegador
- **RNF04** (Respaldos) - importante pero no urgente al inicio
- **RNF07** (Responsive) - puede ser fase 2

### Baja prioridad

- **RNF06** (Arquitectura modular) - beneficio a largo plazo
- **RNF08** (Prevenir ataques) - se refuerza con el tiempo

## 4. Dependencias y bloqueos

### Dependencias

```
RF01 (Registro) 
  └─> RF02 (Login)
       └─> RF03 (Ver coleccion)
       └─> RF07 (Seleccionar criaturas)

RF04 (Obtener criaturas)
  └─> RF03 (Ver coleccion)
  └─> RF05 (Mejorar criaturas)

RF05 (Mejorar criaturas)
  └─> RF06 (Calcular mejoras)

RF07 (Seleccionar criaturas)
  └─> RF08 (Matchmaking)
       └─> RF09 (Ejecutar combate)
            └─> RF10 (Calcular resultado)
                 └─> RF11 (Dar recompensas)
                 └─> RF12 (Guardar historial)
```

### Bloqueos potenciales

**Falta definicion de reglas de combate**
- Bloquea: RF09, RF10, RF14
- Sin reglas claras no se puede programar la logica
- Solucion: definir reglas basicas en reunion con cliente

**Sistema de balance no definido**
- Bloquea: RF04, RF05, RF08
- Si no hay balance el juego no funciona bien
- Solucion: empezar con pocas criaturas y balancear de a poco

**Algoritmo de matchmaking**
- Bloquea: RF08
- Emparejamientos malos frustran usuarios
- Solucion: usar sistema simple por nivel al inicio

**Infraestructura de base de datos**
- Bloquea: RF12, RNF04
- Sin BD no hay persistencia
- Solucion: definir esquema desde el inicio

**Mecanicas de progresion**
- Bloquea: RF05, RF06, RF11
- Progresion mal diseñada afecta retencion
- Solucion: investigar juegos similares

## 5. Matriz de trazabilidad

| ID | Tipo | Prioridad | Modulo | Prueba | Dependencias |
|----|------|-----------|--------|--------|--------------|
| RF01 | Funcional | Alta | Usuarios | Crear usuario y verificar en BD | - |
| RF02 | Funcional | Alta | Autenticacion | Login correcto e incorrecto | RF01 |
| RF03 | Funcional | Alta | Coleccion | Listar criaturas del usuario | RF02 |
| RF04 | Funcional | Alta | Coleccion | Obtener criatura y verificar | RF02 |
| RF05 | Funcional | Media | Progresion | Mejorar y verificar recursos | RF04 |
| RF06 | Funcional | Media | Progresion | Verificar stats aumentadas | RF05 |
| RF07 | Funcional | Alta | Combate | Seleccionar equipo valido | RF03 |
| RF08 | Funcional | Media | Matchmaking | Verificar nivel similar | RF07 |
| RF09 | Funcional | Alta | Combate | Ejecutar y verificar reglas | RF08 |
| RF10 | Funcional | Alta | Combate | Verificar ganador correcto | RF09 |
| RF11 | Funcional | Media | Recompensas | Ganar y verificar premio | RF10 |
| RF12 | Funcional | Alta | Persistencia | Verificar guardado en BD | RF09 |
| RF13 | Funcional | Media | Estadisticas | Verificar datos correctos | RF10 |
| RF14 | Funcional | Media | Validaciones | Intentar accion invalida | RF07 |
| RNF01 | No Funcional | Media | Rendimiento | Medir tiempos de respuesta | - |
| RNF02 | No Funcional | Alta | Seguridad | Verificar hash en BD | RF01 |
| RNF03 | No Funcional | Media | Compatibilidad | Probar en navegadores | - |
| RNF04 | No Funcional | Media | Confiabilidad | Verificar backups | - |
| RNF05 | No Funcional | Alta | Consistencia | Repetir combate 2 veces | RF10 |
| RNF06 | No Funcional | Baja | Arquitectura | Revisar modulos | - |
| RNF07 | No Funcional | Media | Usabilidad | Probar en movil | - |
| RNF08 | No Funcional | Baja | Seguridad | Intentar SQL injection | - |

## 6. Analisis de ambiguedades

### Ambiguedad 1: Como se obtienen las criaturas

**Problema:** No dice como los usuarios consiguen criaturas

**Preguntas:**
- Se compran con dinero real?
- Se obtienen por gacha/lootbox?
- Son recompensas de combates?
- Hay criaturas iniciales?
- Existe limite de criaturas?
- Se pueden intercambiar entre usuarios?

**Impacto:** Define el modelo de negocio completo

**Supuesto temporal:** Cada usuario empieza con 3 criaturas basicas y consigue mas ganando combates

### Ambiguedad 2: Que significa mejorar criaturas

**Problema:** No especifica como funciona el sistema de mejoras

**Preguntas:**
- Las mejoras son permanentes?
- Que recursos se necesitan?
- Hay limite de mejora?
- Afecta stats, habilidades o ambas?
- Se puede resetear?
- Hay evolucion de forma?

**Impacto:** Define la progresion y retencion de usuarios

**Supuesto temporal:** Las criaturas suben de nivel con experiencia de combates y aumentan sus stats

### Ambiguedad 3: Como funcionan los combates

**Problema:** No define la mecanica de combate

**Preguntas:**
- Son por turnos o automaticos?
- El jugador decide durante el combate?
- Cuantas criaturas pelean?
- Hay tipos con ventajas?
- Existen habilidades especiales?
- Como se decide quien ataca primero?
- Se pueden usar items?

**Impacto:** Define toda la mecanica principal del juego

**Supuesto temporal:** Combate automatico por turnos, el jugador solo selecciona su equipo de 3 criaturas antes

### Ambiguedad 4: Que es un emparejamiento justo

**Problema:** No define los criterios de matchmaking

**Preguntas:**
- Se basa en nivel de usuario o poder de criaturas?
- Hay ligas o divisiones?
- Que rango de diferencia es aceptable?
- Que pasa si no hay rivales disponibles?
- Se puede elegir rival o es automatico?

**Impacto:** Afecta la experiencia y retencion

**Supuesto temporal:** Sistema de rating tipo ELO, busca rivales con +-100 puntos

### Ambiguedad 5: Consistencia en resultados

**Problema:** No aclara si es determinismo o ausencia de bugs

**Preguntas:**
- Los combates son 100% deterministas?
- Puede haber elementos de azar?
- Como se maneja el empate?
- Se guardan las semillas aleatorias?

**Impacto:** Define arquitectura del sistema de combate

**Supuesto temporal:** Combates deterministas con seed aleatorio guardado para poder repetir

## 7. Conclusiones

Del enunciado se sacaron **14 requerimientos funcionales** y **8 no funcionales**. Hay varias cosas que no estan claras y necesitan validacion con el cliente.

Los requerimientos mas importantes son autenticacion, coleccion de criaturas y sistema de combate basico. Eso seria el MVP.

Las dependencias muestran que hay que construir por capas: primero usuarios, luego coleccion, y al final combates.

Los bloqueos mas graves son la falta de reglas de combate y el sistema de balance, que hay que definir rapido.

Hay que hacer una reunion con el cliente para aclarar las ambiguedades antes de empezar a programar.
