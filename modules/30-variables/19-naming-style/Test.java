import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        final var expected = "-1100";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(null);

        final var actual = out.toString().trim();

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        System.out.println(actual);

        assertThat(actual).isEqualTo(expected);
    }
}
