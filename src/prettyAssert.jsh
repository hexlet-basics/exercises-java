ByteArrayOutputStream out = new ByteArrayOutputStream();
System.setOut(new PrintStream(out));

public void prettyAssert(String expected) {
    String actual = out.toString();
    if (!expected.equals(actual)) {
        throw new AssertionError(expected + " does not equal to " + actual);
    }
}