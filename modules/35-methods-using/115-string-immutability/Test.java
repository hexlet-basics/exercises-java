import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

import static org.assertj.core.api.Assertions.assertThat;

class Test {

    public static void main(String[] args) {
        final var expected = "support@hexlet.io";
        final var actual = App.normalize();
        assertThat(expected).isEqualTo(actual);
    }

}
