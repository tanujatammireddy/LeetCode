class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int k= 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            k++;
        }
       
        if(n== k)
            return head.next;
        
        n = k-n-1;
        ListNode current = head;
        ListNode next = current.next;
        
        while(current != null){
            
            if(n == 0){
                current.next = next.next;
                break;
            }
            
            current = current.next;
            if(next != null)
            next = next.next;
            n--;
        }
        
        return head;
    }
}