import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        var text = "If I look back I am lost";
        assertThat(App.filterString(text, 'I')).isEqualTo("f  look back  am lost");
        assertThat(App.filterString("zz zorro", 'z')).isEqualTo(" orro");
    }
}
