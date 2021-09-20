class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len = s1.length();
        int[] charArray = new int[26];
        for(char ch: s1.toCharArray()){
            
            charArray[ch-'a']++;
        }
        
        int pointer = 0;
        while(pointer <= s2.length()-len){
            char ch = s2.charAt(pointer);
            
            if(charArray[ch-'a'] > 0)
            {
                if(compare(s2.substring(pointer,pointer+len),charArray))
                    return true;
            }
            pointer++;
        }
        return false;
    }
    public boolean compare(String str,int[] s1_array){
        int[] s2_array = new int[26];
        for(int i=0;i<str.length();i++){
            s2_array[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {   
            if(s1_array[i] != s2_array[i]) return false;
        }
        
        return true;
    }
}