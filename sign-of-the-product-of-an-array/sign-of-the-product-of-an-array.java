class Solution {
    public int arraySign(int[] nums) {
        Arrays.sort(nums);
        int negativeNumbers =0;
        for(int i= 0;i< nums.length;i++){
            if(nums[i] >0) break;
            if(nums[i] == 0) return 0;
            else negativeNumbers++;
        }
        if(negativeNumbers % 2 == 1 ) return -1;
        else return 1;
    }
}