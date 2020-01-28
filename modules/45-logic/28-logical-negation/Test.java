import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.isNotLannisterSoldier("red", "lion")).isFalse();
        assertThat(App.isNotLannisterSoldier("red", "shield")).isTrue();
        assertThat(App.isNotLannisterSoldier("red", "")).isFalse();
    }
}
