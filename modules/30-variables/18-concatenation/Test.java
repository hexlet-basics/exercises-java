import java.io.*;

class Test {
    public static void main(String[] args) {
        final var expected = "Hello, Joffrey!\n" +
                "Here is important information about your account security.\n" +
                "We couldn't verify you mother's maiden name.";

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        final PrintStream normal = System.out;
        System.setOut(new PrintStream(baos));
        App.main(new String[] {});
        System.setOut(normal);

        final String grabbed = new String(baos.toByteArray(), java.nio.charset.Charset.defaultCharset());
        System.out.println(grabbed);

        assert expected.equals(grabbed);
    }
}