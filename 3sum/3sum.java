class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> returnList = new ArrayList();
        
        for(int i=0;i<nums.length ;i++){
            if(i==0 || nums[i-1] != nums[i])
           twoSum(nums,i,returnList);
        }
        return returnList;
    }
    public void twoSum(int[] nums, int pos,List<List<Integer>> returnList) {
        
        Set<Integer> set = new HashSet();
        
        for(int i=pos+1; i<nums.length ;i++){
            int complemenet = -nums[pos]-nums[i];
            if(set.contains(complemenet)){
                returnList.add(Arrays.asList(nums[i],complemenet,nums[pos]));
                while(i+1 < nums.length && nums[i]== nums[i+1])
                    i++;
            }
             set.add(nums[i]);
            }
    }
}