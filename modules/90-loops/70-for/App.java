public class App {
    // BEGIN
    public static int sumOfSeries(int start, int finish) {
        /*
         * Обратите внимание: мы создали новую переменную,
         * и не используем аргумент в качестве счётчика.
         * Счётчик будет меняться в процессе выполнения функции,
         * а изменять аргументы — плохая пратика.

         * Note: we create a new variable here,
         * rather than use the argument as a counter.
         * Counter will be changing as the function works,
         * and changing arguments is considered harmful.
         */

        var sum = 0;
        for (var i = start; i <= finish; i++) {
            sum += i;
        }

        return sum;
    }
    // END
}
