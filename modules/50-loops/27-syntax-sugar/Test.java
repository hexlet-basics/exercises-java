class Test {
    public static void main(String[] args) {
        String str = "If I look back I am lost";
        assert App.countChars(str, 'I') == 3;
        assert App.countChars(str, 'z') == 0;
        assert App.countChars(str, 'o') == 3;
    }
}