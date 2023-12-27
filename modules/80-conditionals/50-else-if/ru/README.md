В самой полной версии конструкция `if` содержит не только ветку `else`, но и другие условные проверки с помощью `else if`. Такой вариант используется при большом количестве проверок, которые взаимоисключают друг друга:

```java
if (/* что-то */) {

} else if (/* другая проверка */) {

} else if (/* другая проверка */) {

} else {

}
```

Здесь стоит обратить внимание на два момента:

* Ветка `else` может отсутствовать
* Количество `else if` условий может быть любым

Напишем для примера расширенный метод определяющий тип предложения. Он распознает три вида предложений:

```java
App.getTypeOfSentence("Who?"); // "Sentence is question"
App.getTypeOfSentence("No");   // "Sentence is general"
App.getTypeOfSentence("No!");  // "Sentence is exclamation"

public static String getTypeOfSentence(String sentence)
{
    var sentenceType = "";

    if (sentence.endsWith("?")) {
        sentenceType = "question";
    } else if (sentence.endsWith("!")) {
        sentenceType = "exclamation";
    } else {
        sentenceType = "general";
    }

    return "Sentence is " + sentenceType;
}
```

https://replit.com/@hexlet/java-basics-if-else

Теперь все условия выстроены в единую конструкцию. Оператор `else if` — это «если не выполнено предыдущее условие, но выполнено текущее». Получается такая схема:

- Если последний символ `?`, то "question"
- Иначе, если последний символ `!`, то "exclamation"
- Иначе "general"

В итоге выполнится только один из блоков кода, относящихся ко всей конструкции `if`.
