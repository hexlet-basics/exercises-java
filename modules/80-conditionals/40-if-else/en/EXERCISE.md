
Implement the method `normalizeUrl()`, which performs the so-called normalization of data. It accepts the address of a site and returns it with *<https://*> at the beginning.

The method accepts addresses in the form _ADDRESS_ or <https://ADDRESS>, but always returns the address in the form <https://ADDRESS>

You can use the `startsWith()` method to check whether the string starts with the prefix *<https://*>. And then, based on that, add or not add *<https://*>.

```java
App.normalizeUrl("google.com"); // "https://google.com"
App.normalizeUrl("https://ai.fi"); // "https://ai.fi"
```
