import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;

class Test {
    public static void main(String[] args) {
        var expected = 27;

        final int actual = App.getCurrentYear();

        assertThat(actual).isEqualTo(expected);
    }
}
