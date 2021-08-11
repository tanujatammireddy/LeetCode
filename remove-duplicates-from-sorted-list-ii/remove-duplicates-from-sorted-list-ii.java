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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        int current, next ;
        
        while(head !=null){
            
            current = head.val;
            
            if(head.next != null)
                next = head.next.val;
            else
                next = 101;
            
            if(current != next){
               // System.out.println("current: "+current +" next:"+next );
                temp.next = new ListNode(current);
                temp = temp.next;
                head = head.next;
            }
            else{
                while(head !=null && head.val == current){
                    head = head.next;
                }
            }
            
            
        }
        return result.next;
    }
}