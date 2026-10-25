public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertEqual(2, solution.threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
        assertEqual(0, solution.threeSumClosest(new int[] { 0, 0, 0 }, 1));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertEqual(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
