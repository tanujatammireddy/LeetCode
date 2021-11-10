class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        List<Integer> peekValley = new ArrayList();
        
        for(int i=1; i< prices.length ;i++){
            
            int current = prices[i]- prices[i-1];
            if(peekValley.isEmpty())
                peekValley.add(current);
            else{
                int lastValue = peekValley.get(peekValley.size() -1);
                if(lastValue < 0 && current < 0)
                    peekValley.set(peekValley.size() -1, (lastValue+current));
                else if(lastValue > 0 && current > 0)
                    peekValley.set(peekValley.size() -1, (lastValue+current));
                else
                    peekValley.add(current);
            }
        }
        
        //System.out.print(peekValley);
        for(int i=0;i<peekValley.size() ; i++){
            if(peekValley.get(i) >0)
                maxProfit += peekValley.get(i);
        }
        return maxProfit; 
        
    }
}