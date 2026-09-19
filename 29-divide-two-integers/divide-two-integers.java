class Solution {
    public int divide(int dividend, int divisor) {

        int sign1=1,sign2=1;
        if(dividend<0){
            sign1 = -1;
        }
        if(divisor<0){
            sign2=-1;
        }

        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(dividend == Integer.MAX_VALUE && divisor == -1) return -2147483647;
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);

        int c = 0;
        while(a>=b){
            a = a-b;
            c++;
        }
        if(sign1 != sign2){
            c = -c;
        }

        return c;

        
    }
}