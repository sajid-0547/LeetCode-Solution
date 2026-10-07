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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> set = new ArrayList<>();

        while(temp != null){
            set.add(temp.val);
            temp = temp.next;
        }

        ListNode temp1 = head;
        while(temp1 !=  null){
            if((set.get(set.size() - 1)) != temp1.val) return false;
            set.remove(set.size()-1);
            temp1 = temp1.next;
        }

        return true;
        
        
    }
}