import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        var actual1 = App.truncate("текст", 3);
        assertThat(actual1).isEqualTo("тек...");

        var actual2 = App.truncate("и пошла вода", 5);
        assertThat(actual2).isEqualTo("и пош...");
    }
}
