
import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.*;

class Test {
    public static void main(String[] args) {
        var date = new Date();
        date.setYear(2000);
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");

        final var expected = format1.format(date);

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        final PrintStream normal = System.out;
        System.setOut(new PrintStream(baos));
        App.main(new String[] {});
        System.setOut(normal);

        final String grabbed = new String(baos.toByteArray(), java.nio.charset.Charset.defaultCharset());
        System.out.println(grabbed);

        assert expected.equals(grabbed);
    }
}