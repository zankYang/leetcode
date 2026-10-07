public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertEqual(321, solution.reverse(123));
        assertEqual(-321, solution.reverse(-123));
        assertEqual(21, solution.reverse(120));
        assertEqual(0, solution.reverse(1534236469));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertEqual(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
