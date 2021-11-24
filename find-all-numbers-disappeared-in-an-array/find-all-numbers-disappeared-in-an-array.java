class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> returnList = new ArrayList();
        int n = nums.length;
        
        for(int i= 0 ;i< n ;i++){
            int pos = Math.abs(nums[i])-1;
            if(nums[pos] > 0)
                nums[pos] = -1* nums[pos];
            
        }
        
        for(int i= 1; i<=n ;i++){
            if(nums[i-1] >0)
              returnList.add(i);  
        }
        
        return returnList;
        
    }
}