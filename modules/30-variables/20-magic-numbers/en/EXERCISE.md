
You are faced with this code, which displays the total number of rooms in the possession of the current king:

```java
var king = "King Balon the 6th";
System.out.print(king + "has" + (6 * 17) + "rooms.");
```

As you can see, these are magic numbers: it is not clear what 6 is and what 17. It is possible to guess if you know the history of the royal family: each new king inherits all the castles from their ancestors and builds a new castle - an exact copy of the parent.

This strange dynasty just breeds the same castles ...

Get rid of the magic numbers by creating new variables, and then display the text.

It will turn out like this:

```
King Balon the 6th has 102 rooms.
```

Variable names should convey the meaning of numbers, but at the same time they should remain sufficiently short and capacious for comfortable reading.

Remember: the code will work with any names, and our system always checks only the result on the screen, so the execution of this task is under your responsibility.
