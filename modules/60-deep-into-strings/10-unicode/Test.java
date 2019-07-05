class Test {
    public static void main(String[] args) {
        assert "ONE".equals(App.invertCase("one"));
        assert "two".equals(App.invertCase("TWO"));
        assert "tHrEE".equals(App.invertCase("ThRee"));
        assert "пРиВеТ!".equals(App.invertCase("ПрИвЕт!"));
    }
}