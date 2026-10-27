import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {
    public static void main(final String[] args) {
        final var expected = "Order #1337\nStatus: in delivery\nEstimated time: 2 days";

        App.main(null);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(null);

        final var actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }
}
