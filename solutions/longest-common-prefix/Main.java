public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertEqual("fl", solution.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
        assertEqual("", solution.longestCommonPrefix(new String[] { "dog", "racecar", "car" }));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertEqual(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
