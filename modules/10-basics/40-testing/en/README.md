Our website automatically checks your solutions. How does it work?

In the simplest case, the system just runs your code and looks at what was printed on the screen. Then it compares that with what we "expected" according to the exercise.

In the following, more complex lessons, you'll write methods — small programs that take information from the outside world and perform some operations. Checking your solutions in such cases looks a bit more complicated: the system runs your solution and passes it some information. The system also knows — "expects" — exactly which answer the correct method should return for such input data.

For example, if your task is to write code that adds two numbers, the checking system will pass it different combinations of numbers and compare your code's answer with the actual sums. If the answers match in all cases, the solution is considered correct.

Here's a simple example: in one of the future lessons, you'll need to write code that performs calculations and produces an answer. Suppose you made a small mistake, and the method produced the wrong number. The system will respond something like this:

```text
expected: "35" but was: "10"
```

The most important part comes after the colon: "expected: "35", but was "10"". That is, the correct code should have produced 35, but the current solution works incorrectly and produces 10.

This approach is called testing, and it's used in real-world development. Tests help check whether a program works correctly and quickly spot an error after changes. That's exactly why our website says "Tests passed" when you've solved the task correctly.

## Is it my mistake or not?

Sometimes, while solving, it will seem that you did everything right, but the system is "being capricious" and won't accept the solution. This behavior is practically impossible. Non-working tests simply can't make it onto the website; they run automatically after every change. In the overwhelming majority of such cases (and all our projects combined have run millions of checks over many years), the error is in the solution code. It can be very subtle: instead of an English letter you accidentally typed a Russian one, you used lowercase instead of uppercase, or you forgot to print a comma. Other cases are trickier. Perhaps your solution works for one set of input data but not for another. So always read the task description and the test output carefully. There is almost certainly an indication of the error there.

However, if you're sure of an error or have found some inaccuracy, you can always point it out. At the end of each theory there's a link to the lesson's content on GitHub (this project is completely open!). Going there, you can write an issue, look at the contents of the tests (there you can see how your code is called), and even submit a pull request. If this is still a mystery to you for now, join our community [Hexlet community on Telegram](https://t.me/hexletcommunity/12); there, in the Volunteers channel, we'll always help.
