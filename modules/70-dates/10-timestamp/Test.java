class Test {
    public static void main(String[] args) {
        assert App.getYear(1532435204) == 2018;
        assert App.getYear(532435204) == 1986;
        assert App.getYear(5324352) == 1970;
    }
}