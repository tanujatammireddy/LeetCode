class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pointer1 = 0;
        int pointer2 = 0;
        
        while(pointer1 < nums1.length && pointer2 < nums2.length){
            
            if(nums2[pointer2] == nums1[pointer1] ){
                 set.add(nums2[pointer2]);
                 pointer1++;
                 pointer2++;
            }
            else if(nums2[pointer2] > nums1[pointer1] )
                pointer1++;
            else 
                pointer2++;
                
        }
        
        
        int[] result = new int[set.size()];
        int i= 0;
        for(int num:set){
            result[i] = num;
            i++;
        }
        return result;
    }
}