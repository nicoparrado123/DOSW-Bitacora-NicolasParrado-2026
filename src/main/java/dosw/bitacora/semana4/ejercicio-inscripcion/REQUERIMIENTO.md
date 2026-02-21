# Formulario de Inscripción a la Carrera

## Escuela Colombiana de Ingeniería Julio Garavito

---

## Nombre
**Inscripción de Estudiantes Nuevos**

---

## Descripción
Básicamente es un formulario web donde la gente que quiere estudiar en la Escuela puede inscribirse a las carreras. Llenas tus datos, el sistema los revisa y te da un numero de inscripcion para que puedas hacer seguimiento de tu proceso de admision.

---

## Como se Ejecutara
Entras a la pagina de la Escuela, buscas la parte de admisiones, escoges la carrera que te interesa y llenas el formulario. El sistema va revisando que todo este bien mientras escribes, guarda tu info y te manda un correo con tu numero de inscripcion.

---

## Actor Principal
**Aspirante**: La persona que quiere estudiar en la Escuela Colombiana de Ingenieria.

---

## Precondiciones
1. Tener internet y un navegador que funcione bien
2. Que la pagina de admisiones este funcionando
3. Que las inscripciones esten abiertas
4. Tener un correo electronico que funcione
5. Que las carreras esten publicadas y disponibles

---

## Datos de Entrada

### Info Personal
- Nombres completos (obligatorio)
- Apellidos completos (obligatorio)
- Tipo de documento (obligatorio): Cedula, Tarjeta de Identidad, Cedula de Extranjeria, Pasaporte
- Numero de documento (obligatorio, no se puede repetir)
- Fecha de nacimiento (obligatorio)
- Genero (obligatorio)
- Estado civil (opcional)

### Info de Contacto
- Correo electronico (obligatorio, no se puede repetir)
- Celular (obligatorio)
- Telefono fijo (opcional)
- Direccion donde vives (obligatorio)
- Ciudad (obligatorio)
- Departamento (obligatorio)
- Pais (obligatorio)

### Info Academica
- Carrera que te interesa (obligatorio)
- Modalidad (obligatorio): Presencial, Virtual, Semipresencial
- Jornada que prefieres (obligatorio): Dia, Noche, Fin de semana
- Colegio donde te graduaste (obligatorio)
- Año en que te graduaste (obligatorio)
- Puntaje del ICFES (opcional)

### Info Adicional
- Como conociste la escuela? (obligatorio): Redes sociales, Alguien te refirio, Pagina web, Feria educativa, Otro
- Aceptar terminos y condiciones (obligatorio)
- Aceptar tratamiento de datos personales (obligatorio)

---

## Datos de Salida

### Si Todo Sale Bien
- Numero de inscripcion unico (tipo: INS-2024-000123)
- Mensaje en pantalla diciendo que todo salio bien
- Correo con:
  - Tu numero de inscripcion
  - Tus datos
  - La carrera que escogiste
  - Que hacer despues
  - Cuando te inscribiste
  - Link para ver como va tu inscripcion

### Si Algo Sale Mal
- Mensaje diciendo que paso
- Los campos con error se ponen rojos
- Tips para arreglarlo

---

## Flujo Basico

1. Entras a la pagina de la Escuela
2. Vas a "Admisiones" y luego a "Inscripcion"
3. Te aparece el formulario
4. Escoges la carrera que quieres estudiar
5. Llenas tus datos personales
6. El sistema va revisando que todo este bien escrito
7. Llenas tus datos de contacto
8. El sistema revisa que tu correo no este ya registrado
9. Llenas tus datos academicos
10. Dices como conociste la escuela
11. Lees y aceptas los terminos y condiciones
12. Aceptas el tratamiento de tus datos
13. Le das click a "Enviar Inscripcion"
14. El sistema revisa que no te falte nada obligatorio
15. El sistema revisa que no te hayas inscrito antes con el mismo documento
16. El sistema te da un numero de inscripcion
17. El sistema guarda todo en la base de datos
18. Te llega un correo de confirmacion
19. Te aparece un mensaje de exito con tu numero
20. Puedes descargar un comprobante en PDF
21. Listo

---

## Flujo Alterno (Errores)

### Error 1: Te Faltan Campos por Llenar
**Cuando pasa**: En el paso 14
1. El sistema se da cuenta que te faltan cosas por llenar
2. Los campos vacios se ponen rojos
3. Sale un mensaje: "Por favor llena todos los campos con *"
4. Lo que ya llenaste se queda guardado
5. Vuelves al paso 5 para completar

