class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        int maxUnits = 0;
        Arrays.sort(boxTypes, (int[] a1, int[] a2) -> a2[1] -a1[1]);
        
        for(int[]boxType:boxTypes){
            
            int numberOfBoxes = 0;
            numberOfBoxes = (truckSize - boxType[0] >=0 )?  boxType[0] : truckSize;
            truckSize = truckSize-numberOfBoxes;
            int units = numberOfBoxes*boxType[1];
            maxUnits += units;
            
            if(truckSize ==0) break;   
        }
            
        
        return maxUnits;
        
    }
}