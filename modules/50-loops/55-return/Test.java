class Test {
    public static void main(String[] args) {
        assert App.doesContain("Renly", 'R');
        assert !App.doesContain("Renly", 'r');
        assert App.doesContain("Tommy", 'm');
        assert !App.doesContain("Tommy", 'd');
    }
}