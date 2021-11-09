class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        map.put(0, -1);
        int currSum=0;
        int currRem;
        for(int i=0; i< nums.length; i++){
            currSum+=nums[i];
            currRem=currSum % k;

            if(currRem<0)
                currRem+=k;
            
            if(!map.containsKey(currRem)){
                map.put(currRem, i);
            }
            else{
                if (Math.abs(map.get(currRem) - i) >= 2) return true;
            }
        }
        
        return false;
    }
}