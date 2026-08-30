class Solution {
    public int myAtoi(String s) {
                
        String str = s.trim();
        if(str.length()==0) return 0;

        char store = '+';
        int i = 0;
        if(str.charAt(i) == '-'){
            store = '-';
            i++;
        }else if(str.charAt(i) == '+'){
            store = '+';
            i++;
        }
        int ans = 0;
        
        for(int j=i;j<str.length();j++){
            char ch = str.charAt(j);
            if(ch>='0' && ch<='9'){
                int digit = ch - '0';
                if(ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && digit>7)){
                    return store=='-'?Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                ans = ans*10+digit;
        }else{
            break;
             }
        }
        if(store == '-'){
            ans = -ans;
        }

        return ans;
        

    }
}