import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class Test {

    public static void main(String[] args) {
        String expected = "420262531";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(null);

        String actual = out.toString();

        if (!expected.equals(actual)) {
            throw new AssertionError("\"" + expected + "\" does not equal to \"" + actual + "\"");
        }

    }

}
