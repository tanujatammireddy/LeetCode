class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int right = cardPoints.length-1;
        int score = 0;
        int len = cardPoints.length;
        
        int left_sum = 0;
        int right_sum = 0;
        
        for(int i=0;i < k;i++){
            left_sum += cardPoints[i];
        }
        score = left_sum;
        int j=k-1;
        for(int i=1;i <= k;i++){
             
            right_sum += cardPoints[len-i];
            left_sum -= cardPoints[j--];
           // System.out.println("left_sum"+left_sum+" right_sum"+right_sum + " total"+(right_sum+left_sum));
            score = Math.max(score,(left_sum+right_sum));
            
        }
        
        return score;
        
    }
}