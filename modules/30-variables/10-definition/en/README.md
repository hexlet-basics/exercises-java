Imagine the task, we need to print the phrase _Father!_ On the screen twice or even five times. This problem can be solved in the forehead:

```java
System.out.print("Father!");
System.out.print("Father!");
```

In the simplest case, this is what you should do, but if the phrase _Father!_ Begins to be used more often, and even in different parts of the program, you will have to repeat it everywhere. Problems with this approach will begin when you need to change our phrase, and this happens quite often. We will have to find all the places where the phrase _Father!_ Was used and perform the necessary replacement. And you can do differently. Instead of copying our expression, just create a variable with this phrase.

```
//greeting - translated as greeting
var greeting = "Father!";
System.out.print(greeting);
System.out.print(greeting);
```

In the `var greeting = "Father!"` - the value of `"Father!"` is assigned to a variable of type String named `greeting`.

When the variable is created, you can start using it. It is substituted in those places where our phrase used to stand. During code execution, the line `System.out.print(greeting)` replaces the variable with its contents, and then the code is executed. As a result, the output of our program will be as follows:

<pre class='hexlet-basics-output'>
  Father!
  Father!
</pre>

For the name of the variable, any set of valid characters is used, which include letters of the English alphabet, numbers and the underscore character `_`. In this case, the number can not be put at the beginning. Variable names are case-sensitive, that is, the name `hello` and the name `heLLo` are two different names, and therefore two variables.

The number of variables created is not limited in any way; large programs contain tens and hundreds of thousands of variable names:

```java
var greeting1 = "Father!";
System.out.print(greeting1);
System.out.print(greeting1);
var greeting2 = "Mother!";
System.out.print(greeting2);
System.out.print(greeting2);
```

For the convenience of program analysis, it is customary to create variables as close as possible to the place where they are used.
