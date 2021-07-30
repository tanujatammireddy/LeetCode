class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        if(nums.length == 1) return 1;
        for(int index =0; index<nums.length;index++){
            int i = index;
            int j= index;
            boolean flag = false;
            if((i+1 < nums.length && nums[i] == nums[i+1])){
            while(i+1 < nums.length && nums[i] == nums[i+1]){
                i++;
                flag = true;
            }
            if(flag){
                //System.out.println("Reached Here");
                while(i<nums.length-1){
                    i++;
                    j++;
                    nums[j] = nums[i];
                }
            }  
            }
            
            
        }
         for(int k =0; k<nums.length;k++){
             if(k+1 < nums.length && nums[k] < nums[k+1]){
                 count++;
             }
             else break;
         }
        return count+1;
    }
}