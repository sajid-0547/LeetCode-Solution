class Solution {
    public boolean isPowerOfTwo(int n) {
        double result = 0;
        for(int i=0;i<31;i++){
            result = Math.pow(2,i);
            if(result == n) return true;
        }
        return false;
    }
}