Working with loops usually comes down to two scenarios. In the first one the result is accumulated during the iterations, and the work with it goes on after the loop. Such an approach is called aggregation, and reversing a string belongs to it. In the second one the loop is executed until the needed result is reached and finishes ahead of time. That is how, for example, the check of a prime number is arranged — a number that divides without a remainder only by itself and by one.

Let's look at the algorithm of checking a number for primality. We will divide the number `x` we are interested in by all the numbers from the range from two to `x - 1` and look at the remainder. If no divisor that divides `x` without a remainder was found in this range, then we have a prime number in front of us.

## Checking the primality of the number 5: a step-by-step analysis

1. We take the number `x = 5`. We look for possible divisors in the range from 2 to `x - 1`, that is, from 2 to 4
2. We divide 5 by 2. The remainder equals 1, we did not find a divisor, we continue
3. We divide 5 by 3. The remainder equals 2, we did not find a divisor, we continue
4. We divide 5 by 4. The remainder equals 1, we did not find a divisor, we finish going through

The result: in the range from 2 to 4 not a single number was found that 5 divides by without a remainder. That means 5 is a prime number.

It is enough to limit the search for divisors to half of the number. For example, 11 does not divide by 2, 3, 4, 5, and by numbers greater than its half it will divide even less. That means the algorithm can be optimized and the division can be checked only up to `x / 2`:

```java
public static boolean isPrime(int number) {
    if (number < 2) {
        return false;
    }

    var divider = 2;

    while (divider <= number / 2) {
        if (number % divider == 0) {
            return false;
        }

        divider++;
    }

    return true;
}

App.isPrime(1); // false
App.isPrime(2); // true
App.isPrime(3); // true
App.isPrime(4); // false
```

*To be completely honest, checking the numbers up to the square root of `number` is enough to solve the task. But here it is important to focus on working with a condition inside a loop*

The main technique of this lesson is exiting the method right from inside the loop:

```text
while (...) {
    if (condition) {
        return value; ← exit from the method (and from the loop)
    }
    ...
}
─────────────────────────────────
Without return the loop reaches the end
```

The algorithm is built in such a way that, when dividing sequentially by the numbers up to `x / 2`, it is enough to find at least one divisor without a remainder. Then the passed argument is a composite number, and further calculations make no sense. The return of `false` stands in this place, and `return` immediately finishes both the loop and the whole method.

And only if the loop worked through entirely and not a single divisor without a remainder was found, the execution will reach the last line. The method will return `true`, because the number turned out to be prime.
