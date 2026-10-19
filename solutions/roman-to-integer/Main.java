public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertEqual(3, solution.romanToInt("III"));
        assertEqual(58, solution.romanToInt("LVIII"));
        assertEqual(1994, solution.romanToInt("MCMXCIV"));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertEqual(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
