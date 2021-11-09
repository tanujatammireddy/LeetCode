/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    
    Node tail = null;
    public Node flatten(Node head) {
        
        if(head == null)
            return head;
        
        head.prev = tail;
        tail = head;
        
        Node nextNode = head.next;
        head.next = flatten(head.child);
        head.child = null;
        
        tail.next = flatten(nextNode);
        
        return head;
    }
    
    
}