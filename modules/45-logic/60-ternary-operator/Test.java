class Test {
    public static void main(String[] args){
        assert "heyhey".equals(App.convertString("hey"));
        assert "Hey".equals(App.convertString("Hey"));
    }
}