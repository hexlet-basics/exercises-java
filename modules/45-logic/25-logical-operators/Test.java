import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.isLeapYear(2018)).isFalse();
        assertThat(App.isLeapYear(2017)).isFalse();
        assertThat(App.isLeapYear(2016)).isTrue();
    }
}
