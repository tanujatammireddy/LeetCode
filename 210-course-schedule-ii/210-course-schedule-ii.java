class Solution {
    private int n;
    int[] order;
    int idx = 0;
    boolean[] visited;
    boolean[] added;
    boolean hasCycle;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> adjacencyList = new ArrayList();
        visited = new boolean[numCourses];
        added = new boolean[numCourses];
        n = numCourses;
        order = new int[n];
        for(int i= 0;i< numCourses; i++){
            adjacencyList.add(new ArrayList());
        }
        
        for(int[] preq: prerequisites){
            int course = preq[0];
            int pre = preq[1];
            adjacencyList.get(course).add(pre);
        }
        
        for(int i= 0; i< numCourses; i++){
            if(!visited[i]){
                helper(i,adjacencyList);
            }
            if(hasCycle)
                return new int[]{};
        }
        return order;
        
    }
    
    public void helper(int currentCourse, List<List<Integer>> adjacencyList){
        if(idx == n)
            return;
        
        if(added[currentCourse]){
            hasCycle = true;
            return;
        }
        added[currentCourse] = true;
        
        for(Integer preq: adjacencyList.get(currentCourse)){
            if(!visited[preq]){
                helper(preq,adjacencyList);
            }
        }
        
        visited[currentCourse]= true;
        order[idx] = currentCourse;
        idx++;
    }
}