public class App {
    public static void main(String[] args) {
        var domain = "hexlet.io";
        var nicknameFromForm = " SupporT\n";

        // BEGIN
        var trimmedNickname = nicknameFromForm.trim();
        var email = trimmedNickname.toLowerCase() + "@" + domain;
        System.out.println(email);
        // END
    }
}
