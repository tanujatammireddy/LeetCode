public class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
class MyLinkedList {
    
    int size ;
    ListNode head;
    
    public MyLinkedList() {
        head = new ListNode(-1);
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        ListNode current = head;
        for(int i = 0; i< index+1 ;i++)
            current = current.next;
        return current.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        ListNode current = head;
        
        for(int i = 0; i< index ;i++)
            current = current.next;
        ListNode newNode = new ListNode(val);
        
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        ListNode current = head;
        
        for(int i = 0; i< index ;i++)
            current = current.next;
        size--;
        current.next = current.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
