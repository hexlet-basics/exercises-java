class Test {
    public static void main(String[] args) throws Exception{
        final var expected = "35";

        assert expected.equals(String.valueOf(App.getParentNamesTotalLength("Daenerys Targaryen")));
    }
}