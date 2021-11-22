class WordDictionary {
    TrieNode root;
    public WordDictionary() {
         root = new TrieNode('*');
    }
    
    public void addWord(String word) {
        if(word.length() > 0)
            wordToTrie(word,0,root); 
    }
    
    public boolean search(String word) {
        
        return searchInTrie(word,0,root); 
    }
    
    private boolean searchInTrie(String word, int pos, TrieNode root){
        
        if(pos == word.length())
            return root.word;
        
        char current = word.charAt(pos);
        
        
        if(root.child.size() > 0){
            
            for(TrieNode child: root.child){
                
                if(current== '.'||child.ch == current)
                {   
                    if(searchInTrie(word,pos+1,child))
                        return true;
                }
                
            }
        }
        
        return false;
    }
    
    private void wordToTrie(String word, int pos, TrieNode root){
        
        if(pos == word.length()){
            root.word = true;
            return;
        }
        else{
            
            char current = word.charAt(pos);
            boolean charFound = false;
            
            //System.out.println("current"+current);
            
            if(root.child.size() > 0){
                for(TrieNode child: root.child){
                    if(child.ch == current)
                    {      
                        charFound = true;
                        wordToTrie(word,pos+1,child); 
                        return;
                    }
                }
            }
        if(!charFound)
        {
            TrieNode next = new TrieNode(current);
            root.child.add(next);
            wordToTrie(word,pos+1,next); 
        }
    }
    }
}

public class TrieNode{
    char ch;
    List<TrieNode> child;
    boolean word = false;
    public TrieNode(char c){
        ch = c;
        child = new ArrayList();
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */