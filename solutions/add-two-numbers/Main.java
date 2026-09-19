import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        assertListsEqual(
            new int[] { 7, 0, 8 },
            solution.addTwoNumbers(fromArray(new int[] { 2, 4, 3 }), fromArray(new int[] { 5, 6, 4 }))
        );
        assertListsEqual(
            new int[] { 0 },
            solution.addTwoNumbers(fromArray(new int[] { 0 }), fromArray(new int[] { 0 }))
        );
        assertListsEqual(
            new int[] { 8, 9, 9, 9, 0, 0, 0, 1 },
            solution.addTwoNumbers(
                fromArray(new int[] { 9, 9, 9, 9, 9, 9, 9 }),
                fromArray(new int[] { 9, 9, 9, 9 })
            )
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
