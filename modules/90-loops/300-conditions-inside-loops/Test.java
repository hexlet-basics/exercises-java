import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
  expect(f('axe', 'a')).toEqual(1);
  expect(f('', 'a')).toEqual(0);
  expect(f('OpPa', 'p')).toEqual(2);
  expect(f('OpPa', 'P')).toEqual(2);
        final var expected = "3\n2\n1\nfinished!";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.printNumbers(3);

        final var actual = out.toString().trim();

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        System.out.println(actual);

        assertThat(actual).isEqualTo(expected);
    }
}
