class Solution {
    
    List<StringBuilder> resultList = new ArrayList();
    
    public String[] expand(String s) {
        
        List<StringBuilder> subString = new ArrayList();
        int i=0;
        
        while(i<s.length()){
            
            char ch = s.charAt(i);
            StringBuilder sb = new StringBuilder();
            if(ch =='{')
            {
                i++;
                while(s.charAt(i) != '}'){
                    
                    if(s.charAt(i) != ',')
                        sb.append(s.charAt(i));
                    i++;
                }
            }
            else
                sb.append(s.charAt(i));
            
            subString.add(sb);
            i++;
        }
        
        helper(0,subString,new StringBuilder());
        Collections.sort(resultList); 
        
        String[]  result = new String[resultList.size()];
        for(int idx=0; idx<resultList.size(); idx++){
            result[idx] = resultList.get(idx).toString();
        }
            
        return result;
        
    }
    
    public void helper(int list_idx,List<StringBuilder> subString,StringBuilder currentString ){
        
        if(list_idx == subString.size())
        {
            resultList.add(new StringBuilder(currentString));
        }
        else
        {
            for(int i=0;i< subString.get(list_idx).length();i++){
                
                char ch = subString.get(list_idx).charAt(i);
                
                StringBuilder next = new StringBuilder();
                next = currentString.append(ch);
                
                helper(list_idx+1,subString,next);
                
                next.deleteCharAt(next.length() - 1);
                
            }
        }
        
    }
}