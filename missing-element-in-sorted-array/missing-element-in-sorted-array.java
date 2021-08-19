class Solution {
    public int missingElement(int[] nums, int k) {
        
        //List<Integer> missingNumbersList = new ArrayList();
        int missingNumber = 0;
        int count = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]- nums[i-1]>1){
                missingNumber = nums[i-1]+1;
                while(missingNumber < nums[i]){
                    //missingNumbersList.add(missingNumber);
                    count++;
                    if(count == k)
                        return missingNumber;
                    missingNumber++;  
                }
            }
            
        }
         missingNumber = nums[nums.length-1]+1;
        while(count < k-1){
             //missingNumbersList.add(missingNumber);
             count++;
             missingNumber++; 
        }
        //System.out.println(""+missingNumbersList);
        return missingNumber;
    }
}