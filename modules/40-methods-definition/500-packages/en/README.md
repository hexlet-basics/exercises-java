When a program grows, it gets not only more lines of code, but also more classes. Each class solves its own task and lies in a separate file, and in a real application there can be hundreds or thousands of such files. Some of the classes are written by you, some come along with the connected libraries.

With such a number of classes, a situation almost inevitably arises where two different classes get the same names. If two classes with the same name end up in one project, the program will not compile. Your own class can be renamed, but with a class from someone else's library that will not work. That is why the requirement of unique names would seriously get in the way of reusing other people's code.

To solve this problem, Java uses **packages**. A package is a mechanism for combining classes into logically related groups. Packages are similar to folders in a file system: just as folders organize files, packages organize classes. Different packages can contain classes with the same names, and no conflict will arise.

## Defining packages

A package is specified with the `package` keyword at the very beginning of the file, immediately followed by the name of the package:

```java
// File company/User.java
package company;

public class User {
    // code for working with the user
}
```

The structure of packages is tied to the file structure of the project: the name of the package corresponds to the directory in which the file lies. Packages can be nested — then the directories are nested into each other as well. If a class lies in the `io.hexlet.model` package, then the file is located in the `io/hexlet/model` directory.

Usually the name of a package starts with a prefix assigned to a company or a developer — most often it is the domain name in reverse order. For example, for the domain `hexlet.io` packages start with `io.hexlet`. Further on, the structure depends on the architecture of the application: classes are grouped by meaning, for example, the main entities — users and courses — are put into the `model` package:

```java
// File io/hexlet/model/User.java
package io.hexlet.model;

public class User {
    public static String getGreeting(String userName) {
        return "Hello, " + userName + "!";
    }
}
```

## Importing classes

Classes from the same package refer to each other simply by name. But you constantly have to use classes from other packages too. To refer to a class from another package, it has to be imported — the `import` keyword serves for this, followed by the full name of the class:

```java
package io.hexlet;

import io.hexlet.model.User;

class App {
    public static void main(String[] args) {
        var greeting = User.getGreeting("John");
        System.out.println(greeting);
    }
}
```

After the import, the class is referred to by its short name. Without the import you would have to write the full (fully qualified) name every time, including the name of the package:

```java
var greeting = io.hexlet.model.User.getGreeting("John");
```

The full name comes to the rescue when two classes with the same name from different packages are needed in one place: one class is imported, and the second one is referred to by its full name.

You can import all the classes of a package at once with the help of `*`:

```java
import java.util.*;
```

This is convenient when many classes from the package are needed, but you should not abuse it: importing "everything at once" clutters the namespace and increases the risk of a name conflict between packages.

## Static import

Java allows you to import not only classes, but also individual static methods — then they can be called without specifying the class. This is convenient when some method is used often, and it makes the code more compact:

```java
import static java.lang.Math.ceil;

public class App {
    public static void main(String[] args) {
        // The Math class name can be omitted in the call
        double result = ceil(2.3); // 3.0
        System.out.println(result);
    }
}
```

You can also import all the static methods of a class at once: `import static java.lang.Math.*;`. We use static import in the exercise of this lesson.
