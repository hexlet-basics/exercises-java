When working with strings, we often solve the same task — extract a part of the string. Get the year from a date, the name from a full name, or the first characters from an email address. In Java, the string has the `substring()` method for this.

## What a substring is

A substring is a part of a string that is contained inside another string. In the string `"12-08-2034"`, a substring can be `"2034"`, `"12"`, or even `"-"`. It all depends on what information you need to extract.

Suppose only the year `"2034"` is needed. Each character of the string has its own index (position), counting starts from zero:

```text
'1' '2' '-' '0' '8' '-' '2' '0' '3' '4'
 0   1   2   3   4   5   6   7   8   9
```

The year starts at index `6` and ends at `9`. To extract it, you call the `substring()` method on the string with two arguments:

```java
var value = "12-08-2034";
var year = value.substring(6, 10);
System.out.println(year); // => 2034
```

The method is called on the string through a dot. The first argument sets the start index, the second sets the end index. The call format is:

```java
string.substring(start, end)
```

The character at the start index is included in the result, but the character at the end index is not. It is convenient to think of the end as the ordinal number of the character you want to take as the last one.

```java
var value = "code-basics";

System.out.println(value.substring(5, 11)); // => basics (indexes 5 through 10)
System.out.println(value.substring(0, 7));  // => code-ba (indexes 0 through 6)
System.out.println(value.substring(2, 6));  // => de-b
```

How do you count all this? When working with a specific string, we almost always count by eye.

## A substring is also a string

The `substring()` method returns a string, even if there are only digits inside. So the result is used as an ordinary string — printed, joined, passed to other methods. The result of one call can be passed straight into the next:

```java
var value = "01-12-9873";

var part = value.substring(3, 7); // => 12-9
System.out.println(part.substring(0, 2)); // => 12
```

First we got the substring `"12-9"`, and then extracted a new substring `"12"` from it.

## A substring to the end of the string

Sometimes a part of the string is needed from some character all the way to the end. For this, `substring()` has a variant with one argument. It sets only the start index, and the method itself takes the end equal to the end of the string.

```java
var value = "Hexlet";

System.out.println(value.substring(3)); // => let (from character 3 to the end)
```

The call `value.substring(3)` takes characters from index `3` and further to the end of the string. The length of the string `"Hexlet"` is `6`, so `value.substring(3)` and `value.substring(3, 6)` give the same result `let`. When the end matches the length of the string, the second argument can be omitted.

## Going out of the string bounds

The indexes must fall inside the string. If you pass an index greater than the string length, the method throws an error:

```java
var value = "Hexlet";
System.out.println(value.substring(0, 10));
// StringIndexOutOfBoundsException
```

The string `"Hexlet"` has six characters, so the end index cannot be greater than `6`. We passed `10`, and the method terminated with a `StringIndexOutOfBoundsException` error. Before the call, you should make sure that the indexes are within the string bounds.

The main thing is to understand the basic structure `string.substring(start, end)`, and in practice these calls will quickly become a habit.
