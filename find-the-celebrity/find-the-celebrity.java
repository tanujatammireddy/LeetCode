/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    
    public int findCelebrity(int n) {
    
        int person = 0;
        for(int i=0; i< n;i++){
            if(knows(person,i))
                person = i;
        }
        if(isCelebrity(person,n))
            return person;
            
        return -1;
        
    }
    
    public boolean isCelebrity(int celebrity,int n){
        
        for(int i=0; i< n;i++){
            if(i == celebrity) continue;
            if(!knows(i,celebrity) || knows(celebrity,i))
                return false;
        } 
        return true;
    } 
}