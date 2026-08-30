
Los datos ingresados por los usuarios en los formularios a menudo contienen espacios en blanco adicionales al final o al inicio de la cadena. Además, los usuarios pueden ingresar lo mismo en distintas mayúsculas y minúsculas, lo que luego dificulta el trabajo con los datos. Por eso, antes de agregarlos, los datos se procesan (se dice que se normalizan). El procesamiento básico incluye dos acciones:

- Eliminar los espacios en blanco de los extremos con el método `.trim()`, por ejemplo, era: `"   hexlet\n "`, quedó: `"hexlet"`
- Convertir a minúsculas con el método `toLowerCase()`. Era: `"SUPPORT@hexlet.io"`, quedó: `"support@hexlet.io"`.

Actualiza la variable `email` escribiendo en ella el mismo valor, pero procesado según el esquema indicado arriba. Imprime en pantalla lo que obtuviste.
