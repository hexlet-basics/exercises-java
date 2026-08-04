
On the electronic map of Westeros that Sam implemented, the allies of the Starks are shown with a green circle, the enemies with a red one, and the neutral families with a gray one.

Write a method `whoIsThisHouseToStarks()` for Sam, which accepts the name of a family and returns one of three values: `"friend"`, `"enemy"`, `"neutral"`.

The rules for determining it:

  * Friends (`"friend"`): "Karstark", "Tally"
  * Enemies (`"enemy"`): "Lannister", "Frey"
  * Any other families are considered neutral

Examples of calls:

```java
App.whoIsThisHouseToStarks("Karstark"); // "friend"
App.whoIsThisHouseToStarks("Frey");     // "enemy"
App.whoIsThisHouseToStarks("Joar");     // "neutral"
App.whoIsThisHouseToStarks("Ivanov");   // "neutral"
```
