class Solution {
    public int lengthOfLongestSubstring(String s) {
        char c[] = s.toCharArray();
        int i = 0;
        int n = s.length();

        if(n == 0) return 0;
        if(n == 1) return 1;

        int j = 1;
        int count = 1;
        int ans = 1;

        while(i < n){

            if(j == n){
                if(count > ans) ans = count;

                i++;
                j = i + 1;
                count = 1;
            }
            else {
                boolean duplicate = false;

                for(int k = i; k < j; k++){
                    if(c[k] == c[j]){
                        duplicate = true;
                        break;
                    }
                }

                if(duplicate){
                    if(count > ans) ans = count;

                    i++;
                    j = i + 1;
                    count = 1;
                }
                else {
                    count++;
                    j++;
                }
            }
        }

        return ans;
    }
}