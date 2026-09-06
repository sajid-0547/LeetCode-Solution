class Solution {
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int len1 = num1.length();
        int len2 = num2.length();
        int[] ans = new int[len1+len2];
        for(int i=0;i<ans.length;i++){
            ans[i] = 0;
        }



        for(int i=num1.length()-1;i>=0;i--){
            int a=num1.charAt(i)-'0';
            for(int j=num2.length()-1;j>=0;j--){
                int b = num2.charAt(j)-'0';
                int c = ans[i+j+1]+a*b;
                ans[i+j+1] = c%10;
                ans[i+j] += c/10;
            }
        }
        String str = "";
        for(int i=0;i<ans.length;i++){
            if(i==0 && ans[i]==0) continue;

            str = str+ans[i];
        }

        return str;

    }
}