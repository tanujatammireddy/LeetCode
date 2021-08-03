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
    public ListNode swapPairs(ListNode head) {
        
        if(head== null || head.next==null){
            return head;
        }
        ListNode result = new ListNode(-1);
        result.next = head;
        ListNode temp = result;
        
        ListNode firstNode = new ListNode();
        ListNode secondNode = new ListNode();
        
        while(temp.next != null && temp.next.next != null){
        firstNode  = temp.next;
        secondNode = temp.next.next;
        temp.next  =   secondNode; 
        firstNode.next = secondNode.next;
        secondNode.next = firstNode;
        
        temp = firstNode;
        }
        return result.next;
    }
}