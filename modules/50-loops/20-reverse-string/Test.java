import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.mysubstr("got", 3)).isEqualTo("got");
        assertThat(App.mysubstr("got", 2)).isEqualTo("go");
        assertThat(App.mysubstr("got", 1)).isEqualTo("g");
    }
}
