class Solution {
    public String[] findWords(String[] words) {
        
        Set<Character> set1 = new HashSet();
        Set<Character> set2 = new HashSet();
        Set<Character> set3 = new HashSet();
        List<String> result = new ArrayList<>();
        for ( Character ch : "qwertyuiop".toCharArray()) {
            set1.add(ch);
        }
          for ( Character ch : "asdfghjkl".toCharArray()) {
            set2.add(ch);
        }
        
         for ( Character ch : "zxcvbnm".toCharArray()) {
            set3.add(ch);
        }
        
        int count1=0;
        int count2=0;
        int  count3=0;
        
        for ( String word : words ) {
              
                 
            
        for ( Character ch: word.toLowerCase().toCharArray()){
            
            if(set1.contains(ch)) {
                count1++;
            } else if (set2.contains(ch)) {
                count2++;
            } else if (set3.contains(ch)) {
                count3++;
            }
            
            if ( count1 == word.toCharArray().length ||count2 == word.toCharArray().length || count3 == word.toCharArray().length ) {
                result.add(word);
            }
           
           
            
        }
            count1= count2= count3=0;     
        }
        
        
        String[] temp = new String[result.size()];
        
        for ( int i=0; i<result.size() ; i ++){
            temp[i] = result.get(i);
        }
       return temp; 
    }
}