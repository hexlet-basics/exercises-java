La estructura condicional `if` tiene varias variantes. Una variante incluye un bloque que se ejecuta si la condición es falsa:

```java
if (x > 5) {
    // Si la condición es verdadera
} else {
    // Si la condición es falsa
}
```

Esta estructura puede ser útil para la inicialización de valores. En el siguiente ejemplo, se verifica la existencia de un `email`. Si está ausente, se establece un valor predeterminado; si se proporciona, se realiza una normalización:

```java
// Aquí viene el email

if (email.equals("")) { // Si el email está vacío, establecer el valor predeterminado
    email = "support@hexlet.io";
} else { // De lo contrario, realizar la normalización
    email = email.trim().toLowerCase();
}

// Aquí se utiliza este correo electrónico
```

Si la rama `if` contiene un `return`, entonces el `else` no es necesario, se puede omitir simplemente:

```java
if (/* condición */) {
    return /* algún valor */;
}

// Continuar haciendo algo, porque no se necesita el else
```
