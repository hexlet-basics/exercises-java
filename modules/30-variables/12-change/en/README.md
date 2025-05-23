
The word "variable" itself means that it can be changed. Indeed, over time within the program, the values of the variables may change.

```java
// greeting - translated as greeting
var greeting = "Father!";
System.out.print(greeting);
System.out.print(greeting);
greeting = "Mother!";
System.out.print(greeting);
System.out.print(greeting);
```

The name remains the same, but inside the other data. It should be noted that when changing variables, the type of data contained in them cannot change (this is not quite the case for object-oriented programming, but for the time being we will not go into details). If a variable was assigned a string, then when compiling this assignment — even before the program was started — java associates the data type “string” with this variable, and knows that there will always be only strings, and will not let it put something else in it.

Variables are powerful, and at the same time dangerous thing. One can never be exactly sure what is written inside it without analyzing the code that is in front of the variable. This is exactly what the developers are doing during debugging, when they are trying to figure out why the program is not working or is not working as intended.
