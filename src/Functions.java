import java.util.HashMap;
import java.util.Map;

public class Functions {
    public static boolean isLannisterSoldier(String color, String shield) {
        return ("red".equals(color) && shield.equals("null")) || ("lion".equals(shield));
    }

    public static String parentFor(String child, String parent) throws Exception {

        if (parent == null) {
            parent = "mother";
        }

        Map<String, String> parents = new HashMap<>();

        switch (child) {
            case "Daenerys Targaryen":
                parents.put("mother", "Rhaella Targaryen");
                parents.put("father", "Aerys II Targaryen");
                return parents.get(parent);
            case "Cersei Lannister":
                parents.put("father", "Tywin Lannister");
                return parents.get(parent);
            case "Joffrey Baratheon":
                parents.put("mother", "Cersei Lannister");
                return parents.get(parent);
            default:
                throw new Exception("Wrong child's name " + child);
        }
    }

    public static String parentFor(String child) throws Exception{
        return parentFor(child, null);
    }

    public static int calculateDistanceBetweenTowns(String param) throws Exception{
        String[] towns  = param.split("-");
        return calculateDistance(towns[0], towns[1]);
    }

    public static int calculateDistance(String source, String dest) throws Exception{
        String w = "Winterfell";
        String t = "The Twins";
        String e = "The Eyrie";
        String q = "Qarth";
        String d = "Vaes Dothrak";
        if (w.equals(source) && t.equals(dest) || t.equals(source) && w.equals(dest)) {
            return 60;
        }
        else if (t.equals(source) && e.equals(dest) || e.equals(source) && t.equals(dest)) {
            return 20;
        }
        else if (q.equals(source) && d.equals(dest) || d.equals(source) && q.equals(dest)) {
            return 125;
        }
        throw new Exception("Unknown cities: " + source + " and " + dest + ". Please check names");
    }

    public static String repeat(String text, int count) {
        return text.repeat(count);
    }
}