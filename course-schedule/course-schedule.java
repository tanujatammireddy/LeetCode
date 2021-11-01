class Solution {
    public Map<Integer,List<Integer>> map ;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      
        map = new HashMap();
        
        for(int[] course:prerequisites){
            List<Integer> list = map.getOrDefault(course[0],new ArrayList());
            list.add(course[1]);
            map.put(course[0],list);
        }
        boolean[] checked = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        for(int current_course:map.keySet()){
            if(isCyclic(current_course,checked,path))
                return false;
        }
        
        return true;
    }
    
    public boolean isCyclic (int current_course,boolean[] checked,boolean[] path ){
        
        if(checked[current_course])
            return false;
        if(path[current_course])
            return true;
        path[current_course] = true;
        
        if(map.containsKey(current_course)){
            
            for(int prerequisite:map.get(current_course)){
                if(path[prerequisite])
                    return true;
                if(isCyclic(prerequisite,checked,path))
                    return true;
                    
            }
        }
        
        checked[current_course] = true;
        path[current_course] = false;
        return false;
    }
}