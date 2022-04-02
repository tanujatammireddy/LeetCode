class Solution {
    public int minOperations(int[] nums1, int[] nums2) {
        
        int result = 0;
        int sum1 = 0;
        for(int num:nums1)
            sum1 += num;
        
        int sum2 = 0;
        for(int num:nums2)
            sum2 += num;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        /* Passing the array with heighest sum as Array1*/
        if(sum1 > sum2)
            result = helper(nums1, nums2, sum1, sum2);
        else if(sum1 < sum2)
            result = helper(nums2, nums1, sum2, sum1);
        
        return result;
        
    }
    
    /*Using greedy approach and pointers reducing the sum of the array with a larger sum or increasing the array's sum with the smaller sum*/
    
    public int helper(int[] nums1, int[] nums2, int sum1, int sum2){
        
        int max_pointer = nums1.length -1;
        int min_pointer = 0;
        
        //**Parsing the lowest sum array from starting to add points and Height sum array from the end to remove the points**//
        int operations_count = 0;
        
        while((max_pointer >= 0 || min_pointer < nums2.length) && sum1 != sum2){
            
            
            int diff = sum1 - sum2;
            int valueToAdd = 0;
            int valueToRemove = 0;
            
            /*Calculating the points we can add*/
            if(min_pointer < nums2.length && diff > 0 && nums2[min_pointer] < 6)
            {
                valueToAdd = (6 - nums2[min_pointer]) ;
                valueToAdd = (valueToAdd > diff) ? diff: valueToAdd;
            }
            /*Calculating the points we can reduce*/
            if(max_pointer >= 0 && diff > 0 && nums1[max_pointer] > 1)
            {
                valueToRemove = (nums1[max_pointer]-1);
                valueToRemove = (valueToRemove > diff) ? diff : valueToRemove;
                    
            }
            /*If we can not do any further operations break condition*/
            if(valueToAdd == 0 && valueToRemove == 0)
                break;
            
            /*Deciding to add or remove values based on the heighest value*/
            if(valueToAdd > valueToRemove){
                sum2 += valueToAdd;
                nums2[min_pointer] += valueToAdd ;
                operations_count++;
                min_pointer++;
            }
            else
            {
                sum1 = sum1-valueToRemove;
                nums1[max_pointer] -= valueToRemove ;
                operations_count++;
                max_pointer--;
                
            } 
        }
        
        //verify if the idle condition is met
        return (sum1 - sum2 <= 0 )?operations_count:-1;
        
    }
}