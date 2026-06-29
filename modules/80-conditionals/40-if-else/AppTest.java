import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    public static void main(String[] args) {
        assertThat(App.normalizeUrl("yandex.ru")).isEqualTo("https://yandex.ru");
        assertThat(App.normalizeUrl("https://yandex.ru")).isEqualTo("https://yandex.ru");
    }
}
