import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class Test {
    public static void main(String[] args) throws Exception{
        final var expected = "Rhaella Targaryen";

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