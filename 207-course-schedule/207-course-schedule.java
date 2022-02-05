class Solution {
    
    boolean hasCycle = false;
    boolean[] visited ;
    boolean[] set;
    int n;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> preqList = new ArrayList();
        visited = new boolean[numCourses];
        set = new boolean[numCourses];
        n = numCourses;
        
        for(int i=0; i< numCourses;i++){
            preqList.add(new ArrayList());
        }
        for(int[] preq: prerequisites){
            preqList.get(preq[0]).add(preq[1]);
        }
        //System.out.println(preqList);
        
        for(int i=0; i< n;i++){
            if(!visited[i]){
                helper(i,preqList);
                if(hasCycle)
                    return false;
            }
        }
        
        return true;
    }
    
    public void helper(int currentCourse,List<List<Integer>> preqList){
        
        if(set[currentCourse])
        {
            hasCycle = true;
            return;
        }
        set[currentCourse] = true;
        
        for(int preq: preqList.get(currentCourse)){
            if(!visited[preq]){
                helper(preq,preqList);
            }
        }
        
        visited[currentCourse] = true;
       
        
    }
}