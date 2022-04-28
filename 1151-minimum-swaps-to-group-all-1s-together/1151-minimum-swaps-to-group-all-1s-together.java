class Solution {
public int minSwaps(int[] data) {

    int len = data.length;
    int totalOnes = 0;
    for(int num:data){
        if(num == 1)
            totalOnes++;
        }

    if(totalOnes == 1) return 0;

    int left = 0;
    int right = 0;
    int zerosCount = 0;
    int minZeros = Integer.MAX_VALUE ;

    while(right < totalOnes){
        if(data[right] == 0)
            zerosCount++;
        right++;  
    }

    minZeros = Math.min(minZeros,zerosCount); 

    while(right < len){

        if(data[left] == 0)
            zerosCount--;
        if(data[right] == 0)
            zerosCount++;
        left++;
        right++;
        
        minZeros = Math.min(minZeros,zerosCount);   
        }

    return minZeros;

}
}