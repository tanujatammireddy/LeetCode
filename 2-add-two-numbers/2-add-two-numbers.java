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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        ListNode result = new ListNode();
        ListNode head = new ListNode();
        result = head;
        int carry = 0;
        while(l1 != null || l2 != null){
            
            int a = (l1 != null)? l1.val : 0;
            int b = (l2 != null)? l2.val : 0;
            
            int sum = a+ b+ carry;
            carry = sum/10;
            sum = sum%10; 
            
            head.next = new ListNode(sum);
            
            if(l1 != null)
                l1= l1.next;
            if(l2 != null)
                l2= l2.next;
            
            head = head.next;
        }
        if(carry != 0)
            head.next = new ListNode(carry);
        return result.next;
    }
}