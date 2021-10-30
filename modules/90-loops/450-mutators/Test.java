import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        var text = "I never look back";
        assertThat(App.makeItFunny(text, 3)).isEqualTo("I NevEr LooK bAck");
        assertThat(App.makeItFunny("hello", 2)).isEqualTo("hElLo");
    }
}
