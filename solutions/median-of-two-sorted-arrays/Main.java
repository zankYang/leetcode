public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertEqual(2.0, solution.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));
        assertEqual(2.5, solution.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertEqual(double expected, double actual) {
        if (Double.compare(expected, actual) != 0) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
