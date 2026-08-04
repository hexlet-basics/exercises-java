You may be surprised, but throughout all the previous lessons we have been creating our own method. The skeleton of the method was written in advance, and you were required to add its body. The practice looked like this:

```java
public class App {
    public static void main(String[] args) {
        // BEGIN
        // And here you wrote your code
        // END
    }
}
```

Why did we create a method? Java is designed in such a way that it is impossible to execute code outside methods. You cannot just write code at the file level and run it. The compiler will report an error:

```java
// A file with such code does not compile
System.out.println("Although it would seem so");
```

But this code will already work:

```java
public class App {
    public static void main(String[] args) {
        System.out.println("Although it would seem so");
    }
}
```

At work you will often see examples outside methods. Why do we and others do that? Purely for convenience.

If you add a wrapper in the form of a class and a method to every single line, the amount of noise and material grows significantly. Always keep this in mind, because the authors of such materials count on you understanding how Java works.

When you see code that is called without methods, always add the wrapper as shown above. Then you can easily run that code, for example, locally.

## The main method

Why is the method in our examples called `main`? After all, we could have written an example like this:

```java
public class App {
    // run - the name is chosen arbitrarily
    // the name can be anything the author of the code wants
    public static void run() {
        // some code here
    }
}
```

We could have done that, and everything would work, but there is one point. In this form the `main` method, the way we define it, has a special meaning for Java.

Java calls it automatically when the program is launched from the console:

```bash
# The App file contains a class named App
java App.java # compiles and runs for execution
# Inside, the App.main method will be launched, if it is defined
```

Any other method is not called automatically. That is exactly why we use `main` everywhere, because this way you can easily move the code from the exercise to your own editor and run it.

Is it required to define it? No, Java does not impose any restriction on which methods and how many of them you define in a class.
Just as there is no restriction on the number and the names of classes.

For simplicity we always use the name `App`, but in real code you will come across thousands of different names and classes. Although with the condition that a single file contains exactly one class:

```java
class MySuperClassName {
    public static void oneMethod() {
    }
    public static void twoMethod() {
    }
    public static void threeMethod() {
    }
}
```

We will talk about this in the [Java OOP](https://ru.hexlet.io/programs/java?utm_source=code-basics&utm_medium=referral&utm_campaign=programs&utm_content=lesson) course.

The main thing to remember now is that any static methods are called through a dot after the class name, and the calls themselves happen inside other methods:

```java
// Just an example of methods calling each other
class MySuperClassName {
    public static void oneMethod() {
        MySuperClassName.twoMethod();
    }

    public static void twoMethod() {
        MySuperClassName.threeMethod();
    }

    public static void threeMethod() {
    }
}
```
