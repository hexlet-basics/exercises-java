
Recall one of the past lessons:

```java

var euros = 1000;
var dollars = euros * 1.25; // => 1250
var rubles = dollars * 60; // => 75000

System.out.print(rubles);
```

From the point of view of professional development, this code "smells." This is how code that does not correspond to the so-called best practices is described. And the reason is this: right now, looking at the numbers `60` and `1.25`, you are most likely wondering: "What are these numbers?". And imagine what will happen in a month! And how will a new programmer understand him, who has not seen the code before? In our example, the context is restored due to proper naming, but in real life the code is much more complicated, and therefore it is often impossible to guess the meaning of numbers.

This “smell” is called magic numbers. Numbers whose origin is impossible to understand without a deep knowledge of what is happening inside this part of the code.

The way out is simple: it is enough to create variables with the correct names, how everything will fall into place.

```java

var dollarsInEuro = 1.25;
var roublesInDollar = 60;

var euros = 1000;
var dollars = euros * dollarsInEuro; // => 1250
var rubles = dollars * roublesInDollar; // => 75000

System.out.print(rubles);
```

Pay attention to the following details:

* Naming _lowerCamelCase_
* Two new variables are separated from subsequent calculations by a blank line. These variables make sense without computations, so this separation is appropriate, it improves readability.
* It came out well-named and structured code, but it is longer than the previous version. This is often the case, and this is normal, because the code should be readable.
