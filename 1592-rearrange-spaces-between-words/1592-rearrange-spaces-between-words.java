class Solution {
    public String reorderSpaces(String text) {
        
        int space_count = 0;
        int word_count = 0;
        int spaces = 0;
        int spacesAtEnd = 0;
        
        List<StringBuilder> word = new ArrayList();
        
        int i=0;
        while(i< text.length())
        {
            while(i< text.length() && Character.isSpace(text.charAt(i))){
                space_count++;
                i++;
            }
            
            StringBuilder sb = new StringBuilder();
            while(i< text.length() && text.charAt(i) >= 'a' && text.charAt(i) <='z' )
            {   
                sb.append(text.charAt(i));
                i++;     
            }
            if(sb.length() > 0)
                word.add(sb);
        }
        
        word_count = word.size();
        
        if(space_count == 0)
            return text;
        if(word_count == 1){
            spacesAtEnd = space_count;
        }
        else{
            word_count = word.size()-1;
            spaces = space_count/word_count;
            spacesAtEnd = space_count%word_count;
        }
        
        StringBuilder space = new StringBuilder();
        StringBuilder spaceAtEnd = new StringBuilder();
        int idx = 0;
        
        while(idx < spaces){
            space.append(' ');
            idx++;
        }
        idx = 0;
        while(idx < spacesAtEnd){
            spaceAtEnd.append(' ');
            idx++;
        }
        StringBuilder result = new StringBuilder();
        result.append(word.get(0));
        idx = 1;
        
        while(idx < word.size()){
            result.append(space);
            result.append(word.get(idx));
            idx++;
        }
        if(spaceAtEnd.length() > 0)
            result.append(spaceAtEnd);
        
        return result.toString();
        
    }
}

/**
        System.out.println("space_count: "+space_count);
        System.out.println("word_count: "+word.size());
        System.out.println("spaces: "+spaces);
        System.out.println("spacesAtEnd: "+spacesAtEnd);
**/