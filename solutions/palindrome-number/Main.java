public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertEqual(true, solution.isPalindrome(121));
        assertEqual(false, solution.isPalindrome(-121));
        assertEqual(false, solution.isPalindrome(10));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertEqual(boolean expected, boolean actual) {
        if (expected != actual) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
