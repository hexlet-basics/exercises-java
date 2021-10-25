import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.normalizeUrl("yandex.ru")).isEqualTo("https://yandex.ru");
        assertThat(App.normalizeUrl("https://yandex.ru")).isEqualTo("https://yandex.ru");
    }
}
