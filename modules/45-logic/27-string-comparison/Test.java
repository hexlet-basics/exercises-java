class Test {
    public static void main(String[] args) throws Exception{
        assert App.isMister("Mister");
        assert !App.isMister("Man");
        assert !App.isMister("313");
    }
}