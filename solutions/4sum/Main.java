import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertQuadrupletsEqual(
            List.of(
                List.of(-2, -1, 1, 2),
                List.of(-2, 0, 0, 2),
                List.of(-1, 0, 0, 1)
            ),
            solution.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0)
        );
        assertQuadrupletsEqual(
            List.of(List.of(2, 2, 2, 2)),
            solution.fourSum(new int[] { 2, 2, 2, 2, 2 }, 8)
        );

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertQuadrupletsEqual(List<List<Integer>> expected, List<List<Integer>> actual) {
        Set<List<Integer>> expectedSet = new HashSet<>(expected);
        Set<List<Integer>> actualSet = new HashSet<>(actual);
        if (!expectedSet.equals(actualSet)) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
