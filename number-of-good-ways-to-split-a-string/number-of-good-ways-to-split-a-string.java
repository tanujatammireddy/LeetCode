class Solution {
    public int numSplits(String s) {
        
        int numSplits = 0;
        int len = s.length()-1;
        
        int[] left = new int[26];
        int[] right = new int[26];
        
        int[] leftDistinct = new int[len];
        int[] rightDistinct = new int[len];
        
        int leftDistinctCount = 0;
        int rightDistinctCount = 0;
        
        for(int i= 0; i< len ;i++){
            
            char left_char = s.charAt(i);
            char right_char = s.charAt(len-i);
            
            left[left_char-'a']++;
            right[right_char-'a']++;
            
            if(left[left_char-'a'] == 1)
                leftDistinctCount++;
            
            if(right[right_char-'a'] == 1)
                rightDistinctCount++;
            
                rightDistinct[len-i-1] = rightDistinctCount;
                leftDistinct[i] = leftDistinctCount;
            
        }
        
        for(int i= 0; i<len ;i++){
           if(leftDistinct[i] == rightDistinct[i])
               numSplits++;
            
        }
        
        return numSplits;
    }
    
    
}