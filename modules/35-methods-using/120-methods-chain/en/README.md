Data processing can consist of a large number of steps that need to be performed one after another.

Let's take as an example the following task: form a web page address based on the article title entered by the user. Such a task often arises when publishing articles in blogs. Such addresses look like this:

```text
https://ru.hexlet.io/blog/posts/iz-vahtovika-v-programmirovanie
```

The last part here, *iz-vahtovika-v-programmirovanie*, is created automatically by code that we wrote at Hexlet. It has a special name — it is a [**slug**](https://en.wikipedia.org/wiki/Clean_URL#Slug).

What steps need to be performed to get such a string? Here are just some of them:

* Convert everything to lowercase, so that duplicates of identical pages are not accidentally created in search engines
* Clean the title of whitespace characters at the edges. They can accidentally appear during input
* Perform transliteration, because it is better to use Latin alphabet characters in addresses
* Cut out special characters like question marks and exclamation marks
* Replace spaces with hyphens

Some of the steps require knowledge that is new to us, so we will skip them. The remaining steps will look approximately like this:

```java
// The title entered by the user. In English for simplicity
var name = " How much is the fish?   \n";
// cut out the edge spaces and the line break
name = name.trim();
// Remove the question mark
name = name.replace("?", "");
// Replace spaces with a hyphen
name = name.replace(" ", "-");
// Convert to lowercase
name = name.toLowerCase();
System.out.println(name); // => how-much-is-the-fish
```

If you look closely at this code, you can notice a common pattern. A method returns data that we assign to a variable, and then we process it further down the chain.

## Method chain

This pattern can be simplified by removing the intermediate rewriting of the variable. A method returns a new string, and the next method is immediately applied to this string. This technique is called **method chaining**.

```java
var name = " How much is the fish?   ";
name = name.trim().replace("?", "").replace(" ", "-").toLowerCase();
System.out.println(name); // => how-much-is-the-fish
```

The methods are called one after another, like links in a chain. This allows writing compact and readable code. If the chain becomes too long, it can be split into several lines:

```java
name = name.trim()
    .replace("?", "")
    .replace(" ", "-")
    .toLowerCase();
```

Despite the convenience of this mechanism, it should not be overused. Intermediate variables sometimes make the code easier to understand.

## Order of evaluation

In a method chain, the order of execution goes from left to right. Each next method is called on the result of the previous one:

```java
var text = "  hExLeT  ";
System.out.println(text.trim().toLowerCase().replace("h", "x")); // => xexlet
```

1. `"  hExLeT  "` is the original string.
2. `trim()` removes the spaces at the edges and returns `"hExLeT"`.
3. `toLowerCase()` converts to lowercase and returns `"hexlet"`.
4. `replace("h", "x")` replaces `"h"` with `"x"` and returns `"xexlet"`.

The same result is obtained without a chain, through intermediate variables:

```java
var text = "  hExLeT  ";
var step1 = text.trim();                 // "hExLeT"
var step2 = step1.toLowerCase();         // "hexlet"
var step3 = step2.replace("h", "x");     // "xexlet"
System.out.println(step3);
```

Each method returns a new string, and the next method is applied to it.

```text
"  hExLeT  ".trim().toLowerCase().replace("h", "x")
             │       │              │
             ↓       ↓              ↓
          "hExLeT"   │              │
                  "hexlet"          │
                              "xexlet"
```

In the chain, you simply move from left to right, reading it like an ordinary sentence. If you mix up the order, the result may differ. For example, replacing spaces will work differently if you do it before removing the edge spaces. In some situations, the outcome will coincide by chance, in others the order will really affect the result.

## Where the chain ends

The chain can be continued as long as the result remains a string or another type that has methods. If a method returns a number or another primitive type, you can no longer call further methods:

```java
var text = "hexlet";
var index = text.toUpperCase().indexOf("E");
System.out.println(index); // => 1
```

The `indexOf()` method returns the number `1`, that is, the position of the first character `"E"` in the string `"HEXLET"`. A number has no string methods, so the chain ends here.

Method chains serve as a convenient way to combine several operations on a value without intermediate variables.
