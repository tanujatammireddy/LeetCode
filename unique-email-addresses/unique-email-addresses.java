class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> mail = new HashSet();
        
        for(String current: emails){
            
            String[] split = current.split("@");
            String result = validate(split[0]) +"@"+ split[1];
            mail.add(result);
            
        }
        
        return mail.size();
        
    }
    
    public String validate (String userID){
        
        StringBuilder sb = new StringBuilder();
        for(char ch: userID.toCharArray()){
            if(ch == '.') continue;
            if(ch == '+') break;
            sb.append(ch);
        } 
        return sb.toString();
    }
}