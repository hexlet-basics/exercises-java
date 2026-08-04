Even for the most experienced developers code rarely works perfectly the first time. The more experienced a developer is, the more confidently they **debug** code, that is, analyze errors and eliminate them.

The skill of debugging will not appear on its own. It has to be developed, and as early as possible. In the course of studying you will do exercises and practice, and over time analyzing errors will become a habit.

## How to find an error in code

Debugging by poking around takes a lot of time. It is much more productive to first understand what exactly went wrong, and then eliminate the cause.

If the program crashed with an exception, the first thing to study is the **call stack** (stack trace). It contains the chain of method calls from the place of the error and up to the start of the program. Every entry points to a class, a method, a file and a line. From the stack you can see which methods were executed and where the problem occurred:

```bash
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at App.divide(App.java:6)
    at App.main(App.java:2)
```

In the first line there is the type of the exception and the error message: `ArithmeticException` with the explanation `/ by zero` (division by zero). Then goes the stack itself: the error occurred in the `divide` method on line 6, and it was called from `main` on line 2. From the names of the classes you can also understand whether the problem is in your code or in a connected library.

**If you want to ask an experienced developer for advice, the first thing to show is the error message and the call stack.** A fragment of code without context says little, while the text of the error points to the cause right away.

## Types of errors

The most understandable errors are the **syntactic** ones. They occur when the code is written incorrectly: a bracket or a semicolon is missing, the quotes do not match. Such code does not compile, and the compiler points directly at the place:

```bash
App.java:2: error: ';' expected
        System.out.println("Hello")
                                   ^
```

**Runtime errors** are harder to fix. The code compiles, but when launched it crashes with an exception: division by zero, accessing `null`, going out of the bounds of a string or an array. They show up already during the work of the program, and the cause is not always where it crashed.

The hardest to fight are **logical errors**. The program works through without exceptions, but produces an incorrect result. There is no error message — only unexpected output. For example, a method should count the sum, but counts the difference:

```java
// The method should count the sum of the numbers, but counts the difference
public static int sum(int a, int b) {
    return a - b;
}
```

## Ways of debugging

At the base of any debugging method lies observing the variables during execution. Let's look at a method that counts the sum of the numbers from `start` to `finish`. With `start = 3` and `finish = 5` it should calculate `3 + 4 + 5`:

```java
public static int sumOfSeries(int start, int finish) {
    int result = 0;
    int n = start;
    while (n < finish) {
        result = result + n;
        n = n + 1;
    }
    return result;
}
```

The key variables here are `n` and `result`. To find the error you need to look at which values they take on every iteration. For this there are **visual debuggers**, built into code editors: they let you execute the program step by step, watching the variables in real time.

At Hexlet, **debug printing** is used instead of a debugger. The principle is the same, only the values of the variables are printed with the ordinary `System.out.println()`:

```java
public static int sumOfSeries(int start, int finish) {
    int result = 0;
    int n = start;
    while (n < finish) {
        System.out.println("new iteration !!!!");
        System.out.println(n);
        result = result + n;
        n = n + 1;
        System.out.println(result);
    }
    return result;
}

// new iteration !!!!
// 3
// 3
// new iteration !!!!
// 4
// 7
```

The output shows that there is one iteration fewer than needed: the five (`finish`) did not get into the addition. The condition has `n < finish` instead of `n <= finish`. The sign `<` has to be replaced with `<=`.

Beginning developers often get upset because of errors and consider themselves inattentive. Everyone has errors — both juniors and seniors. The difference is only in how confidently you find them.
