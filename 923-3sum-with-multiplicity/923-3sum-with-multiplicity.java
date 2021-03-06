class Solution {
    public int threeSumMulti(int[] arr, int target) {
        
        int mod = 1000000007;
        long count = 0;
        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++){
            
            int j = i+1;
            int k = arr.length -1;
            
            int sum = target - arr[i];
            while(j< k){
                
                if(arr[j] + arr[k] < sum)
                    j++;
                else if(arr[j] + arr[k] > sum)
                    k--;
                else if(arr[j] != arr[k]){
                    
                    int left = 1;
                    int right = 1;
                    
                    while(j+1<k && arr[j] == arr[j+1]){
                        left++;
                        j++;
                    }
                    while( k-1 > j && arr[k-1] == arr[k]){
                        right++;
                        k--;
                    }
                    
                    count += (left*right);
                    count %= mod;
                    j++;
                    k--;
                    
                }
                else{
                    count += (k-j+1)*(k-j)/2;
                    count %= mod;
                    break;
                }
                
                
                
            }
        }
        
        return (int)count;
        
    }
}