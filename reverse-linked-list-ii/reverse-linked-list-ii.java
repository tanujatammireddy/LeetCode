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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
    ListNode result = new ListNode(-501);
    ListNode temp = result;
    temp.next = head;
    ListNode root = head;
    int i=1;
    List<Integer> list = new ArrayList();
        while(root!= null){
            if(i>= left && i<= right){
                list.add(root.val);
            }
            i++;
           root= root.next; 
        }
        
    root = head;  
    int j= list.size()-1;
    i=1;
        while(root!= null){
           if(i>= left && i<= right){
                root.val = list.get(j);
                j--;
            }
            i++; 
           root= root.next; 
        }
        
    
        return result.next;
        
    }
}