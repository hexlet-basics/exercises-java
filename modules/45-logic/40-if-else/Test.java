class Test {
    public static void main(String[] args){
        assert "https://yandex.ru".equals(App.normalizeUrl("yandex.ru"));
        assert "https://yandex.ru".equals(App.normalizeUrl("https://yandex.ru"));
    }
}