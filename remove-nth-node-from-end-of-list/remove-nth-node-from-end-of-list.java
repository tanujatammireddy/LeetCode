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
       
        int length = 0;
        ListNode current = head;
        
        while(current != null){
            length++;
            current = current.next;
        }
        
        if(n == length)
            return head.next;
        
        n = length- n;
        int idx = 0;
        
        ListNode middleNode = head;
        while(idx < n-1){
            idx++;
            middleNode = middleNode.next;
        }
        //System.out.println(""+middleNode.val);
        
        if(middleNode.next != null)
            middleNode.next = middleNode.next.next;
        
            
        return head;
        
    }
}