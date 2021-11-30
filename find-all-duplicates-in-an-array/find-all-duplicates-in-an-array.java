class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> result = new ArrayList();
        
        for(int num:nums){
            
            int current = Math.abs(num) -1;
            if(nums[current] < 0)
                result.add(current+1);
            else
                nums[current] = nums[current]*-1;
        }
        
        return result;
        
    }
}