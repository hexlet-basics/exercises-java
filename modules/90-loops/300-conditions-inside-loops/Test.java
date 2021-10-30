import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.countChars("axe", 'a')).isEqualTo(1);
        assertThat(App.countChars("", 'a')).isEqualTo(0);
        assertThat(App.countChars("OpPa", 'p')).isEqualTo(2);
        assertThat(App.countChars("OpPa", 'P')).isEqualTo(2);
    }
}
