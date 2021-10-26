public class App {
    public static void main(String[] args) {
        var emoji = "-(";
        // BEGIN
        var happyEmoji = ":" + emoji.replace('(', ')');
        System.out.println(happyEmoji);
        // END
    }
}
