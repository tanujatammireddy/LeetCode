class Solution {
    
    int index = 0;
    int[] result ;
    boolean[] visited ;
    int n;
    boolean hasCycle;
    Set<Integer> set;
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        set = new HashSet();
        result = new int[numCourses];
        visited = new boolean[numCourses];
        n= numCourses;
        List<List<Integer>> list = new ArrayList();
        
        for(int i= 0 ;i< numCourses; i++){
            list.add(new ArrayList());
        }
        
        for(int[] prereq:prerequisites){
            
            int course = prereq[0];
            int preReq = prereq[1];
            list.get(course).add(preReq);
            
        }
        
        for(int i= 0 ;i< numCourses; i++){
            if(! visited[i])
                helper(i,list);
            if(hasCycle)
                return new int[]{};
        }
        
       // System.out.println("list"+list);
        return result;
        
    }
    
    public void helper(int course, List<List<Integer>> list){
        
        if(index == n)
            return;
        
        if(set.contains(course))
        {
            hasCycle = true;
            return;
            
        }
        else
            set.add(course);
        
        for(int nextCourse: list.get(course)){
            if(! visited[nextCourse])
                helper(nextCourse,list);
        }
        
        visited[course] = true;
        result[index] = course;
        index ++;
        
    }
}