### Error 2: Escribiste Algo Mal
**Cuando pasa**: En el paso 6
1. El sistema nota que algo esta mal escrito (ej: correo sin @, telefono con letras)
2. Sale un mensaje abajo del campo: "Formato invalido. Ejemplo: ejemplo@correo.com"
3. El campo se pone rojo
4. Vuelves a ese campo para arreglarlo

### Error 3: Ese Correo Ya Existe
**Cuando pasa**: En el paso 8
1. El sistema ve que ese correo ya esta registrado
2. Sale un mensaje: "Este correo ya esta registrado. Si olvidaste tu numero de inscripcion, haz click aqui"
3. Te da la opcion de recuperar tu numero
4. Vuelves al paso 7 para poner otro correo

### Error 4: Ese Documento Ya Esta Inscrito
**Cuando pasa**: En el paso 15
1. El sistema ve que ese documento ya tiene una inscripcion
2. Sale un mensaje: "Ya hay una inscripcion con este documento para este periodo"
3. Te muestra el numero de inscripcion que ya tienes
4. Te da opciones: "Ver mi inscripcion" o "Contactar soporte"
5. Fin

### Error 5: No Se Pudo Mandar el Correo
**Cuando pasa**: En el paso 18
1. El sistema no puede mandar el correo (servidor caido o correo malo)
2. Igual guarda tu inscripcion
3. Sale un mensaje: "Tu inscripcion fue exitosa con el numero INS-2024-XXXXXX, pero no pudimos mandar el correo. Anota tu numero"
4. El sistema guarda el error para intentar despues
5. Sigue en el paso 19

### Error 6: Las Inscripciones Estan Cerradas
**Cuando pasa**: En el paso 3
1. El sistema ve que no es epoca de inscripciones
2. Sale un mensaje: "Las inscripciones estan cerradas. Estaran disponibles desde [fecha] hasta [fecha]"
3. Te da la opcion de registrarte para que te avisen cuando abran
4. Fin

### Error 7: Problema con la Base de Datos
**Cuando pasa**: En el paso 17
1. El sistema no puede conectarse a la base de datos
2. Sale un mensaje: "Error temporal. Intenta de nuevo en unos minutos"
3. El sistema guarda lo que llenaste en tu navegador
4. Te da la opcion de "Reintentar" o "Guardar borrador"
5. Vuelves al paso 13

---

## Diagrama de Casos de Uso
Ver archivo: `diagrama-casos-uso.png`

---

## Reglas de Negocio

### Regla 1: Una Inscripcion por Persona
- Solo puedes tener una inscripcion activa por periodo
- Tu numero de documento no se puede repetir
- Tu correo no se puede repetir

### Regla 2: Edad Minima
- Debes tener minimo 15 años para inscribirte
- Si eres menor de 18, te llega un correo para que tu acudiente autorice

### Regla 3: Como Se Ve el Numero de Inscripcion
- Formato: INS-2024-000123
- El año actual
- Un numero de 6 digitos que va aumentando

### Regla 4: Cuando Puedes Inscribirte
- Solo cuando las inscripciones esten abiertas
- El sistema revisa las fechas de inicio y fin
- Si estan cerradas, solo puedes consultar tu inscripcion

### Regla 5: El Correo Debe Ser Valido
- Debe tener @ y un dominio
- No se aceptan correos temporales
- Te mandan un codigo para verificar que es tuyo

### Regla 6: Carreras Disponibles
- Solo puedes escoger carreras que esten activas
- Cada carrera tiene cupos limitados
- Si se llenan los cupos, aparece como "No disponible"

### Regla 7: Tus Datos Personales
- Tienes que aceptar el tratamiento de datos
- Tienes que aceptar los terminos y condiciones
- Sin esto no puedes inscribirte

### Regla 8: Guardar lo que Vas Llenando
- Si te sales del formulario, se guarda lo que llenaste por 24 horas
- Despues de 24 horas se borra

### Regla 9: Notificaciones
- Te llega correo apenas te inscribes
- Te recuerdan si faltan documentos a las 48 horas
- Te avisan cada vez que cambie el estado de tu inscripcion

### Regla 10: Seguridad
- Todo se manda por conexion segura (HTTPS)
- Hay un CAPTCHA para evitar bots
- Se guarda tu IP y cuando te inscribiste

### Regla 11: Funciona en Celular
- El formulario funciona en celular y computador
- Funciona en Chrome, Firefox, Safari y Edge

### Regla 12: Todo en Español
- El formulario esta en español
- Los mensajes de error estan en español
- Acepta ñ y tildes
