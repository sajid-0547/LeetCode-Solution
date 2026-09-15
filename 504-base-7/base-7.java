class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";

        boolean negative = num < 0;

        num = Math.abs(num);

        int sum = 0;
        int power = 0;

        while(num>0){
            int s = num%7;
            sum = sum + s*(int)Math.pow(10,power);
            num = num/7;
            power++;
        }

        String ans = Integer.toString(sum);

        if(negative){
            return "-"+ans;
        }


        return ans;
        
    }
}