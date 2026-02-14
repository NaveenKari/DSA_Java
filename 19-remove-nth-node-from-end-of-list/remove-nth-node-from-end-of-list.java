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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode front = head , back = dummy;
        int count = 1;

        while(front.next!= null){
            if(count == n){
                front = front.next;
                back = back.next;
            } else{
                front = front.next;
                count++;
            }
        }

        back.next = back.next.next;
        
        
        return dummy.next;
    }
}