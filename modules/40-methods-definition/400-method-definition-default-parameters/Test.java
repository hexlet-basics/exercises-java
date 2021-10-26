import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        var actual = App.getHiddenCard("1234123412341234");
        assertThat(actual).isEqualTo("****1234");

        var actual2 = App.getHiddenCard("1234123412344321", 6);
        assertThat(actual2).isEqualTo("******4321");
    }
}
