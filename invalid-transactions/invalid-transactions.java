class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        Map<String, List<Transaction>> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(String transaction : transactions) {
            populateMap(transaction, map);
        }
        for(String transaction : transactions) {
            if(!isValid(transaction, map)) result.add(transaction);
        }
        return result;
    }
    
    public void populateMap(String transaction, Map<String, List<Transaction>> map) {
        String[] split = transaction.split(",");
        map.computeIfAbsent(split[0], list -> new ArrayList<>()).add(new Transaction(Integer.valueOf(split[1]),split[3]));
    }
    
    public boolean isValid(String transaction, Map<String, List<Transaction>> map) {
        String[] split = transaction.split(",");
        if(Integer.valueOf(split[2]) > 1000) return false;
        List<Transaction> otherTransactions = map.get(split[0]);
        for(Transaction otherTransaction : otherTransactions) {
            if(Math.abs(Integer.valueOf(split[1])-otherTransaction.time) <= 60 && !otherTransaction.city.equals(split[3])) return false;
        }
        return true;
    }
    
    class Transaction {
        int time;
        String city;
        public Transaction(int time, String city) {
            this.time = time;
            this.city = city;
        }
    }
}