class Logger {
    public Map<String,Integer> map = new HashMap();
    public Logger() {
    
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(map.containsKey(message))
        {
            if(map.get(message) <= timestamp)
                map.put(message,timestamp+10);
            else
                return false;
        }
        else
            map.put(message,timestamp+10);
        
        return true;
            
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */