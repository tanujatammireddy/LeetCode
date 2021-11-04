class Solution {
    public String longestDiverseString(int a, int b, int c) {
        
        int len = a+b+c; 
        int i = 0;
        
        PriorityQueue<Pair<Character,Integer>> pq = new PriorityQueue<>((p1,p2)->(Integer)p2.getValue()- (Integer)p1.getValue());
        
        StringBuilder sb = new StringBuilder();
        if(a > 0)
        pq.add(new Pair('a',a));
        if(b > 0)
        pq.add(new Pair('b',b));
        if(c > 0)
        pq.add(new Pair('c',c));
        
        while(sb.length() < len){
            
            Pair p1 = pq.poll();
            char ch1 = (Character)p1.getKey();
            int count1 = (Integer)p1.getValue();
            
            //System.out.println("ch1: "+ch1+" count1:"+count1);
            
            if( sb.length() > 1 && sb.charAt(sb.length() -1) == ch1 ){
                
                if(pq.size() >= 1 ){
                    Pair p2 = pq.poll();
                    char ch2 = (Character)p2.getKey();
                    int count2 = (Integer)p2.getValue();
                    
                    sb.append(ch2);
                    count2--;
                    
                if(count2 > 0)
                    pq.add(new Pair(ch2,count2)); 
                    
                pq.add(p1);
                
            }
            else
                break;
            }
            else
            {   
            if(count1 == 1){
                sb.append(ch1);
                count1--;
            }
            else{
                sb.append(ch1);
                count1--;
                sb.append(ch1);
                count1--;
            }
            if(count1> 0)
              pq.add(new Pair(ch1,count1)); 
            } 
            i++; 
        }
        
        return sb.toString();
    }
}