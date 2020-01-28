import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.isLannisterSoldier("blue", "")).isFalse();
        assertThat(App.isLannisterSoldier("red", "man")).isFalse();
        assertThat(App.isLannisterSoldier("red", "lion")).isTrue();
        assertThat(App.isLannisterSoldier("blue", "lion")).isTrue();
        assertThat(App.isLannisterSoldier("red", "")).isTrue();
    }
}
