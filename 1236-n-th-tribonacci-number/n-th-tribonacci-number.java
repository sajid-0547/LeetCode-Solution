class Solution {
    public int tribonacci(int n) {
        
        if(n == 1) return 1;
        if(n == 2) return 1;

        int a = 0;
        int b = 1;
        int c = 1;
        int ans = 0;

        for(int i=0;i<n-2;i++){
            ans = a+b+c;
            a=b;
            b=c;
            c=ans;
        }

        return ans;
    }
}