public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String first = solution.longestPalindrome("babad");
        if (!first.equals("bab") && !first.equals("aba")) {
            throw new AssertionError("Esperado bab o aba pero se obtuvo " + first);
        }

        assertEqual("bb", solution.longestPalindrome("cbbd"));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertEqual(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
