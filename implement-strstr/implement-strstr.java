class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0 && haystack.length()==0 ) return 0;
        if(needle.length()==0 && haystack.length() !=0 ) return 0;
        if(needle.length()!=0 && haystack.length()==0 ) return -1;
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        int j =0;
        int index=-1;
        int count=0;
        if(needle.length() <= haystack.length()){
            for(int i=0;i<haystack.length();i++){
               // System.out.println("i: "+i+" j: "+j);
                
                if(count == needle.length() ) break;
                else
                {
                j=0;index=-1;count=0; 
                while( i+count <haystack.length() && j<needleArray.length && haystackArray[i+count]== needleArray[j] ){
                    if(index== -1) index= i;
                    j++;
                    count++;
                }
                }
            }
        }
        if(count == needle.length() ) return index;
        else return -1;
    }
}