import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.isPensioner(70)).isTrue();
        assertThat(App.isPensioner(50)).isFalse();
        assertThat(App.isPensioner(60)).isTrue();
        assertThat(App.isPensioner(59)).isFalse();
    }
}
