public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertEqual(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEqual(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEqual(3, solution.lengthOfLongestSubstring("pwwkew"));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertEqual(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
