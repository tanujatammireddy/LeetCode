class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        
        int max= 0;
        //Degree of a city
        if(roads.length > 0){
        Map<Integer,Integer> map = new HashMap();
        Set<Pair<Integer,Integer>> set = new HashSet();
        for(int[] road: roads){
            map.put(road[0], map.getOrDefault(road[0],0)+1);
            map.put(road[1], map.getOrDefault(road[1],0)+1);
            set.add(new Pair(road[0],road[1]));
        }
        /*System.out.print(map);
        System.out.print(set);*/
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                int count = map.getOrDefault(i,0)+map.getOrDefault(j,0);
                if(count > 0){
                if(set.contains(new Pair(i,j)) ||set.contains(new Pair(j,i)) )
                    count--;
                max = Math.max(count,max);
                }
            }
        }
        }
        return max;
    }
}