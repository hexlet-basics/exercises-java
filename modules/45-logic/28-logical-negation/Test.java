class Test {
    public static void main(String[] args) throws Exception{
        assert !App.isNotLannisterSoldier("red", "lion");
        assert App.isNotLannisterSoldier("red", "shield");
        assert !App.isNotLannisterSoldier("red", "null");
    }
}