/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) return true;


        // get into middle using slow and fast pointer
        // reverse second part
        // compare

        ListNode slow = head, fast = head;

        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // handle odd length
        if(fast != null){
            slow = slow.next;
        }

        ListNode first = head;
        ListNode second  = reverse(slow);

        while(second != null){
            if(first.val == second.val){
                first = first.next;
                second = second.next;
            }else{
                return false;
            }
        }
        return true;

        
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head, prev=null, next;

        while(curr!= null){
            next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }
}