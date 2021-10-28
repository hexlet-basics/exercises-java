import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.assertj.core.api.Assertions;

class Test {
    public static void main(final String[] args) {
        final var expected = "Hello, World!";

        App.main(null);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(null);

        final var actual = out.toString().trim();

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
