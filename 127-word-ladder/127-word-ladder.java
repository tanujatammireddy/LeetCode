class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set<String> words = new HashSet<>(wordList);
        if (!words.contains(endWord)) return 0;
        Queue<String> queue = new LinkedList();
        queue.add(beginWord);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            level ++;
            for(int i=0;i< size; i++){
                //System.out.print(queue);
                String current = queue.poll();
                if(current.equals(endWord))
                    return level;
                List<String> possibleValues = possibleValues(current);
                for(String possibleValue: possibleValues){
                    if(words.contains(possibleValue)){
                        words.remove(possibleValue);
                        queue.add(possibleValue);
                    }
                }
            }
        }
        
       return 0; 
        
    }

public List<String> possibleValues(String word){
    
    List<String> result = new ArrayList();
    char[] charArray = word.toCharArray();
    for(int i=0;i< word.length();i++){
        char temp = charArray[i];
        for(char c='a';c<='z';c++){
            charArray[i] = c;
            String newValue = String.valueOf(charArray);
            result.add(newValue);
        }
        charArray[i] = temp;
    }
    
    return result;
}
}

/** 
beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]

hit 

Possible values: *it, h*t, hi*
if wordList has any the possible values
add it to the queue and repeat till we find the endWord

We are using bfs.

Time Complexity : O(M*M*N)
Space Complexity :O(M*N)

**/