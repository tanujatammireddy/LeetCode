class Solution {
    public List<List<Integer>> returnList = new LinkedList();
    public int len ;
    
    public List<List<Integer>> permute(int[] nums) {
        this.len = nums.length;
        boolean[] visited = new boolean[len];
        backTrack(new LinkedList(), nums,visited);
        return returnList;
    }
    public void backTrack(List<Integer> subList, int[] nums,boolean[] visited ){
        if(subList.size() == this.len){
            returnList.add(new LinkedList(subList));
            return;
        }
        for(int i=0;i< len;i++){
            if(visited[i] == false){
                visited[i] = true;
                subList.add(nums[i]);
                backTrack(subList, nums,visited);
                int last_index = subList.size()-1;
                subList.remove(last_index);
                visited[i] = false;
            }
        }
        
    }
    
}