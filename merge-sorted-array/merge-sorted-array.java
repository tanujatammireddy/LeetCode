class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length-1;
        m--; n--;
        while(len >= 0 ){
            
            if(m >= 0 && n >=0 && nums1[m] > nums2[n]){
                nums1[len] = nums1[m];
                m--;
            }
            else if(n >= 0)
            {
                nums1[len] = nums2[n];
                n--;
            }
            len--;
        }
        
    }
}