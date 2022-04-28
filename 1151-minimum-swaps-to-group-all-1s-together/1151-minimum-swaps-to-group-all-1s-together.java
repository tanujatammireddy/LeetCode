class Solution {
    public int minSwaps(int[] data) {
        
        if(data.length > 1){
            
            int len = data.length;
            int totalOnes = 0;
            for(int num:data){
                if(num == 1)
                    totalOnes++;
            }
            
            if(totalOnes == 1)
                return 0;
        
            int left = 0;
            int right = 0;
            int zerosCount = 0;
            int minZeros = Integer.MAX_VALUE ;
            
            while(right < totalOnes){
                if(data[right] == 0)
                    zerosCount++;
                right++;  
            }
            if(zerosCount == 0 )
                return 0;
            minZeros = Math.min(minZeros,zerosCount); 
            System.out.println(""+zerosCount);
            while(right < len){
               
                if(data[left] == 0){
                    zerosCount--;
                }
                if(data[right] == 0){
                    zerosCount++;
                }
                
                left++;
                right++;
               minZeros = Math.min(minZeros,zerosCount);   
            }
            
            return minZeros;
            
        }
        return 0;
            
        
    }
}