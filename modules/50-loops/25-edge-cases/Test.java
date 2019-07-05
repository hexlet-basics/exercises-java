class Test {
    public static void main(String[] args){
        String str = "Sansa Stark";
        assert !App.isArgumentsForSubstrCorrect(str, -1, 3);
        assert !App.isArgumentsForSubstrCorrect(str, 4, 100);
        assert !App.isArgumentsForSubstrCorrect(str, 10, 10);
        assert !App.isArgumentsForSubstrCorrect(str, 11, 1);
        assert App.isArgumentsForSubstrCorrect(str, 3, 3);
    }
}