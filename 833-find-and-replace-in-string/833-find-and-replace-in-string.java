class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        
        int len = s.length();
        int[] match = new int[len];
        Arrays.fill(match,-1);
        
        for(int i=0;i< indices.length ;i++){
            
            int index = indices[i];
            if(s.substring(index,index+ sources[i].length()).equals(sources[i])){
                
                match[index]= i;
            }
        }
        
        //System.out.print(Arrays.toString(match));
        
        StringBuilder sb= new StringBuilder();
        int i=0;
        while(i< len){
            
            if(match[i] != -1){
                sb.append(targets[match[i]]);
                i += sources[match[i]].length();
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
                
        }
        
        return sb.toString();
        
    }
}