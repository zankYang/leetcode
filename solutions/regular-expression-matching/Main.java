public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertEqual(false, solution.isMatch("aa", "a"));
        assertEqual(true, solution.isMatch("aa", "a*"));
        assertEqual(true, solution.isMatch("ab", ".*"));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertEqual(boolean expected, boolean actual) {
        if (expected != actual) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
