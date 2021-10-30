public class App {
    public static void printNumbers(int firstNumber) {
const countChars = (str, char) => {
        // BEGIN
  let i = 0;
  let count = 0;
  while (i < str.length) {
    if (str[i].toLowerCase() === char.toLowerCase()) {
      count += 1;
    }
    i = i + 1;
  }

  return count;
};
        var i = firstNumber;
        while (i >= 1) {
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("finished!");
        // END
    }
}
