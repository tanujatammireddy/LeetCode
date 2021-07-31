class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=0;
        int n =nums.length;
        boolean flag = false;
        while(i<n){
            j=i+1;
            while(j<n && nums[i] == nums[j]){
                j++;
            }
            int count =j-i;
            //System.out.println(""+count);
            if(count > n/2) return nums[i];
            
            if(j> i+1)
                i=j;
            else 
                i++;
        }
        return 0;
    }
}