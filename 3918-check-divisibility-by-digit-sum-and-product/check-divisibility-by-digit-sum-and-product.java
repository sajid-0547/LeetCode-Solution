class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int mul = 1;
        int s;
        int ori=n;
        while(n>0){
            s = n%10;
            sum +=s;
            mul = mul*s;
            n = n/10;
        }

       int com = sum+mul;
        return (ori%com == 0);
    }
}