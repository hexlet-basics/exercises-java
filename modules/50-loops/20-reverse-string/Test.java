class Test {
    public static void main(String[] args) {
        assert "got".equals(App.mysubstr("got", 3));
        assert "go".equals(App.mysubstr("got", 2));
        assert "g".equals(App.mysubstr("got", 1));
    }
}