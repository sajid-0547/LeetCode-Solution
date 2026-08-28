class Solution {
    public int largestInteger(int n, int s) {
        if((9*n<s)) return -1;

        int ans = 0;
        for(int i=0;i<n;i++){
            int digit = Math.min(9,s);

            ans = 10*ans+digit;
            s = s - digit;
        }

        return ans;
        
    }
}