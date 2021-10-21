public class App {
    // BEGIN
    public static int getParentNamesTotalLength(String child) {
        var mother = Functions.parentFor(child, "mother");
        var father = Functions.parentFor(child, "father");
        return mother.length() + father.length();
    }
    // END
}
