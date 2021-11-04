class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length ;i++){
            StringBuilder  current =  new StringBuilder();
            current.append(words[i]);
            current.reverse();
            sb.append(current);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}