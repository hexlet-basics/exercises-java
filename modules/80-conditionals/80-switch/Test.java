import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.getNumberExplanation(0)).isEqualTo("just a number");
        assertThat(App.getNumberExplanation(666)).isEqualTo("devil number");
        assertThat(App.getNumberExplanation(42)).isEqualTo("answer for everything");
        assertThat(App.getNumberExplanation(7)).isEqualTo("prime number");
    }
}
