import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class Test {
    public static void main(String[] args) {
        final var expected = "01-01-2001";

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        final PrintStream normal = System.out;
        System.setOut(new PrintStream(baos));
        App.getFormattedBirthday(1, 1, 2001);
        System.setOut(normal);

        final String grabbed = new String(baos.toByteArray(), java.nio.charset.Charset.defaultCharset());
        System.out.println(grabbed);

        assert expected.equals(grabbed);
    }
}