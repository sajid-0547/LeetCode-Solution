class Solution {
    public int maxProduct(int n) {
        int s,ans=0,d=0;

        while(n>0){
            s = n%10;
            if(s*d>ans){
            ans = s*d;
            }
            if(s>d){
                d = s;
            }

            n = n/10;

        }
        return ans;
        
    }
}