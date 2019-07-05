class Test {
    public static void main(String[] args){
        assert !App.isLannisterSoldier("blue", null);
        assert !App.isLannisterSoldier("red", "man");
        assert App.isLannisterSoldier("red", "lion");
        assert App.isLannisterSoldier("blue", "lion");
        assert App.isLannisterSoldier("red", null);
    }
}