class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack.equals(needle)) return 0;
        int needle_len = needle.length();
        if(needle_len == 0 && haystack.length() !=0) return 0;
        if(needle_len > haystack.length()) return -1;
        
        char[] needleArray = needle.toCharArray();
        char[] haystackArray = haystack.toCharArray();
        char start = needleArray[0];
        char end = needleArray[needle_len-1];
        
        for(int i=0;i<haystackArray.length - needle_len+1 ;i++){
            if(haystackArray[i] == start && haystackArray[i+needle_len-1]== end){
                int pos = subString(needleArray,haystackArray,i);
                if( pos != -1)
                    return pos;
            }
        }
        return -1;
    }
    
    public int subString(char[] needleArray, char[] haystackArray, int pointer ){
        int i= 0, index = pointer;
        while(index < haystackArray.length && i< needleArray.length && haystackArray[index] == needleArray[i] ){
            index++;
            i++;
        }
        if(i== needleArray.length)
            return pointer;
        else
            return -1;
    }
}
