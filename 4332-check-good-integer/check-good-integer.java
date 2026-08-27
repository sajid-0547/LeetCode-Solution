class Solution {
    public boolean checkGoodInteger(int n) {
        int s,digitSum=0,squareSum=0;
        while(n>0){
            s = n%10;
            digitSum += s;
            squareSum += s*s;
            n = n/10;
        }

        if(squareSum - digitSum >= 50) return true;

    return false;
        
    }
}