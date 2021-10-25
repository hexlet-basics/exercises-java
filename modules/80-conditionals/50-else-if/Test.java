import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        assertThat(App.whoIsThisHouseToStarks("Tally")).isEqualTo("friend");
        assertThat(App.whoIsThisHouseToStarks("Karstark")).isEqualTo("friend");
        assertThat(App.whoIsThisHouseToStarks("Lannister")).isEqualTo("enemy");
        assertThat(App.whoIsThisHouseToStarks("Martell")).isEqualTo("neutral");
        assertThat(App.whoIsThisHouseToStarks("undefined")).isEqualTo("neutral");
    }
}
