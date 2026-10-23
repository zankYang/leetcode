import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertTripletsEqual(
            List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)),
            solution.threeSum(new int[] { -1, 0, 1, 2, -1, -4 })
        );
        assertTripletsEqual(List.of(), solution.threeSum(new int[] { 0, 1, 1 }));
        assertTripletsEqual(List.of(List.of(0, 0, 0)), solution.threeSum(new int[] { 0, 0, 0 }));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertTripletsEqual(List<List<Integer>> expected, List<List<Integer>> actual) {
        Set<List<Integer>> expectedSet = new HashSet<>(expected);
        Set<List<Integer>> actualSet = new HashSet<>(actual);
        if (!expectedSet.equals(actualSet)) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
