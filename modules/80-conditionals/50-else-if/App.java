public class App {
    // BEGIN
    public static String whoIsThisHouseToStarks(String houseName) {
        if ("Karstark".equals(houseName) || "Tally".equals(houseName)) {
            return "friend";
        } else if ("Lannister".equals(houseName) || "Frey".equals(houseName)) {
            return "enemy";
        }

        return "neutral";
    }
    // END
}
