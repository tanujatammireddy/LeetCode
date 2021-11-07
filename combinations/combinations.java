class Solution {
    
    List<List<Integer>> returnList = new ArrayList();
    public List<List<Integer>> combine(int n, int k) {
        
        backtracking(1,n,k,new ArrayList());
        return returnList;
    }
    
    public void backtracking(int current, int n, int k, List<Integer> list){
        
        if(list.size() == k){
            List<Integer> sublist = new ArrayList();
            sublist.addAll(list);
            returnList.add(sublist);
        }
        for(int i = current; i<= n;i++){
            list.add(i);
            backtracking(i+1,n,k,list);
            list.remove(list.size()-1);
        }
    }
        
}