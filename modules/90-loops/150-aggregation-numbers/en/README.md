In programming there is a separate class of tasks that cannot do without loops — it is called **data aggregation**.

Such tasks include finding:

* The maximum value
* The minimum value
* The sum
* The arithmetic mean

Their main feature is that the result depends on the whole set of data. To calculate the sum you need to add up **all** the numbers; to calculate the maximum you need to compare **all** the numbers.

Everyone who works with numbers is well familiar with this topic. For example, accountants or marketers often work with such tasks in spreadsheets like Microsoft Excel or Google Sheets.

Let's take apart the simplest example — finding the sum of a set of numbers. Let's implement a function that adds up the numbers in the specified range, including the bounds.

In this case a **range** is a series of numbers from some beginning to a certain end. For example, the range `[1, 10]` includes all the integers from 1 to 10:

```java
App.sumNumbersFromRange(5, 7); // 5 + 6 + 7 = 18
App.sumNumbersFromRange(1, 2); // 1 + 2 = 3

// The range [1, 1] with the same beginning and end is also a range
// It includes one number — the bound of the range itself
App.sumNumbersFromRange(1, 1); // 1
App.sumNumbersFromRange(100, 100); // 100
```

To implement this code we will need a loop. We choose a loop exactly because adding numbers is an iterative process. It repeats for every number, and the number of iterations depends on the size of the range.

To understand the topic better, try to answer the questions:

* What value should the counter be initialized with?
* How will it change?
* When must the loop stop?

And now look at the code below:

```java
public static int sumNumbersFromRange(int start, int finish) {
    // Technically you can change start, but input arguments should be left at their original value
    // This makes the code simpler to analyze
    var i = start;
    var sum = 0; // Initializing the sum

    while (i <= finish) { // We move to the end of the range
        sum = sum + i; // We count the sum for every number
        i = i + 1; // We move on to the next number in the range
    }

    // We return the resulting value
    return sum;
}
```

The general structure of the loop here is standard:

* The counter, which is initialized with the starting value of the range
* The loop itself with the stopping condition when the end of the range is reached
* Changing the counter at the end of the body of the loop

The number of iterations in such a loop equals `finish - start + 1`. For example, 3 iterations are needed to count the range from 5 to 7:

```md
7 - 5 + 1 = 3
```

The main differences from ordinary processing are related to the logic of calculating the result. In aggregation tasks there is always some variable that stores inside itself the result of the loop's work. In the code above it is `sum`.

On every iteration of the loop it changes, the next number in the range gets added: `sum = sum + i`. The whole process looks like this:

```java
// For the call sumNumbersFromRange(2, 5);
var sum = 0;
sum = sum + 2; // 2
sum = sum + 3; // 5
sum = sum + 4; // 9
sum = sum + 5; // 14
// 14 is the result of adding the numbers in the range [2, 5]
```

In mathematics there is the notion of the **neutral element of an operation**. An operation with such an element does not change the value the operation is performed on:

* In addition any number plus zero gives the number itself
* In subtraction it is the same
* Even concatenation has a neutral element — it is the empty string: `"" + "one"` will be `"one"`
