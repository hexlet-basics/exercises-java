import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.isNeutralSoldier("red", "black")).isFalse();
        assertThat(App.isNeutralSoldier("red", "yellow")).isFalse();
        assertThat(App.isNeutralSoldier("red", "red")).isFalse();
        assertThat(App.isNeutralSoldier("black", "black")).isTrue();
    }
}
