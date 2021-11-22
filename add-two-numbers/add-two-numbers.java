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
        ListNode temp = new ListNode();
        result = temp;
        
        int carry = 0;
        while(l1 != null || l2 != null){
            
            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;
            int sum = a+b+ carry;
            carry = sum/10;
            sum = sum % 10;
            
            temp.next = new ListNode(sum);
            temp = temp.next;
            
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
            
        }
        
        if(carry == 1)
            temp.next = new ListNode(carry);
        
        return result.next;
        
    }
}