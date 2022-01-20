class Solution {
    public int lengthLongestPath(String input) {
        
        String[] paths=input.split("\n");
        
        int[] stack = new int[paths.length + 1];
        stack[0] = -1;

        int maxLen = 0;
        for (String s : paths) {
            int lev = s.lastIndexOf("\t") + 2;
            
            stack[lev] = stack[lev-1] + s.length() - lev + 2;
            
            System.out.println(s+" lev: "+lev+" stack[lev]:"+stack[lev]);
            if (s.contains(".")) {
                maxLen = Math.max(maxLen, stack[lev]);
            }
        }

        return maxLen;
    }
}