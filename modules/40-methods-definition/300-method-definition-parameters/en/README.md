Methods can not only return values, but also accept them in the form of parameters. We have already come across method parameters many times:

```java
// Accepts one parameter of any type
System.out.println("I am a parameter");
// Accepts the index by which the character is extracted
"some text".charAt(3); // 'e'
// Accepts two string parameters
// The first — what we are looking for, the second — what we replace it with
"google".replace("go", "mo"); // "moogle"
// Accepts two numeric parameters
// the first — the starting index inclusive, the second — the ending index exclusive
"hexlet".substring(1, 3); // "ex"
```

In this lesson we will learn how to create methods that accept parameters.

Imagine that we have a task — to implement the static method `App.getLastChar()`. It must return the last character of the string passed to it as a parameter.

This is what using this method looks like:

```java
// Passing parameters directly without variables
App.getLastChar("Hexlet"); // 't'
App.getLastChar("Goo"); // 'o'
// Passing parameters through variables
var name1 = "Hexlet";
App.getLastChar(name1); // 't'
var name2 = "Goo";
App.getLastChar(name2); // 'o'
```

From the description and the code examples we can draw the following conclusions:

* We need to define the static method `getLastChar()` in the `App` class
* The method must accept one parameter of type `String`
* The method must return a value of type `char`

To begin with, let's define the method:

```java
class App {
    public static char getLastChar(String str) {
        // We calculate the index of the last character as the length of the string minus 1
        return str.charAt(str.length() - 1);
    }
}
```

Let's look at this code in more detail. `char` tells us about the type of the returned value. Then, in parentheses, the type of the parameter `String` and its name `str` are specified.

Inside the method we do not know which specific value we are working with, so parameters are always described as variables.

The name of the parameter can be anything — it is not tied to how the method is called. The main thing is that this name reflects the meaning of the value it contains. The specific value of the parameter will depend on the call of this method.

Parameters in Java are always required. If a method needs parameters and we try to write code without a parameter, the compiler will report an error:

```sh
App.getLastChar(); // such code makes no sense
method getLastChar in class App cannot be applied to given types;
  required: String
  found:    no arguments
  reason: actual and formal argument lists differ in length
```

In exactly the same way you can specify two and more parameters. Each parameter is separated with a comma:

```java
class App {
    // A method for finding the average number
    // The returned type is double, because
    // division can produce a fractional number
    public static double average(int x, int y) {
        return (x + y) / 2.0;
    }
}

App.average(1, 5); // 3.0
App.average(1, 2); // 1.5
```

Methods can require as many parameters as they need in order to work:

```java
// the first parameter — what we are looking for
// the second parameter — what we replace it with
"google".replace("go", "mo"); // "moogle"
```

To create such methods you need to specify the required number of parameters separated by commas in the definition, giving them understandable names. Below is an example of the definition of the `replace()` method, which replaces one part of a string in a word with another:

```java
class App {
    public static String replace(String text, String from, String to) {
        // Here is the body of the method, but we
        // omit it so as not to get distracted
        return text.replace(from, to);
    }
}

App.replace("google", "go", "mo"); // "moogle"
```

When there are two or more parameters, the order in which these parameters are passed becomes important for almost all methods. Swapping the arguments changes the result of the method:

```java
// Nothing was replaced,
// because there is no mo inside google
App.replace("google", "mo", "go"); // "google"
```
