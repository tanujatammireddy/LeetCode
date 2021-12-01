/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        
        Node toInsert = new Node(insertVal);
        
        if(head == null){
            toInsert.next = toInsert;
            return toInsert;
        }
        
        Node slowPointer = head;
        Node fastPointer = head.next;
        
        if(fastPointer == slowPointer){
            head.next = toInsert;
            toInsert.next = head;
        }
        
        else{
            
            do{
                /*System.out.println("slowPointer"+slowPointer.val);
                System.out.println("fastPointer"+fastPointer.val);*/
                  
                if(slowPointer.val <= insertVal && insertVal <= fastPointer.val){
                    //System.out.println("***");
                    break;
                }
                else if(slowPointer.val > fastPointer.val){ 
                    //System.out.println("*//*");
                   if(insertVal >= slowPointer.val  || insertVal <= fastPointer.val)
                        break;
                }
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
               
            }while(slowPointer != head);
                
            slowPointer.next = toInsert;
            toInsert.next = fastPointer;
        }
        
        
        return head;
        
    }
}