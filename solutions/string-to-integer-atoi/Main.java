public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertEqual(42, solution.myAtoi("42"));
        assertEqual(-42, solution.myAtoi("   -042"));
        assertEqual(1337, solution.myAtoi("1337c0d3"));
        assertEqual(0, solution.myAtoi("0-1"));
        assertEqual(0, solution.myAtoi("words and 987"));
        assertEqual(Integer.MIN_VALUE, solution.myAtoi("-91283472332"));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertEqual(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
