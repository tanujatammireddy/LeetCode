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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head != null){
            
            ListNode current = head;
            ListNode temp = new ListNode(0);
            ListNode previous = temp;
            previous.next = head;
            
            while(current != null){
            
                if(current.val == val)
                    previous.next = current.next;
                else
                    previous = current;
                
                current = current.next;
                
            }
            return temp.next;
        }
        return head;
    }
}