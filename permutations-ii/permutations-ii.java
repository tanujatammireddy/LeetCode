class Solution {
    public List<List<Integer>> returnList = new LinkedList();
    public int len ;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        len = nums.length;
        boolean[] visited = new boolean[len];
        backTrack(new LinkedList(), nums,visited);
        return returnList;
    }
    public void backTrack(List<Integer> subList, int[] nums,boolean[] visited ){
        if(subList.size() == len){
            returnList.add(new LinkedList(subList));
        }
        else{
        for(int i=0;i< len;i++){
            if(visited[i] || (i>0 && visited[i-1] == true && nums[i] == nums[i-1]))
                continue;
            else{
                visited[i] = true;
                subList.add(nums[i]);
                //System.out.println(""+subList);
                backTrack(subList, nums,visited);
                subList.remove(subList.size()-1);
                visited[i] = false;
            }
        }
        }
        
    }
}