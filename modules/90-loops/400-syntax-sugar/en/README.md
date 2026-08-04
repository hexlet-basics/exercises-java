Repeating constructs occur often in programming. In Java, as in many other languages, their notation can be shortened. Such simplifications are called **syntactic sugar**. They make writing code shorter and more pleasant, keeping the same result.

## Shortened forms of assignment

The value of a variable is often changed by adding or subtracting something, multiplying or dividing by a number. The basic variant looks like this:

```java
index = index + 1;
count = count * 2;
total = total - 5;
price = price / 3;
```

Java allows you to write the same thing shorter, with the help of compound operators:

```java
index += 1; // the same as index = index + 1
count *= 2; // the same as count = count * 2
total -= 5; // the same as total = total - 5
price /= 3; // the same as price = price / 3
```

Each such operator takes the current value of the variable, applies the operation and saves the result into the same variable. On the left there is always the name of the variable into which the new value will be written.

## Sugar in loops

In loops such shortenings occur especially often. In them the counter is usually changed and the result is accumulated:

```java
var sum = 0;
var index = 1;

while (index <= 5) {
    sum += index;  // the same as sum = sum + index
    index += 1;    // the same as index = index + 1
}

System.out.println(sum); // => 15
```

Without the shortenings the body of the loop would be longer and more verbose:

```java
while (index <= 5) {
    sum = sum + index;
    index = index + 1;
}
```

## Concatenating strings

Compound operators work not only with numbers. For strings `+=` is suitable, because `+` joins strings:

```java
var text = "Hello";
text += " World"; // the same as text = text + " World"
// "Hello World"
```

That is why, when assembling a string in a loop, the counter is changed through `+=`, and the next character is appended to the result every time with the same operator.

## The supported shortenings

Almost every operator has a shortened form: `+=`, `-=`, `*=`, `/=`, `%=`. All of them work on one principle — they take the current value of the variable, apply the operation and put the result back.

Changing a variable by one stands apart. The notation `index += 1` can be shortened to `index++`, and `index -= 1` to `index--`. These two operations are called increment and decrement, they have their own subtleties, and a separate conversation is dedicated to them.
