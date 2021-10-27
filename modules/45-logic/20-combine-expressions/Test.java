import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.isInternationalPhone("89602223423")).isFalse();
        assertThat(App.isInternationalPhone("+79602223423")).isTrue();
    }
}
