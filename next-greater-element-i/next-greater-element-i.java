class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int[] result = new int[n];
        
        // Map of Element and next greatest element.
        //Stack helps in getting the next greatest element
        
        Stack<Integer> stack = new Stack<>(); 
        Map<Integer,Integer> map = new HashMap();
        
        for(int current:nums2){
            while(!stack.isEmpty() && stack.peek() < current)
                map.put(stack.pop(),current);
            stack.add(current);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }
        for(int i=0;i< n;i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}