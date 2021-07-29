class Solution {
    
    public int trap(int[] height) {
        
        
        int length = height.length;
        int ans = 0;
        if(length == 0) return ans;
        int[] left = new int[length];
        int[] right = new int[length];
        
        left[0] = height[0];
        right[length-1] = height[length-1];
        
        for(int i=1;i<length;i++){
          left[i] = Math.max(height[i],left[i-1]);
        }
        //System.out.println(Arrays.toString(left));
        for(int i=length-2;i>0;i--){
         right[i] = Math.max(height[i],right[i+1]);
        }
         //System.out.println(Arrays.toString(right));
        for(int i=1;i<length-1;i++){
          ans += Math.min(left[i],right[i])-height[i];
        }
        return ans;
    }
}