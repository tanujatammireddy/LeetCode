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
    public ListNode swapNodes(ListNode head, int k) {
        int len =0;
        ListNode length = head;
        
        while(length!=null){
            length = length.next;
            len++;
        }
        
        ListNode start = head;
        for(int i=1;i<k;i++){
            start = start.next;
        }
        ListNode end = head;
        for(int i=1;i<len-k+1;i++){
            end = end.next;
        }
        int temp = start.val;
        start.val = end.val;
        end.val = temp;
        return head;
    }
}