class Solution {
    public int check(int n){
        if(n < 7) return n;
        int x,sum=0;
        while(n>0){
            x = n%10;
            sum = sum + x*x;
            n = n /10;
        }
        return check(sum);
    }
    public boolean isHappy(int n) {
        if(check(n) == 1){
            return true;
        }

        return false;
        
    }
}