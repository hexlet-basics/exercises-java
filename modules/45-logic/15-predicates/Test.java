class Test {
    public static void main(String[] args) throws Exception{
        assert App.isNegative(-1);
        assert !App.isNegative(0);
        assert !App.isNegative(1);
    }
}