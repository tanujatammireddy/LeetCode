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
        while(head!= null && head.next!=null){
            
            ListNode first = head;
            ListNode second = head.next;
            
            temp.next = second;
            first.next = second.next;
            second.next = first;
            
            temp = first;
            head= first.next;
        }
        return result.next;
    }
}