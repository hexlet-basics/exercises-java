
Напишите код, который берет данные из переменной `name` и выполняет капитализацию. В программировании так называют операцию, которая делает заглавной первую букву в слове, а все остальные переводит в нижний регистр. Например: *heXlet => Hexlet*. Программа должна выводить результат на экран.

Для извлечения частей слова, воспользуйтесь методом [substring()](https://ru.hexlet.io/qna/java/questions/kak-izvlech-podstroku-iz-stroki-v-java?utm_source=code-basics&utm_medium=referral&utm_campaign=qna&utm_content=lesson):

```java
// 1 параметр – начальный индекс, 2 – конечный индекс (не включая)
"hexlet".substring(0, 1); // "h"
// По умолчанию до конца строки
"hexlet".substring(1); // "exlet"
```
