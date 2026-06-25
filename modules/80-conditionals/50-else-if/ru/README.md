Метод `getTypeOfSentence` различает только вопросительные и обычные предложения. Добавим в него поддержку восклицательных предложений. Сделаем это сначала через две отдельные проверки `if`:

```java
public static String getTypeOfSentence(String sentence) {
    String sentenceType = "";

    if (sentence.endsWith("?")) {
        sentenceType = "question";
    }

    if (sentence.endsWith("!")) {
        sentenceType = "exclamation";
    } else {
        sentenceType = "general";
    }

    return "Sentence is " + sentenceType;
}

App.getTypeOfSentence("Who?"); // "Sentence is general"
App.getTypeOfSentence("No");   // "Sentence is general"
App.getTypeOfSentence("No!");  // "Sentence is exclamation"
```

Технически этот код работает, но вопросительные предложения трактует неверно. Есть и проблема с семантикой. Наличие восклицательного знака проверяется в любом случае, даже когда уже нашелся вопросительный знак. Ветка `else` относится ко второму условию, но не к первому. Поэтому вопросительное предложение получает тип `"general"`.

Чтобы выстроить проверки в единую цепочку, конструкция `if` поддерживает ветку `else if`. Такой вариант подходит, когда проверок много и они исключают друг друга:

```java
if (/* что-то */) {

} else if (/* другая проверка */) {

} else if (/* другая проверка */) {

} else {

}
```

Здесь обратите внимание на два момента:

- Ветка `else` может отсутствовать
- Количество веток `else if` может быть любым

Перепишем метод с `else if`:

```java
public static String getTypeOfSentence(String sentence) {
    String sentenceType;

    if (sentence.endsWith("?")) {
        sentenceType = "question";
    } else if (sentence.endsWith("!")) {
        sentenceType = "exclamation";
    } else {
        sentenceType = "general";
    }

    return "Sentence is " + sentenceType;
}

App.getTypeOfSentence("Who?"); // "Sentence is question"
App.getTypeOfSentence("No");   // "Sentence is general"
App.getTypeOfSentence("No!");  // "Sentence is exclamation"
```

Теперь все условия выстроены в единую конструкцию. Оператор `else if` означает "если не выполнено предыдущее условие, но выполнено текущее".

```text
  ┌─────────────────┐
  │ условие 1?      │
  └────┬────────┬───┘
  true │        │ false
        ↓        ↓
┌──────────┐  ┌─────────────────┐
│ тело if  │  │ условие 2?      │
└──────────┘  └────┬────────┬───┘
              true │        │ false
                    ↓        ↓
            ┌───────────┐ ┌──────────┐
            │тело else if│ │ тело else│
            └───────────┘ └──────────┘
```

Логика метода устроена так:

- Если последний символ `?`, то тип `"question"`
- Иначе, если последний символ `!`, то тип `"exclamation"`
- Иначе тип `"general"`

В итоге выполнится только один из блоков, относящихся ко всей конструкции `if`.
