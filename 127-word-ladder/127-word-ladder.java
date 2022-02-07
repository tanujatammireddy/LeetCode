class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList();
        Set<String> words = new HashSet<>(wordList);
        
        queue.add(beginWord);
        int level = 0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            level++;
            
            for(int i=0; i< size; i++){
                
                String currentWord = queue.poll();
                if(currentWord.equals(endWord))
                    return level;
                List<String> neighbours = neighbours(currentWord);
                for(String neigh: neighbours){
                    if(words.contains(neigh)){
                        words.remove(neigh);
                        queue.add(neigh);
                    }
                }
            }
            
        }
        return 0;
        
    }
    
    public List<String> neighbours(String word){
        
        char[] charArray = word.toCharArray();
        List<String> result = new ArrayList();
        for(int i=0 ;i< charArray.length;i++){
            char temp = charArray[i];
            for(char c= 'a';c<='z';c++){
                charArray[i] = c;
                String neighbour = String.valueOf(charArray);
                result.add(neighbour);
            }
            charArray[i] = temp;
        }
        return result;
    }
}

/**
M- length of word
N - lengtj of list
helper - O(M^2)*N //Cost of creating a string is Length of the String- M 

Space Complexity- O(M*N)
**/