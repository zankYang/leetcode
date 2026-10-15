public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertEqual(49, solution.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
        assertEqual(1, solution.maxArea(new int[] { 1, 1 }));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertEqual(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
