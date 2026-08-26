class Solution {
    public int reverse(int x) {
        int sign = x<0?-1:1;
        int num = Math.abs(x);
        long rev = 0;
        int s;
        while(num>0){
            s = num%10;
            rev = rev*10+s;
            num = num/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }

        return (int)rev*sign;

        
    }
}