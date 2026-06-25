Посмотрите на определение метода, который возвращает модуль переданного числа:

```java
// Если больше нуля, то выдаем само число. Если меньше, то убираем знак
public static int abs(int number) {
  if (number >= 0) {
    return number;
  }

  return -number;
}

App.abs(10);  // 10
App.abs(-10); // 10
```

В Java существует конструкция, которая по своему действию аналогична `if-else`, но при этом является выражением. Она называется **тернарный оператор**.

Тернарный оператор — единственный в своем роде оператор, требующий три операнда. Он помогает писать меньше кода для простых условных выражений. Наш пример выше с тернарным оператором сокращается до одной строки:

```java
public static int abs(int number) {
  return number >= 0 ? number : -number;
}
```

Общий шаблон выглядит так:

```java
<predicate> ? <expression on true> : <expression on false>
```

Сначала записывается логическое выражение, а дальше два варианта поведения:

1. Если условие истинно, вычисляется вариант до двоеточия
2. Если условие ложно, вычисляется вариант после двоеточия

Перепишем через тернарный оператор метод, который определяет тип предложения.

Было:

```java
public static String getTypeOfSentence(String sentence) {
    if (sentence.endsWith("?")) {
        return "question";
    }

    return "general";
}
```

Стало:

```java
public static String getTypeOfSentence(String sentence) {
    return sentence.endsWith("?") ? "question" : "general";
}

App.getTypeOfSentence("Hodor");  // "general"
App.getTypeOfSentence("Hodor?"); // "question"
```

Тернарный оператор можно вкладывать в другой тернарный оператор. Но это считается плохой практикой, такой код тяжело читать.
