Конструкция `if` умеет проверять условие и выполнять блок кода, когда оно истинно. У нее есть продолжение. Ветка `else` задает блок, который выполнится, если условие в `if` оказалось ложным:

```java
if (x > 5) {
    // Выполнится, если условие true
} else {
    // Выполнится, если условие false
}
```

Посмотрите на метод ниже. Он определяет тип предложения по последнему символу. Если предложение оканчивается знаком вопроса, метод вернет `Sentence is question`, иначе вернет `Sentence is general`:

```java
public static String getTypeOfSentence(String sentence) {
    String sentenceType;

    if (sentence.endsWith("?")) {
        sentenceType = "question";
    } else {
        sentenceType = "general";
    }

    return "Sentence is " + sentenceType;
}

App.getTypeOfSentence("Hodor");  // "Sentence is general"
App.getTypeOfSentence("Hodor?"); // "Sentence is question"
```

Мы добавили `else` и новый блок. Он выполнится, если условие в `if` окажется ложным. Слово `else` переводится как "иначе".

```text
      ┌───────────┐
      │ условие?  │
      └─────┬─────┘
  true │           │ false
      ↓           ↓
┌──────────┐ ┌──────────┐
│ тело if  │ │ тело else│
└──────────┘ └──────────┘
```

В блок `else` можно вкладывать другие условия `if`:

```java
int number = 10;

if (number > 10) {
    System.out.println("Number is greater than 10");
} else {
    if (number == 10) {
        System.out.println("Number is exactly 10");
    } else {
        System.out.println("Number is less than 10");
    }
}
```

## Два способа оформить if-else

Конструкцию `if-else` можно записать двумя способами. С помощью отрицания меняется порядок блоков:

```java
public static String getTypeOfSentence(String sentence) {
    String sentenceType;

    if (!sentence.endsWith("?")) {
        sentenceType = "general";
    } else {
        sentenceType = "question";
    }

    return "Sentence is " + sentenceType;
}
```

Чтобы конструкцию было удобнее оформлять, выбирайте проверку без отрицаний и подстраивайте содержимое блоков под нее.

## Когда else не нужен

Если ветка `if` содержит `return`, то `else` можно опустить. После `return` метод завершается, и следующая строка выполнится только тогда, когда условие в `if` оказалось ложным:

```java
public static String getTypeOfSentence(String sentence) {
    if (sentence.endsWith("?")) {
        return "question";
    }

    // Сюда попадаем, только если условие выше ложно
    return "general";
}
```

Такой стиль убирает лишнюю вложенность. Чем проще выглядит метод, тем легче читать его логику.
