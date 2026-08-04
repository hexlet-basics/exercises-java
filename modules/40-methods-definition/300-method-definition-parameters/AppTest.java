import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    public static void main(String[] args) {
        var actual1 = App.truncate("text", 3);
        assertThat(actual1).isEqualTo("tex...");

        var actual2 = App.truncate("and water flowed", 5);
        assertThat(actual2).isEqualTo("and w...");
    }
}
