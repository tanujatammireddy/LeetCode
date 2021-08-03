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
        ListNode length = new ListNode();
        length = head;
        int len = 0;
        while(length!=null){
            length = length.next;
            len++;
        }
        //System.out.println(""+len);
        len = len-n;
        ListNode result = new ListNode(-1);
        result.next = head;
        ListNode temp = result;
        while(len>0){
            len--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return result.next;
    }
}