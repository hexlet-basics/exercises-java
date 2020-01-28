import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.invertCase("one")).isEqualTo("ONE");
        assertThat(App.invertCase("TWO")).isEqualTo("two");
        assertThat(App.invertCase("ThRee")).isEqualTo("tHrEE");
        assertThat(App.invertCase("ПрИвЕт!")).isEqualTo("пРиВеТ!");
    }
}
