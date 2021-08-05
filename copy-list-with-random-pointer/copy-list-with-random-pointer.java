/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    
    HashMap<Node, Node> map = new HashMap<Node, Node>();
    public Node copyRandomList(Node head) {
       
        if(head == null) return null;
        
        if(map.containsKey(head)){
            return map.get(head);
        }
        
        Node current = new Node(head.val);
        map.put(head,current);
        current.next=(copyRandomList(head.next));
        current.random=(copyRandomList(head.random));
        
        return current;
    }
}