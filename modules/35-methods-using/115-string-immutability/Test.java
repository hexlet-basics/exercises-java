import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        final var expected = "support@hexlet.io";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(null);

        var actual = out.toString();

        if (actual.endsWith(System.lineSeparator())) { // delete a newline character because println adds one
            actual = actual.substring(0, actual.length() - System.lineSeparator().length());
        }

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        System.out.println(actual);

        assertThat(actual).isEqualTo(expected);
    }
}
