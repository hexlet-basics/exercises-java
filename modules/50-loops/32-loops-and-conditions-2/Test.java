class Test {
    public static void main(String[] args) {
        assert "2,4,6,8,".equals(App.getEvenNumbersUpTo(9));
        assert "2,4,6,8,10,12,14,".equals(App.getEvenNumbersUpTo(15));
        assert "2,".equals(App.getEvenNumbersUpTo(2));
    }
}