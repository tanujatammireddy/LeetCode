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
    public ListNode reverseList(ListNode head) {
        
        List<Integer> listValues = new ArrayList();
        ListNode result = head;
        ListNode temp = head;
        
        while(temp!=null){
            listValues.add(temp.val);
            temp = temp.next;
        }
        int i = listValues.size()-1;
        while(result!=null){
            result.val = listValues.get(i);
            i--;
            result = result.next;
        }
        return head;
    }
}