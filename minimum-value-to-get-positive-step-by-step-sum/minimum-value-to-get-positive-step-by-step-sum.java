class Solution {
    public int minStartValue(int[] nums) {
        
        boolean minStartValueFound = false;
        int startValue = 1;
        if(nums[0] < 1)
            startValue = nums[0]*-1 +1;
        int current = startValue;
        while(!minStartValueFound){
          
            int i=0;
            current = startValue;
            //System.out.println(+current);
            for(i=0;i< nums.length;i++){
                startValue = startValue + nums[i];
                if(startValue < 1)
                    break;
            }
            
            if(i == nums.length)
                break;
            //System.out.println("*****"+current);
            startValue = current+1;
        }
        return current;
    }
}