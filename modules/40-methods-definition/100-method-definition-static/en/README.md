Defining your own methods makes writing and maintaining programs much easier. For example, methods let you combine compound operations into one.

Sending an email from a site is a complex process that includes interaction with the internet. You can define a method and hide all that complexity behind one short construct:

```java
// The place the method comes from
import com.example.Mailer;

var email = "support@hexlet.io";
var title = "Help";
var body = "I have written a success story, how can I get a discount?";

// Mailer is the name of the class in which the send() method is defined
// One small call — and a lot of logic inside
Mailer.send(email, title, body);
```

Inside, a call like this performs quite a lot of logic. It connects to the mail server, forms the correct request based on the subject and the body of the message, and then sends it all, without forgetting to close the connection.

## How to create methods

Let's create our first method. Its task is to print the current date to the screen:

```text
Today is: 2021-10-25
```

```java
import java.time.LocalDate;

// Defining the method
// The definition does not call or execute the method
// We only say that such a method now exists
public class App {
    public static void showCurrentDate() {
        // A built-in Java method for getting the current time and date
        var currentDate = LocalDate.now();
        var text = "Today is: " + currentDate;
        System.out.println(text);
    }
}

// Calling the method
// Specifying the class name is required
App.showCurrentDate(); // => Today is: 2021-10-25
```

Let's look at the method signature part by part:

```text
public static void showCurrentDate()
  │      │     │           │
  │      │     │           the method name and the list of parameters in parentheses
  │      │     the type of the returned value
  │      static — the method is called directly from the class
  the visibility of the method outside the class
```

Defining a method in Java includes many things that we will cover step by step.

They can be divided into two groups:

* What affects the work of the method itself
* How this method is visible outside the class

Visibility is handled by the word *public*. It makes it possible to call methods from outside the class, as in the example above. Besides it, there is *private*, which is covered at Hexlet in the [Java OOP](https://ru.hexlet.io/programs/java?utm_source=code-basics&utm_medium=referral&utm_campaign=programs&utm_content=lesson) course.

The work of the method is handled by:

* *static* — detaches the method from an object and makes it possible to call it directly from the class
* *void* is used if the method returns nothing. For example, this is the definition of the `System.out.println()` method. If the method returns some data, then the type of the returned data is specified instead of *void*

Unlike ordinary data, methods perform actions, so their names should almost always be verbs: "build something", "draw something", "open something".

Everything described inside the curly braces `{}` is called the **method body**. Any code can be written inside the body. Consider it a small independent program, a set of arbitrary instructions.

The body is executed exactly at the moment the method is launched. Moreover, each call of the method runs the body independently of the other calls. By the way, the body can be empty:

```java
// The minimal definition of a method
public class App {
    public static void noop() {
        // There could be code here, but there is none
        // Pay attention to the indentation
        // For readability, any code inside the body is shifted 4 spaces to the right
    }
}
App.noop();
```

The notion of "creating a method" has many synonyms: "implementing", "defining", and even "coding it up". All these terms are found in everyday practice at work.

## Reuse and readability

Methods help avoid duplication. Suppose the same set of actions appears several times in a program:

```java
System.out.println("Hello, Hexlet!");
System.out.println("Hello, world!");
System.out.println("Hello, Java!");
```

Such a pattern can be gathered into one method and called in different places. When the text needs to be changed, the fix is made in one place — in the definition of the method. The bigger the project and the more often the logic repeats, the more noticeable the gain.

The name of the method itself hints at what it does. The `showCurrentDate()` method tells about its task without additional comments. This helps other programmers read the code, and also helps you yourself a month after writing it.
