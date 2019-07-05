class Test {
    public static void main(String[] args) {
        final String expected = "The age difference is 17";

        assert expected.equals(App.getAgeDifference(2001, 2018));
    }
}