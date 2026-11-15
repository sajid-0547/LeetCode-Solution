class Solution {
    boolean isPali(int n){
        int i = n;
        int rev = 0;

        while(i>0){
            int s = i%10;
            rev = rev*10+s;
            i = i/10;
        }

        if(rev == n) return true;

        return false;
    }

    boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }

        return true;
    }
    public int primePalindrome(int n) {
        if(n <= 2) return 2;
        if(n <= 3) return 3;
        if(n <= 5) return 5;
        if(n <= 7) return 7;
        if(n <= 11) return 11;

        while(true) {

            // Skip even-length numbers
            int len = String.valueOf(n).length();

            if(len % 2 == 0) {
                n = (int)Math.pow(10, len);
                continue;
            }

            if(isPali(n) && isPrime(n)) {
                return n;
            }

            n++;
        }
    }
}