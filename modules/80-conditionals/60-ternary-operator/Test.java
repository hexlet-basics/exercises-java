import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.convertString("hey")).isEqualTo("yeh");
        assertThat(App.convertString("Hey")).isEqualTo("Hey");
        assertThat(App.convertString("")).isEqualTo("");
    }
}
