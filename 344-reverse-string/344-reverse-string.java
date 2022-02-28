class Solution {
    public void reverseString(char[] s) {
        int start, end;
        char temp;
        start=0;
        end=s.length-1;
        while(start<end){
            temp=s[start];
            s[start] =s[end];
            s[end]=temp;
            start++;
            end--;
        }
        
    }
}