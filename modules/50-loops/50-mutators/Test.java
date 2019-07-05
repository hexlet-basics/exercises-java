class Test {
    public static void main(String[] args) {
        String str = "If I look back I am lost";
        assert App.filterString(str, 'I').equals("f  look back  am lost");
        assert App.filterString(str, 'o').equals("If I lk back I am lst");
    }
}