
Implement the method `getHiddenCard()`, which accepts a credit card number (consisting of 16 digits) as a string and returns its hidden version, which can be used on a site for display. If the original card had the number *2034399002125581*, then the hidden version looks like this *\*\*\*\*5581*. In other words, the function replaces the first 12 characters with asterisks. The number of asterisks is controlled by the second, optional parameter. The default value is 4.

```java
// The credit card is passed inside as a string
App.getHiddenCard("1234567812345678", 2); // "**5678"
App.getHiddenCard("1234567812345678", 3); // "***5678"
App.getHiddenCard("1234567812345678"); // "****5678"
App.getHiddenCard("2034399002121100", 1); // "*1100"
```

To complete the task you will need the string method `repeat`, which repeats the string the specified number of times

```java
"+".repeat(5); // "+++++"
"o".repeat(5); // "ooooo"
```
