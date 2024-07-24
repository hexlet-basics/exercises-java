Порядок инструкций в коде с переменными имеет огромное значение. Переменная должна быть определена до того, как будет использована. Ниже пример ошибки, которую очень часто допускают новички:

```java
System.out.println(greeting);
var greeting = "Father!";
```

Запуск программы выше завершается с ошибкой:

```text
Error: java: cannot find symbol
symbol: variable greeting
```

Ошибка **cannot find symbol** означает, что в коде используется переменная, которая не определена. Причем в самой ошибке об этом говорят прямо: `variable greeting`.

Кроме неправильного порядка определения, еще встречаются банальные опечатки, причем как при использовании переменной, так и при ее объявлении.

Еще одна распространенная ошибка — попытаться объявить уже объявленную переменную:

```java
var greeting = "Father!";
var greeting = "Father!";
```

Так делать нельзя. Придется создать новую переменную.

Количество подобных ошибок уменьшается за счет использования правильно настроенного редактора. Такой редактор подсвечивает имена, которые используются без объявления, и предупреждает о возможных проблемах.