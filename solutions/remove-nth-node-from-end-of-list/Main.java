import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertListsEqual(
            new int[] { 1, 2, 3, 5 },
            solution.removeNthFromEnd(fromArray(new int[] { 1, 2, 3, 4, 5 }), 2)
        );
        assertListsEqual(
            new int[] {},
            solution.removeNthFromEnd(fromArray(new int[] { 1 }), 1)
        );
        assertListsEqual(
            new int[] { 1 },
            solution.removeNthFromEnd(fromArray(new int[] { 1, 2 }), 1)
        );

        System.out.println("Todos los casos de ejemplo pasaron.");
    }

    private static ListNode fromArray(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    private static int[] toArray(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        return values.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void assertListsEqual(int[] expected, ListNode actual) {
        int[] actualArray = toArray(actual);
        if (!Arrays.equals(expected, actualArray)) {
            throw new AssertionError(
                "Esperado " + Arrays.toString(expected) + " pero se obtuvo " + Arrays.toString(actualArray)
            );
        }
    }
}
