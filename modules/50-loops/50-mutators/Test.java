import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        final var str = "If I look back I am lost";
        assertThat(App.filterString(str, 'I')).isEqualTo("f  look back  am lost");
        assertThat(App.filterString(str, 'o')).isEqualTo("If I lk back I am lst");
    }
}
