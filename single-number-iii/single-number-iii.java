class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2)
            return nums;
        HashSet<Integer> set = new HashSet();
        for(int num:nums){
            if(set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }
        int[] array = new int[set.size()];
      
        int j = 0;
        for (Integer i: set) {
         array[j++] = i;
        }
        return array;
    }
}