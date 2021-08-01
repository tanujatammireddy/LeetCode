class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        //int[][] table = new int[len][len];
        int currentSubarray = Integer.MIN_VALUE;
        
        for(int i=0;i<len;i++){
            currentSubarray= 0;
            for(int j=i;j <nums.length;j++){
                currentSubarray += nums[j];
                max= Math.max(max,currentSubarray);
            }
        }
        /*for(int start=0; start< len ;start++){
            for(int end=0;end<len;end++ ){
                System.out.print("   "+table[start][end]);
            }
            System.out.println("");
        }*/
        return max;
    }
}