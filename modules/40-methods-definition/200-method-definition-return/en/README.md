The methods we defined in the previous lessons finished their work by printing some data to the screen:

```java
public class App {
    public static void greeting() {
        System.out.println("Winter is coming");
    }
}
```

There is not much use in such methods, because the result of their work cannot be used inside the program.

Let's look at this with an example. Take the task of processing an email address. When a user registers on some site, they can type the address in any way:

- Accidentally add spaces at the beginning or at the end `_support@hexlet.io__`
- Use letters in different cases `SUPPORT@hexlet.io`

If we save the address in this form into the database, the user will not be able to log in to the site when they type the address without spaces and in a different case.

To prevent that, the address has to be prepared for saving: converted to lower case and trimmed of the spaces at the edges of the string. The whole task is solved in a couple of lines:

```java
class App {
    public static void main(String[] args) {
        // We get the address from the form
        var email = "  SuppORT@hexlet.IO";
        // We trim the whitespace characters
        var trimmedEmail = email.trim();
        // We convert it to lower case
        var preparedEmail = trimmedEmail.toLowerCase();
        System.out.println(preparedEmail); // => support@hexlet.io
        // We save it into the database
    }
}
```

This code became possible only thanks to returning a value. The `trim()` and `toLowerCase()` methods do not print anything to the screen. They **return** the result of their work, and that is why we can store it in variables. If instead they printed to the screen, we could not assign the result of their work to a variable. Just as we cannot do it with the `greeting()` method defined above:

```java
// Java will complain that `greeting()` returns nothing
// The code will not work
var message = App.greeting();
```

Let's change the `greeting()` method so that it starts returning data instead of printing it. For this we need to make two edits:

- Describe the type of the returned data — here it is the string `String`
- Return the value instead of printing it to the screen

Let's look at the changed code:

```java
class App {
    public static String greeting() {
        return "Winter is coming!";
    }
}
```

Instead of `void`, now `String` is written, because the method has a return. This way we told Java that the result of the method's work will be a string.

Also pay attention to `return` — it is a special instruction. It takes the expression on its right and gives it outside, to the code that called the method. As soon as Java runs into `return`, the execution of the method ends there:

```java
// Now this code works
var message = App.greeting();
// We can perform some actions on the result
System.out.println(message.toUpperCase()); // => WINTER IS COMING!
```

Any code after `return` is not executed:

```java
class App {
    public static String greeting() {
        return "Winter is coming!";
        // Any code below will never be executed
        // Unreachable code in Java will not even compile
        System.out.println("I will never be executed");
    }
}
```

Even if a method returns data, that does not limit it in what it prints. Besides returning data, we can print it as well:

```java
class App {
    public static String greeting() {
        System.out.println("I will appear in the console");
        return "Winter is coming!";
    }
}

// Somewhere in another method the program
// will both print the text to the screen and return the value
var value = App.greeting();
```

You can return not only a specific value. Since `return` works with expressions, almost anything can appear on its right. Here you should be guided by the principles of code readability:

```java
class App {
    public static String greeting() {
        var message = "Winter is coming!";
        return message;
    }
}
```

Here we do not return the variable — the value that is inside this variable is always returned. Below is an example with calculations:

```java
class App {
    public static long doubleFive() {
        // or return 5 + 5;
        var result = 5 + 5;
        return result;
    }
}
```

In this example `long` was used in the method definition, because an integer is returned.

To check the knowledge from this lesson, try to answer the question. What do you think this code will print?

```java
// Definition
class App {
    public static int run() {
        return 5;
        return 10;
    }
}

// Usage
App.run(); // => ?
```
