class Test {
    public static void main(String[] args){
        assert "normal".equals(App.getSentenceTone("normal"));
        assert "normal".equals(App.getSentenceTone("normal?"));
        assert "normal".equals(App.getSentenceTone("NoRmal?"));
        assert "scream".equals(App.getSentenceTone("SCREAM"));
        assert "scream".equals(App.getSentenceTone("SCREAM!"));
    }
}