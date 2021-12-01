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
    public ListNode insertionSortList(ListNode head) {
        
        ListNode result = new ListNode();
        
        ListNode pointer = head;
        
        while(pointer != null){
            
            ListNode temp = result;
            
            while(temp.next != null && temp.next.val < pointer.val){
                temp = temp.next;
            }
            ListNode next = pointer.next;
            pointer.next = temp.next;
            temp.next = pointer;
            
            pointer = next;
        }
        
        
        return result.next;
        
    }
}