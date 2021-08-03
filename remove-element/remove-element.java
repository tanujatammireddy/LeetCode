class Solution {
    public int removeElement(int[] nums, int val) {
        int count =0;
        Arrays.sort(nums);
        int i=0;
        for(int j=0;j<nums.length;j++){
            while(j<nums.length && nums[j] == val ){
                count++;
                j++;
            } 
            if(j<nums.length)
            nums[i]= nums[j];
            i++;
        }
        //System.out.println(""+count);
        return nums.length-count;
    }
}