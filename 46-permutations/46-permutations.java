class Solution {
    private List<List<Integer>> permuatations = new ArrayList();
    private int n = 0;
    public List<List<Integer>> permute(int[] nums) {
        
        n = nums.length;
        boolean[] visited = new boolean[n];
        helper(nums,visited,new ArrayList());
        
        return permuatations;
    }
    
    public void helper(int[] nums,boolean[] visited,List<Integer>list){
        
        if(list.size() == n){
            permuatations.add(new ArrayList(list));
        }
        else{
            
            for(int i= 0 ;i< n ;i++){
                if(!visited[i]){
                    visited[i] = true;
                    list.add(nums[i]);
                    helper(nums,visited,list);
                    list.remove(list.size()-1);
                    visited[i] = false;
                }
                
            }
            
            
        }
            
    }
}