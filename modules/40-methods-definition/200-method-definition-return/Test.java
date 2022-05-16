import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;

class Test {
    public static void main(String[] args) {
        var expected = "hurray! hurray! hurray!";

        final String actual = App.sayHurrayThreeTimes();

        assertThat(actual).isEqualTo(expected);
    }
}
