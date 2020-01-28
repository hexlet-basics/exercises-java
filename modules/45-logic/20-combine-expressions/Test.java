import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.hasTargaryenReference("")).isFalse();
        assertThat(App.hasTargaryenReference("Targari")).isFalse();
        assertThat(App.hasTargaryenReference("targaryen")).isFalse();
        assertThat(App.hasTargaryenReference("Targaryen")).isTrue();
    }
}
