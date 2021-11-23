class Solution {
    public int longestPalindrome(String s) {
        int[] charArray = new int[128];
        int longestPalindrome = 0;
        for(char ch:s.toCharArray()){
            charArray[ch]++;
        }
        
        for(int i=0 ;i<128 ;i++)
        {
            int count = charArray[i];
            longestPalindrome += count/2 * 2;
            if( count %2 == 1 && longestPalindrome% 2 == 0)
                longestPalindrome++;
        }
        return longestPalindrome;
    }
}