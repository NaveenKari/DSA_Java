/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA, temp2 = headB;
        int len1 = getLength(headA);
        int len2 = getLength(headB);
        int diff = Math.abs(len1-len2);

        if(len1>len2){
            int count = 0;
            while(temp1!= null){
                if(count != diff){
                    count++;
                    temp1 = temp1.next;
                }else{
                    break;
                }
            }
        }else{
            int count = 0;
            while(temp2!= null){
                if(count != diff){
                    count++;
                    temp2 = temp2.next;
                }else{
                    break;
                }
            }
        }

        while(temp1!=null){
            if(temp1 == temp2) return temp1;
            else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            
        }
        return null;
        
    }

    public int getLength(ListNode head){
        ListNode curr =head;
        int len = 0;
        while(curr!= null){
            curr = curr.next;
            len++;
        }

        return len;
    }
}