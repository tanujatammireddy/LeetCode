class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int n = piles.length;
        int min = 1;
        int max = Integer.MIN_VALUE;
        
        for(int pile:piles){
            max = Math.max(max,pile);
        }
        
        
        
        while(min < max){
            
            int mid = min +(max-min)/2;
            
           // System.out.println("min"+min+" max"+max+" mid"+mid);
            
            if(canEat(piles.clone(),h,mid))
                max = mid;
            else
                min = mid+1;

        }
        
    return  min;       
               
    }
    
    private boolean canEat(int[] pile, int h, int k){
        
        int len = pile.length;
        int minHours = 0;
        
        for(int i=0; i< len ;i++){
            minHours += Math.ceil((double)pile[i]/k);    
        }
        
        return (minHours <= h)? true: false;
    }
}