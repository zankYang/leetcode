public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertEqual("MMMDCCXLIX", solution.intToRoman(3749));
        assertEqual("LVIII", solution.intToRoman(58));
        assertEqual("MCMXCIV", solution.intToRoman(1994));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertEqual(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
