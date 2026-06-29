import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    public static void main(final String[] args) throws Exception {
        final var code = Files.readString(Path.of("App.java"));

        assertThat(code).containsPattern("//\\s*TODO");
    }
}
