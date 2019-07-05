class Test {
    public static void main(String[] args){
        assert !App.hasTargaryenReference("");
        assert !App.hasTargaryenReference("Targari");
        assert !App.hasTargaryenReference("targaryen");
        assert App.hasTargaryenReference("Targaryen");
    }
}