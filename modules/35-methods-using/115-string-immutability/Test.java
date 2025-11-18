import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        final var expected = "support@hexlet.io";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(null);

        final var actual = out.toString();

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        assertThat(actual).isEqualTo(expected);
    }
}
