class Solution {
    public boolean isPalindrome(String s) {
        
        
        boolean valid= true;
        char[] tmp =s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray();
        for(int i=0,j=tmp.length-1; i<=j; i++,j--) {
            if( tmp[i] != tmp[j] ){
                valid =false;
                break;
            }
        }
        
    return valid;
    }
}