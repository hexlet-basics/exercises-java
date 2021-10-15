import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(final String[] args) {
        final String expected = "Hello, World!\n";

        App.main(null);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(null);

        final String actual = out.toString();

        assertThat(actual).isEqualTo(expected);
    }
}
