class Test {
    public static void main(String[] args) throws Exception {
        assert "friend".equals(App.whoIsThisHouseToStarks("Tally"));
        assert "friend".equals(App.whoIsThisHouseToStarks("Karstark"));
        assert "enemy".equals(App.whoIsThisHouseToStarks("Lannister"));
        assert "neutral".equals(App.whoIsThisHouseToStarks("Martell"));
        assert "neutral".equals(App.whoIsThisHouseToStarks("undefined"));
    }
}