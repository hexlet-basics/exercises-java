import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;

class AppTest {
    public static void main(String[] args) {
        var date = LocalDate.now();
        assertThat(App.notToday(date.toString())).isFalse();
        assertThat(App.notToday("2015-15-15")).isTrue();
    }
}
