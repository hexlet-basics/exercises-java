import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

class Test {

    public static void main(String[] args) {
        final String expected = "Hello, World!";

        final String actual = getConsoleStdIn();

        assert !actual.contains("Error:") : "\n" + actual;

        System.out.println(actual);

        final var errorMsg = "\nExpected value: <%s>\nmust be equal to:\nActual value:   <%s>\nbut was not.";
        assert expected.equals(actual) : String.format(errorMsg, expected, actual);
    }

    private static String getConsoleStdIn() {
        return new BufferedReader(new InputStreamReader(System.in))
                .lines()
                .collect(Collectors.joining("\n"))
                .replace("-> ", "");
    }
}
