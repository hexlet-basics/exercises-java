class Test {
    public static void main(String[] args) {
        assert App.getCustomDate(1532435204).equals("18/01/1970");
        assert App.getCustomDate(532435204).equals("07/01/1970");
        assert App.getCustomDate(5324352).equals("01/01/1970");
    }
}