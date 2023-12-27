
To consolidate the previous topic, try using variables with concatenation. Syntactically nothing changes: we can concatenate (glue) two lines:

```java

var what = "Kings" + "road";
System.out.print(what); // => "Kingsroad"
```

... which means we can concatenate a string and one variable in which the string is written:

```java

var first = "Kings";
var what = first + "road";

System.out.print(what); // => "Kingsroad"
```

... and even concatenate two variables in which the lines are written:

```java

var first = "Kings";
var last = "road";

var what = first + last;
System.out.print(what); // => "Kingsroad"
```
