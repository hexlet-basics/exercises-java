Переменные и конкатенацию можно объединять. Синтаксически ничего не меняется, ведь мы умеем конкатенировать — то есть склеивать две строки:

```java
var what = "Kings" + "road";
System.out.println(what); // => Kingsroad
```

Значит, мы сумеем конкатенировать строку и одну переменную, в которой записана строка:

```java
var first = "Kings";
var what = first + "road";
System.out.println(what); // => Kingsroad
```

Можно даже конкатенировать две переменные, в которых записаны строки:

```java
var first = "Kings";
var last = "road";
var what = first + last;
System.out.println(what); //=> Kingsroad
```

https://replit.com/@hexlet/java-basics-variables-4
