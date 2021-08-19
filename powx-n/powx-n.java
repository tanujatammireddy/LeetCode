class Solution {
    public double myPow(double x, int n) {
        
        return pow(x,(long)n);
    }
    public double pow(double x, long n){
        if(n==0) return 1;
        if(n<0)  return pow(1/x,-1*n);
        if(n==1) return x;
        if(n>1)
        {
            double half = pow(x,n/2); 
            if(n%2==0)
                return half*half;
            else
                return half*half*x;
        }
        return 1;
    }
}