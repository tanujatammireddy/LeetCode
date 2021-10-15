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
        
        ListNode temp = new ListNode();
        ListNode result = temp;
        int carry = 0;
        
        while(l1 != null || l2 != null){

            int x = (l1 == null)? 0:l1.val;
            int y = (l2 == null)? 0:l2.val;
            
            int value = x + y + carry;
            
            if(value > 9){
                value = value % 10;
                carry = 1;
            }
            else
                carry = 0;
            
            temp.next = new ListNode(value);
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            
            temp = temp.next;
        }
        
        if(carry == 1)
            temp.next = new ListNode(carry);
        
        return result.next;
    }
    
}