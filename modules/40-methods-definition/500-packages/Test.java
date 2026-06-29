import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.amountPerPerson(300, 4, 0)).isEqualTo(75);
        assertThat(App.amountPerPerson(300, 4, 20)).isEqualTo(90);
        assertThat(App.amountPerPerson(350, 3, 10)).isEqualTo(129);
        assertThat(App.amountPerPerson(100, 3, 0)).isEqualTo(34);
    }
}
