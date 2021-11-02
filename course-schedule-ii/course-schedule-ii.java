class Solution {
    
    Map<Integer,List<Integer>> map ;
    boolean hasCycle = false;
    int[] output;
    public int index = 0;
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        output = new int[numCourses];
        map = new HashMap();
        
        for(int[] course:prerequisites){
            List<Integer> list = map.getOrDefault(course[0],new ArrayList());
            list.add(course[1]);
            map.put(course[0],list);
        }
        
        boolean[] visited = new boolean[numCourses];
        Set<Integer> set = new HashSet();
        
        for(int i=0; i< numCourses;i++){
            
            if(!visited[i]){
                
            dfs(i,visited,set);
                
            if(hasCycle)
                return new int[]{};
            }
        }
        return output;
        
    }
    
    public void dfs(int current_course, boolean[] visited, Set<Integer> set){
        
        if(visited[current_course])
            return;
        
        if(set.contains(current_course)){
            hasCycle = true;
            return;
        }
           
        set.add(current_course);
        
        if(map.containsKey(current_course)){
            
        for(int prerequisite:map.get(current_course))
            dfs(prerequisite,visited,set);
            
        }
       
        visited[current_course] = true;
        output[index] = current_course;
        index++;
        
            
    }
}