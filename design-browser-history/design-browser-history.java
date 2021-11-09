public class Node{
    String url ;
    public Node prev;
    public Node next;
    
     public Node(String url) {  
        this.url = url; 
         
    } 
}

class BrowserHistory {
    int count = 0;
    Node Homepage;
    Node current;
    public BrowserHistory(String homepage) {
        Homepage = new Node(homepage);
        count = 1;
        current = Homepage;
    }
    
    public void visit(String url) {
        
        Node newNode = new Node(url);
        current.next = newNode;
        newNode.prev = current;
        count++;
        
        current = newNode;
    }
    
    public String back(int steps) {
        
        
        while(current.prev != null && steps > 0){
            current= current.prev;
            steps--;
        }
        
        return current.url;
    }
    
    public String forward(int steps) {
        
       while(current.next != null && steps > 0){
            current= current.next;
            steps--;
        }
        
        return current.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */