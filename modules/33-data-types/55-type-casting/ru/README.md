В программировании регулярно встречаются задачи, когда один тип данных нужно преобразовать в другой. Простейший пример – работа с формами на сайтах.

Данные формы всегда приходят в текстовом виде, даже если значение число. Вот как его можно преобразовать:

```java
// станет int
var number = Integer.parseInt("345");
System.out.println(number); // => 345
```

Если нужно конвертировать из примитивного типа в примитивный, то все проще. Достаточно перед значением указать в скобках желаемый тип. В результате значение преобразуется в значение другого типа, указанного в скобках:

```java
var result = (int) 5.1;
System.out.println(result); // => 5
```

Преобразование типов можно использовать внутри составных выражений:

```java
// Дополнительные скобки помогают визуально отделить части выражения друг от друга
var result = 10 + ((int) 5.1);
System.out.println(result); // => 15
```
