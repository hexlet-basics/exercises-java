class Test {
    public static void main(String[] args) {
        assert !App.isNeutralSoldier("red", "black");
        assert !App.isNeutralSoldier("red", "yellow");
        assert !App.isNeutralSoldier("red", "red");
        assert App.isNeutralSoldier("black", "black");
    }
}