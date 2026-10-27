import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertCombinationsEqual(
            List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            solution.letterCombinations("23")
        );
        assertCombinationsEqual(List.of(), solution.letterCombinations(""));
        assertCombinationsEqual(List.of("a", "b", "c"), solution.letterCombinations("2"));

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static void assertCombinationsEqual(List<String> expected, List<String> actual) {
        Set<String> expectedSet = new HashSet<>(expected);
        Set<String> actualSet = new HashSet<>(actual);
        if (!expectedSet.equals(actualSet)) {
            throw new AssertionError("Esperado " + expected + " pero se obtuvo " + actual);
        }
    }
}
