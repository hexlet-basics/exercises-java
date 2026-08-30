In programming, many methods have parameters that rarely change. It is often convenient to give such a parameter one value and substitute it when nothing else was passed in the call. Such a value is called a **default value**.

In many languages the default value is written right in the definition. For example, in Python the method for raising to a power looks like this:

```python
# The exponent is the second parameter with the default value 2
def pow(x, base=2):
    return x**base


pow(3)  # 9, by default we raise to the second power
pow(3, 3)  # 27, the exponent is passed explicitly
```

In Java parameters have no default values. But the same result is achieved through **method overloading**.

What is that? Java allows you to create several methods with the same name. Such identical methods must have:

- Different types of input parameters
- A different number of parameters
- Or all of that at the same time

Let's look at the example of a method that adds numbers. We will create two versions of `sum()` in one class. The first accepts two numbers, the second accepts only one and adds 10 to it:

```java
class App {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x) {
        return x + 10;
    }
}

App.sum(2, 3); // 5, the version with two parameters worked
App.sum(2);    // 12, the version with one parameter worked
```

The compiler will create two methods with one name without any problems. How does Java know which one of them to call?

During compilation the version of the method that matches by the type and the number of parameters is chosen. When there is no suitable method, the compiler reports an error.

We have already met at least one overloaded method — it is the `substring()` method. By default it extracts the substring up to the end, but a second parameter can be passed to it that will limit the length:

```java
// Two different methods with one name are called
"hexlet".substring(3); // "let"
"hexlet".substring(3, 5); // "le"
```

Method overloading can lead to code duplication, especially when it comes to default values. In such situations the logic is the same, and the difference is only in the initial initialization.

To reduce duplication it is enough to take two steps:

- First, define a common method that accepts the most parameters
- Then call it from those methods that have default values

In code it looks like this:

```java
class App {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x) {
        // We call the already existing summation method
        return App.sum(x, 10);
    }
}
```

In this example we did not shorten the code, but it clearly shows the principle described above.
