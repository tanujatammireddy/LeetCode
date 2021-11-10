class Details{
    int ID;
    String startStation;
    String endStation;
    int startTime;
    int endTime;
    public Details(int ID, String startStation,int startTime,String endStation, int endTime){
        this.ID = ID;
        this.startStation = startStation;
        this.endStation = endStation;
        this.startTime = startTime;
        this.endTime = endTime;  
    }
}
class UndergroundSystem {
    
    Map<Integer,Details> undergroundSystemDetailsMap;
    Map<Pair<String,String>,List<Integer>> timeMap;
    public UndergroundSystem() {
        undergroundSystemDetailsMap = new HashMap();
        timeMap = new HashMap();
    }
    
    public void checkIn(int id, String stationName, int t) {
        Details d = new Details(id,stationName,t," ",0);
        undergroundSystemDetailsMap.put(id,d);
    }
    
    public void checkOut(int id, String stationName, int t) {
        
        Details d = undergroundSystemDetailsMap.get(id);
        d.endStation = stationName;
        d.endTime = t;
        undergroundSystemDetailsMap.put(id,d);
        int time = t-d.startTime;
        
        Pair p = new Pair(d.startStation,d.endStation);
        if(!timeMap.containsKey(p)){
           timeMap.put(p, new ArrayList());
        }
        
        timeMap.get(p).add(time);
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        
        List<Integer> list = timeMap.get(new Pair(startStation,endStation));
        
        double averageTime = 0;
        for(int i=0; i< list.size() ;i++){
            averageTime += list.get(i);
        }
        
        return averageTime/list.size();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */