public class App {
    // BEGIN
    public static String whoIsThisHouseToStarks(String houseName) {
        var statusFamily = "";
        if ("Karstark".equals(houseName) || "Tally".equals(houseName)) {
            statusFamily = "friend";
        } else if ("Lannister".equals(houseName) || "Frey".equals(houseName)) {
            statusFamily = "enemy";
        } else {
            statusFamily = "neutral";
        }
        return statusFamily;
    }
    // END
}
