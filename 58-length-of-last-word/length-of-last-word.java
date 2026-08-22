class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int n = str.lastIndexOf(" ");
        int count = 0;
        while(n != str.length()-1){
            n++;
            count++;
        }
        return count;
        
    }
}