import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertArraysEqual(new int[] { 0, 1 }, solution.twoSum(new int[] { 2, 7, 11, 15 }, 9));
        assertArraysEqual(new int[] { 1, 2 }, solution.twoSum(new int[] { 3, 2, 4 }, 6));
        assertArraysEqual(new int[] { 0, 1 }, solution.twoSum(new int[] { 3, 3 }, 6));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertArraysEqual(int[] expected, int[] actual) {
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError(
                "Esperado " + Arrays.toString(expected) + " pero se obtuvo " + Arrays.toString(actual)
            );
        }
    }
}
