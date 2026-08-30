class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        int start=0;
        int end=str.length-1;
        while(start<end){
            String temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }

        String ans = "";
        for(int i=0;i<str.length;i++){
            ans = ans + str[i];
            if(i != str.length-1){
                ans = ans + " ";
            }
        }
     return ans;   
    }
}