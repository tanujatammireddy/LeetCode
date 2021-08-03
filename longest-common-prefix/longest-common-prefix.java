class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String longestPrefix = strs[0];
        for(int i=1;i<strs.length;i++){
            longestPrefix = prefix(longestPrefix,strs[i]);
        }
        return longestPrefix;
    }
    public String prefix(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int i=0, j=0;
        while(i< s1.length() && j< s2.length()){
            if(s1.charAt(i) != s2.charAt(j))
              break;  
            sb.append(s1.charAt(i));
            i++;
            j++;
            
        }
        return sb.toString();
    }
}