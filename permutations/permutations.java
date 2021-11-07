class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> returnList = new ArrayList();
        boolean[] visited = new boolean[nums.length];
        backTracking(nums,visited,returnList,new ArrayList());
        return returnList;
        
    }
    public void backTracking( int[] nums,boolean[] visited, List<List<Integer>> returnList, List<Integer>list){
        
        //System.out.print(""+list);
        if(list.size() == nums.length)
            returnList.add(new ArrayList<>(list));
        
        else{
            for(int i=0;i< nums.length;i++){
                if(!visited[i]){
                    visited[i] = true;  
                    list.add(nums[i]);
                    backTracking(nums,visited,returnList,list);
                    list.remove(list.size()-1);
                    visited[i] = false;    
            }
            
        }
        }
        
    }
}