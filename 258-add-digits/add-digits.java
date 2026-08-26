class Solution {
    public int check(int num){
        while(num<10) return num;
        int s,sum=0;
        while(num>0){
            s = num%10;
            sum = sum + s;
            num = num/10;
        }

        return check(sum);

    }
    public int addDigits(int num) {
       return check(num);
    }
}