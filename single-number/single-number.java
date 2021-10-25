class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int num:nums){
            if(set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }
        
        list.addAll(set);
        return list.get(0);
    }
}