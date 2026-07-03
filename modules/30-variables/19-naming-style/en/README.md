`greeting` serves as an example of a simple and clear variable name. But names like `name`, `email`, or `price` are often not enough. For example, you need to describe a user's name, the total number of orders, the maximum length of a message. Such names already consist of several words. What will a variable name look like in that case?

Different programming languages use different naming styles. This determines what a compound name looks like. For example, here is how you can write a variable that stores the maximum length of a message:

1. `maxmessagelength`
1. `maxMessageLength`
1. `max-message-length`
1. `max_message_length`

## Main styles

In variable naming, four main approaches can be distinguished. All of them show up when a name consists of several words:

- kebab-case: words are separated by a hyphen, for example `max-message-length`.

  Does not work in Java, because the hyphen is treated as the subtraction operator.

- snake_case: words are separated by an underscore, for example `max_message_length`.

- CamelCase (or UpperCamelCase): each word starts with a capital letter without separators, for example `MaxMessageLength`.

- lowerCamelCase: the same, but the first word starts with a lowercase letter, for example `maxMessageLength`.

## How to do it correctly in Java

For variable names in Java, the lowerCamelCase style is adopted. Words are joined together, and each word except the first is written with a capital letter:

```java
var userName = "Daenerys";
var maxLength = 280;
var totalOrdersCount = 17;
```

- The first word starts with a lowercase letter
- Each following word starts with a capital letter
- There are no separators between words

Let's look at this in code:

```java
var firstName = "John";
System.out.println(firstName); // => John

var playerNumber = 24;
System.out.println(playerNumber); // => 24
```

## How not to do it

You should not include the data type in a variable name. Such names are harder to read and quickly become outdated. For example, `userNameString` or `messagesNumber` describe not the meaning of the variable, but its technical implementation.

A name should answer the question "what is stored?", not "what type is it?". That is why it is better to write `userName` instead of `userNameString` and `messagesCount` instead of `messagesNumber`.
