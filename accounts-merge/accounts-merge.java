class Solution {
    
    Map<String, List<String>> map = new HashMap();
    Set<String> visited = new HashSet();
    
    private void dfs(List<String> mergedAccount, String email){
        
        if(map.containsKey(email)){
            
        for(String connectedEmail:map.get(email)){
            
            if(!visited.contains(connectedEmail)){
                mergedAccount.add(connectedEmail);
                visited.add(connectedEmail);
                dfs(mergedAccount,connectedEmail);
            }
            
        }
        }
    }
    
    
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        
        for(List<String> accList:accounts){
            
            String email_1 = accList.get(1);
            
            if(accList.size() > 2){
                
                for(int j = 2; j< accList.size() ;j++){
                    
                    String current = accList.get(j);
                    
                    if(!map.containsKey(email_1))
                        map.put(email_1, new ArrayList());
                    map.get(email_1).add(current);
                    
                    if(!map.containsKey(current))
                        map.put(current, new ArrayList());
                    map.get(current).add(email_1);
                    
                }
            }
        }
            
        List<List<String>> mergedAccounts = new ArrayList(); 
        for(List<String> accList:accounts){
            String name = accList.get(0);
            String email = accList.get(1);
            
            if(!visited.contains(email)){
                List<String> mergedAccount = new ArrayList();
                visited.add(email);
                mergedAccount.add(name);
                mergedAccount.add(email);
                dfs(mergedAccount,email);
                Collections.sort(mergedAccount.subList(1,mergedAccount.size()));
                mergedAccounts.add(mergedAccount);
            }
        }
    return mergedAccounts;
    }
}

