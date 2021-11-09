class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        int[] s_map = new int[26];
        int[] t_map = new int[26];
        for(char ch:s.toCharArray())
            s_map[ch-'a']++;
        for(char ch:t.toCharArray())
            t_map[ch-'a']++;
        
        return (Arrays.equals(s_map,t_map));
        
    }
}