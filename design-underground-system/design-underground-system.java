class UndergroundSystem {
    
    Map<String,List<Double>> avgerageTimeMap = new HashMap();
    Map<Integer,Pair<String,Integer>> checkInDataMap = new HashMap();
    public UndergroundSystem() {
        
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkInDataMap.put(id,new Pair<>(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        if(checkInDataMap.containsKey(id)){
            Pair<String,Integer> p = checkInDataMap.get(id);
            String checkInStation = p.getKey();
            int checkInTime = p.getValue();
            double duration = (double) (t-checkInTime);
            String key = checkInStation+":"+stationName;
            if(avgerageTimeMap.containsKey(key)){
                avgerageTimeMap.get(key).add(duration);
            }
            else{
                List<Double> list = new ArrayList();
                list.add(duration);
               avgerageTimeMap.put(key,list); 
            }    
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
       // System.out.println(""+avgerageTimeMap); 
        String key = startStation+":"+endStation;
        List<Double> list = avgerageTimeMap.get(key);
        int sum=0;
        for(Double t:list){
            sum += t;
        }
        //System.out.println("sum"+sum);
        double avg = (double)sum/list.size();
        //System.out.println("avg"+avg);
        return avg;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */