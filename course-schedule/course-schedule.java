class Solution {
    
    public Map<Integer,List<Integer>> map;
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        map = new HashMap();
        
        for(int[] course:prerequisites){
            
            if(map.containsKey(course[0]))
                map.get(course[0]).add(course[1]);
            else{
                List<Integer> list = new ArrayList();
                list.add(course[1]);
                map.put(course[0],list);
            }
        }
        
        boolean[] courses = new boolean[numCourses];
        boolean[] checked = new boolean[numCourses];
        for(int currentCourse: map.keySet() ){
            if(isCyclic(currentCourse,numCourses,courses,checked))
                return false;
        }
        
        
        return true;
        
    }
    public boolean isCyclic(int currentCourse, int numCourses,boolean[] courses,boolean[] checked){
        
        if(checked[currentCourse]) return false;
        if(courses[currentCourse]) return true;
        
        if(map.containsKey(currentCourse)){
            courses[currentCourse] = true;
            for(int preReq: map.get(currentCourse)){
                if(courses[preReq] == true)
                    return true;
                if(map.containsKey(preReq))
                    if(isCyclic(preReq,numCourses,courses,checked)) 
                        return true;
            
        } 
            courses[currentCourse] = false;
        }
        checked[currentCourse] = true;
        return false;
        
    }
}