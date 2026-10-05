public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertEqual("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
        assertEqual("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
        assertEqual("A", solution.convert("A", 1));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertEqual(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
