import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.compress("aaabcccc")).isEqualTo("a3bc4");
        assertThat(App.compress("abcd")).isEqualTo("abcd");
        assertThat(App.compress("aabbaa")).isEqualTo("a2b2a2");
        assertThat(App.compress("a")).isEqualTo("a");
        assertThat(App.compress("")).isEqualTo("");
        assertThat(App.compress("zzz")).isEqualTo("z3");
    }
}
