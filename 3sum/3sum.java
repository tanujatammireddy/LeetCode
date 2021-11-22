class Solution {
    
    private  List<List<Integer>> returnList;
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        returnList = new ArrayList();
        Arrays.sort(nums);
        int i= 0;
        
        while(i< nums.length){
            
            twoSum(nums,i);
            int j = i+1;
            while(j<nums.length && nums[i] == nums[j])
                j++;
            i= j;
        }
        
        return returnList;
    }
    
    public void twoSum(int[] nums, int pos){
        
       
        Set<Integer> set = new HashSet();
        
        int i= pos+1;
        while( i< nums.length){
            
            int sum = nums[i] + nums[pos];
            
            if(set.contains(-sum)){
                 returnList.add(Arrays.asList(nums[i],nums[pos],-sum));  
                 int j = i+1;
                 while(j<nums.length && nums[i] == nums[j])
                     j++;
                 i= j;
            }
            else{
                set.add(nums[i]);
                i++;
            }
        }
        
        
    }
}