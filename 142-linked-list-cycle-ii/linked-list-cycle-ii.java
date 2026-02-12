/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 //fucked up problem and algo not intuitive.
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null) return null;
        ListNode slow = head,fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }

        ListNode slow2 = head;

        if(slow == slow2) return slow2;

        while(slow.next!= null){
            slow2 = slow2.next;
            slow = slow.next;

            if(slow2 == slow){
                return slow2;
            }
        }

        return null;

    }
}