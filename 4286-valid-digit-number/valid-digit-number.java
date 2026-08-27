class Solution {
    public boolean validDigit(int n, int x) {
        if(n<10) return false;
        

        HashMap<Integer,Integer> map = new HashMap<>();
        int num = n;
        while(n>=10){
            n = n/10;
        }
        if(n == x){
            return false;
        }else{
            while(num>0){
                int s = num%10;
                map.put(s,map.getOrDefault(s,0)+1);
                num = num/10;
            }
            if(map.containsKey(x)){
                return true;
            }
        }

        return false;
    }
}