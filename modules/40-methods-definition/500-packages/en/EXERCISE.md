Implement the method `amountPerPerson()`. It accepts the restaurant bill amount `total`, the number of people `people` and the tip percentage `tipPercent`, and returns the amount each person pays. The result is rounded **up** — nobody should underpay.

To round up, use the `ceil()` method. It is already connected at the beginning of the file with a static import from the `Math` class, so it can be called without the `Math.` prefix.

```java
App.amountPerPerson(300, 4, 20); // => 90
App.amountPerPerson(350, 3, 10); // => 129
```

First calculate the final amount with the tip, then divide it by the number of people and round up. The result of the `ceil()` method has the type `double`, and you need to return an `int` — do not forget about type casting.
