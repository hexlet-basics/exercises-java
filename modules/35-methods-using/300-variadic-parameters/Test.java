import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        var actual = App.makeSentence();
        System.out.println(actual);

        assertThat(actual).isEqualTo("Java is awesome");
    }
}
