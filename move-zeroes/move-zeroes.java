class Solution {
    public void moveZeroes(int[] nums) {
        
        if (nums.length==1) return;
        
        int zero_count = 0;
        for(int num:nums){
            if(num==0)
                zero_count++;
        }
        
        int index = 0;
        int len = nums.length;
        while(index < len){
            
            int start = index;
            int count = 0;
            int zeroIndex = index;
            
            while(start < nums.length &&  nums[start]== 0){
                start++;
                count++;
            }
            
            int non_ZeroIndex = start--;
            /*System.out.println("non_ZeroIndex"+non_ZeroIndex);
            System.out.println("zeroIndex"+zeroIndex);
            System.out.println("count"+count);*/
            
            while(non_ZeroIndex < nums.length){
                nums[zeroIndex] = nums[non_ZeroIndex];
                zeroIndex++;
                non_ZeroIndex++;
            }
            len = len-count;
            index++;
        }
        
        while(zero_count !=0){
            nums[nums.length-zero_count]=0;
            zero_count --;
        }
    
    }
}