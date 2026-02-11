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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy; 

        //get prev to left before;

        for(int i = 1; i< left; i++){
            prev = prev.next;
        }

        ListNode start = prev.next;

        // reverse (right-left+1) nodes
        ListNode curr = start;
        ListNode rePrev = null;

        for (int i = 0; i < right - left + 1; i++) {
            ListNode next = curr.next;
            curr.next = rePrev;
            rePrev = curr;
            curr = next;
        }

        // reconnect
        prev.next = rePrev;  // rePrev is new head of reversed segment
        start.next = curr; 
        return dummy.next;
    }

}