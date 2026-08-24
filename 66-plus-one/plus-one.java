import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {

        BigInteger sum = BigInteger.ZERO;
        int i = 0;

        while (i != digits.length) {
            sum = sum.multiply(BigInteger.TEN)
                     .add(BigInteger.valueOf(digits[i]));
            i++;
        }

        sum = sum.add(BigInteger.ONE);

        String str = sum.toString();

        int[] arr = new int[str.length()];

        i = 0;
        while (i < str.length()) {
            arr[i] = str.charAt(i) - '0';
            i++;
        }

        return arr;
    }
}