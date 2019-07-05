class Test {
    public static void main(String[] args) {
        assert App.startsWith("one", "o");
        assert !App.startsWith("one", "ne");
        assert App.startsWith("one", "on");
        assert App.startsWith("one", "one");
    }
}