class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (int[] a1, int[] a2) -> a2[1] -a1[1]);
        //System.out.println(Arrays.deepToString(boxTypes));
        int result = 0;
        int idx = 0;
        int boxes = 0;
        
        while(truckSize > 0 && idx < boxTypes.length){
            
            boxes = (truckSize-boxTypes[idx][0] >= 0)? boxTypes[idx][0] : truckSize;
            result += (boxes*boxTypes[idx][1]);
            truckSize = truckSize-boxes;
            idx++;
        }
        
        return result;
        
    }
}