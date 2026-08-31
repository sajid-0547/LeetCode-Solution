class Solution {
    public double myPow(double x, int n) {
        if(x==0) return 0;
        if(x==1 || n==0) return 1;
        double sign = 1;
        if(x<0 && n%2!=0){
            sign = -1;
        }
        x = Math.abs(x);
        double ans = Math.pow(x,n);
       

       return sign*ans;        
    }
}