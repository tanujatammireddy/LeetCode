class Solution {
    public String largestNumber(int[] nums) {
        
        int len = nums.length;
        String[] array = new String[len];
        for(int i=0; i<len; i++){
            array[i] = String.valueOf(nums[i]);
        }
        if(len>1){
        Arrays.sort(array,(a,b)->{
            long n1 = Long.parseLong(a+b);
            long n2 = Long.parseLong(b+a);
            if(n1 == n2)
                    return 0;
            else if(n1 > n2)
                    return -1;
            else
                    return 1;});
        }
       // System.out.print(""+array[0]);
        if(array[0].equals("0"))
            return "0";
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len; i++){
            sb.append(array[i]) ;
        }
        return sb.toString();
    }
}