class Solution {
    
    int idx = 0;
    int[] order;
    boolean hasCycle = false;
    boolean[] visited ;
    boolean[] set;
    int n;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> preqList = new ArrayList();
        order = new int[numCourses];
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
                    return new int[]{};
            }
        }
        
        return order;
    }
    
    public void helper(int currentCourse,List<List<Integer>> preqList){
        
        if(set[currentCourse])
        {
            hasCycle = true;
            return;
        }
        set[currentCourse] = true;
        if(idx == n)
            return;
        
        
        for(int preq: preqList.get(currentCourse)){
            if(!visited[preq]){
                helper(preq,preqList);
            }
        }
        
        visited[currentCourse] = true;
        order[idx] = currentCourse;
        
        idx++;
        
    }
}