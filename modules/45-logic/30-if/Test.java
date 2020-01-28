import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.getSentenceTone("normal")).isEqualTo("normal");
        assertThat(App.getSentenceTone("normal?")).isEqualTo("normal");
        assertThat(App.getSentenceTone("NoRmal?")).isEqualTo("normal");
        assertThat(App.getSentenceTone("SCREAM")).isEqualTo("scream");
        assertThat(App.getSentenceTone("SCREAM!")).isEqualTo("scream");
    }
}
