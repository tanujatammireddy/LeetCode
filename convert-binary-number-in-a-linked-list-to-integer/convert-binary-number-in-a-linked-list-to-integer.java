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
    public int getDecimalValue(ListNode head) {
        
        int length = 0;
        int val = 0;
        ListNode temp = head;
        
        while(temp != null){
            temp = temp.next;
            length++;
        }
        length--;
        while(head != null){
            
            val += Math.pow(2,length)*head.val;
            length--;
            head = head.next;
        }
        
        return val;
        
    }
}