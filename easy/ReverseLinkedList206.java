// Given the head of a singly linked list, reverse the list, and return the reversed list.

// Example 1:
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]

// Example 2:
// Input: head = [1,2]
// Output: [2,1]

// Example 3:
// Input: head = []
// Output: []


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


// import java.util.Stack;
public class ReverseLinkedList206 {
    
    // public ListNode reverseList(ListNode head) {
    //     Stack<Integer> stack = new Stack<>();

    //     while(head != null) {
    //         stack.push(head.val);
    //         head = head.next;
    //     }

    //     ListNode reverse = new ListNode(Integer.MIN_VALUE);
    //     ListNode ptr = reverse;

    //     while(!stack.isEmpty()) {
    //         ptr.next = new ListNode(stack.pop());
    //         ptr = ptr.next;
    //     }

    //     return reverse.next;
    // }
}
