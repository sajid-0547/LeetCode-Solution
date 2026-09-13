class Solution {
    public int nextGreaterElement(int n) {
        if(n <= 11) return -1;

        StringBuilder s = new StringBuilder(String.valueOf(n));
        int x = s.length();

        int p = -1;

        for(int i = x - 2; i >= 0; i--) {
            if(s.charAt(i) < s.charAt(i + 1)) {
                p = i;
                break;
            }
        }

        if(p == -1) return -1;

        int k = -1;

        for(int i = x - 1; i > p; i--) {
            if(s.charAt(p) < s.charAt(i)) {
                k = i;
                break;
            }
        }

        char ch = s.charAt(p);
        s.setCharAt(p, s.charAt(k));
        s.setCharAt(k, ch);

        int st = p + 1;
        int e = x - 1;

        while(st < e) {
            char temp = s.charAt(st);
            s.setCharAt(st, s.charAt(e));
            s.setCharAt(e, temp);

            st++;
            e--;
        }

        long ans = Long.parseLong(s.toString());

        if(ans > Integer.MAX_VALUE) return -1;

        return (int)ans;
    }
}