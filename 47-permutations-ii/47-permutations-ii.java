class Solution {
    
    private List<List<Integer>> permuatations = new ArrayList();
    private int n = 0;
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        
        n = nums.length;
        boolean[] visited = new boolean[n];
        Arrays.sort(nums);
        helper(nums,visited,new ArrayList());
        
        return permuatations;
    }
    
    public void helper(int[] nums,boolean[] visited,List<Integer>list){
        
        if(list.size() == n){
            permuatations.add(new ArrayList(list));
        }
        else{
            
            for(int i= 0 ;i< n ;i++){
                
                if(visited[i] || (i > 0 &&  visited[i-1] && nums[i-1]== nums[i])){
                    continue;
                }
                else
                {
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