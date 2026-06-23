import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

class Test {
  public static void main(String[] args) {
    final var expected = "support@hexlet.io";

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));

    App.main(null);

    String answer = out.toString();
    if (answer != null && answer.endsWith("\n")) {
      // remove linefeed added by println
      answer = answer.substring(0, answer.length() - 1);
    }
    final var actual = answer;

    System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    System.out.println(actual);

    assertThat(actual).isEqualTo(expected);
  }
}
