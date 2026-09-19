/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        BigInteger store1 = BigInteger.ZERO;
        int size1 = 0;
        int zero1 = 0;

        while(temp1 != null){

            if(store1.equals(BigInteger.ZERO) && temp1.val == 0){
                zero1++;
            }

            store1 = store1.multiply(BigInteger.TEN)
                           .add(BigInteger.valueOf(temp1.val));

            temp1 = temp1.next;
            size1++;
        }

        ListNode temp2 = l2;
        BigInteger store2 = BigInteger.ZERO;
        int size2 = 0;
        int zero2 = 0;

        while(temp2 != null){

            if(store2.equals(BigInteger.ZERO) && temp2.val == 0){
                zero2++;
            }

            store2 = store2.multiply(BigInteger.TEN)
                           .add(BigInteger.valueOf(temp2.val));

            temp2 = temp2.next;
            size2++;
        }

        BigInteger sum1 = BigInteger.ZERO;

        while(store1.compareTo(BigInteger.ZERO) > 0){

            BigInteger a = store1.mod(BigInteger.TEN);

            sum1 = sum1.multiply(BigInteger.TEN).add(a);

            store1 = store1.divide(BigInteger.TEN);
        }

        BigInteger sum2 = BigInteger.ZERO;

        while(store2.compareTo(BigInteger.ZERO) > 0){

            BigInteger a = store2.mod(BigInteger.TEN);

            sum2 = sum2.multiply(BigInteger.TEN).add(a);

            store2 = store2.divide(BigInteger.TEN);
        }

        while(zero1 > 0){
            sum1 = sum1.multiply(BigInteger.TEN);
            zero1--;
        }

        while(zero2 > 0){
            sum2 = sum2.multiply(BigInteger.TEN);
            zero2--;
        }

        BigInteger sum = sum1.add(sum2);

        String arr = sum.toString();

        ListNode ans;

        if(size1 >= size2){
            ans = l1;
        }else{
            ans = l2;
        }

        ListNode result = ans;

        int i = arr.length() - 1;

        while(i >= 0){

            ans.val = arr.charAt(i) - '0';

            if(i > 0){

                if(ans.next == null){
                    ans.next = new ListNode();
                }

                ans = ans.next;
            }

            i--;
        }

        return result;
    }
}