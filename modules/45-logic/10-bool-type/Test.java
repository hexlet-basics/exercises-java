class Test {
    public static void main(String[] args){
        assert App.isPensioner(70);
        assert !App.isPensioner(50);
        assert App.isPensioner(60);
    }
}