class Solution {
    public int totalFruit(int[] fruits) {
        
        int len = fruits.length;
        int left = 0;
        int right = 0;
        int count = 0;
        int totalFruit = 0;
        HashMap<Integer,Integer> map = new HashMap();
                
        while(right < len){
                
            while(map.size() <= 2 && right < len){
                map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);
                count++;
                right++;
            }
            if(map.size() > 2){
            totalFruit = Math.max(totalFruit,count-1);  
            //System.out.println(map);
            while(map.size() > 2){
                    
                int size = map.get(fruits[left]);
                size--;
                if(size > 0)
                    map.put(fruits[left],size);  
                else
                    map.remove(fruits[left]);
                    
                left++;
                count--;
            }
            }
            totalFruit = Math.max(totalFruit,count); 
            /*System.out.println(map);
            System.out.println(count);*/
              
        }
            
        
        return totalFruit;
        
    }
}