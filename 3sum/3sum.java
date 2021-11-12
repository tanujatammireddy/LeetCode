class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> returnList = new ArrayList();
        Arrays.sort(nums);
        
        for(int i= 0;i< nums.length ;i++)
            if(i== 0 || nums[i-1]!= nums[i])
                twoSum(nums,i,-nums[i],returnList);

        return returnList;
    }
    
    public void twoSum(int[] nums, int current , int sum, List<List<Integer>>  returnList){
        
        Set<Integer> set = new HashSet();
        
        for(int i= current+1;i< nums.length ;i++){
            
            if(set.contains(sum-nums[i])){
                returnList.add(Arrays.asList(nums[current],sum-nums[i],nums[i]));
                while(i+1< nums.length && nums[i] == nums[i+1])
                i++;
            }
            else
                set.add(nums[i]);
            
            
          
        }
        
    }
}