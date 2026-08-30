The programs we write while studying are becoming more and more complex and voluminous. They are still very far from real programs, where the number of lines of code is measured in tens and hundreds of thousands, but the current complexity is already able to make people without experience tense up.

Starting with this lesson, we move on to one of the most complex basic topics in programming — **loops**.

Any applied programs serve very pragmatic goals. They help to manage employees, finances, and in the end they entertain. Despite the differences, all these programs execute the algorithms built into them, which are very similar to each other.

An **algorithm** is a sequence of actions or instructions that leads us to some expected result. This description fits any program, but by algorithms something more specific is usually meant.

Imagine that we have a book and we want to find some specific phrase inside it. We remember the phrase itself, but we do not know which page it is on. How do we find the needed page?

The simplest and longest way is to look through the book sequentially until we find the needed page. In the worst case we will have to look through all the pages, but we will get the result anyway.

Exactly this process is called an **algorithm**. It includes going through the pages and logical checks of whether we have found the phrase or not. The number of pages we will have to look at is not known in advance, but the process of looking itself repeats from time to time in a completely identical way.

Loops are exactly what is needed for performing repeating actions. Every such repetition is called an **iteration**.

Suppose we want to write a method. It has to print to the screen all the numbers from 1 to the number that we specified through the parameters:

```java
App.printNumbers(3);
// 1
// 2
// 3
```

It is impossible to implement this method with the means already studied, because the number of prints to the screen is not known in advance. But with loops this will not be a problem at all:

```java
public static void printNumbers(int lastNumber) {
    // i is a shortening of index (the ordinal number)
    // By common agreement it is used in many languages as the loop counter
    var i = 1;

    while (i <= lastNumber) {
        System.out.println(i);
        i = i + 1;
    }
    System.out.println("finished!");
}

App.printNumbers(3);
```

```text
1
2
3
finished!
```

The `while` loop is used in the code of the method. It consists of three elements:

- The **keyword** `while`. Despite the similarity to method calls, this is not a method call
- The **predicate** — the condition that is specified in parentheses after `while` and is evaluated on every iteration
- The **body of the loop** — a block of code in curly braces, analogous to the block of code in a method. All the constants or variables defined inside this block will be visible only inside this block

The construct reads like this: "do what is specified in the body of the loop while the condition `i <= lastNumber` is true". Let's take apart the work of this code for the call `App.printNumbers(3)`:

```java
// i is initialized
var i = 1;

// The predicate returns true, so the body of the loop is executed
while (1 <= 3)
// System.out.println(1);
// i = 1 + 1;

// The body of the loop has ended, so a return to the beginning happens
while (2 <= 3)
// System.out.println(2);
// i = 2 + 1;

// The body of the loop has ended, so a return to the beginning happens
while (3 <= 3)
// System.out.println(3);
// i = 3 + 1;

// The predicate returns false, so the execution moves past the loop
while (4 <= 3)

// System.out.println("finished!");
// At this stage i equals 4, but we do not need it anymore
// The method finishes
```

The most important thing in a loop is the ending of its work, that is, **exiting the loop**. The process that the loop generates must stop in the end. The responsibility for stopping lies entirely on the programmer.

Usually the task comes down to introducing a variable called the **loop counter**. It works on the following principle:

- First the counter is initialized, that is, an initial value is set for it. In the example above the counter is the instruction `var i = 1`, executed before entering the loop
- Then the condition of the loop checks whether the counter has reached its limit value.
- In the end the counter changes its value `i = i + 1`

At this point beginners make the most mistakes. Let's imagine that the check in the predicate is written incorrectly in the code. This can lead to an **infinite loop** — a situation in which the loop works endlessly and the program never stops.

In that case you have to terminate it forcibly:

```java
public static void printNumbers(int lastNumber) {
    var i = 1;

    // This loop will never stop
    // and will always print one and the same value
    while (i <= lastNumber) {
        System.out.println(i);
    }
    System.out.println("finished!");
}
```

In some cases infinite loops are useful. We do not consider such cases here, but it is useful to see what this code looks like:

```java
while (true) {
    // We do something
}
```

Let's sum up. When are loops really needed, and when can you do without them? It is impossible to do without loops when the algorithm of solving the task requires repeating some actions, and the number of these operations is not known in advance. That is how it was in the example with the book that we looked at in the beginning of the lesson.
