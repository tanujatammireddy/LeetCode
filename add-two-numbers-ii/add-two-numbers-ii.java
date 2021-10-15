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
    
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        while(l1!= null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while(l2!= null){
            stack2.push(l2.val);
            l2 = l2.next;
        } 
        
        ListNode result = new ListNode();
        ListNode temp = result;
        
        int carry = 0;
        while( !stack1.isEmpty() || !stack2.isEmpty()){
            
            int x = (stack1.isEmpty())? 0: stack1.pop();
            int y = (stack2.isEmpty())? 0: stack2.pop();
            
            int value = x+ y+ carry;
            
            if(value > 9)
            {
                value = value%10;
                carry = 1;
            }
            else
                carry = 0;
            
            temp.next = new ListNode(value);
            temp = temp.next;
            
        }
        
        if(carry == 1)
            temp.next = new ListNode(1);
        
        return reverse(result.next);
    }
     public ListNode reverse(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        return prev;
    }
}