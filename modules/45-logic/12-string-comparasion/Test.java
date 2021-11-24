import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.isPalindrome("wow")).isTrue();
        assertThat(App.isPalindrome("hexlet")).isFalse();
        assertThat(App.isPalindrome("asdffdsa")).isTrue();
        assertThat(App.isPalindrome("Wow")).isTrue();
    }
}
