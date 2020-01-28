import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Test {

    public static void main(String[] args) {
        String expected = "What Is Dead May Never Die";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(null);

        String actual = out.toString();

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        System.out.println(actual);

        assertThat(actual).isEqualTo(expected);

    }

}
