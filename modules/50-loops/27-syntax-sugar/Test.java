import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        final String str = "If I look back I am lost";
        assertThat(App.countChars(str, 'I')).isEqualTo(3);
        assertThat(App.countChars(str, 'z')).isEqualTo(0);
        assertThat(App.countChars(str, 'o')).isEqualTo(3);
    }
}
