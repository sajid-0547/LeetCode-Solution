class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;

        return (s+s).contains(goal);

        // int i=0;
        // while(i < s.length()){
        //     goal = goal.charAt(goal.length()-1)+goal.substring(0,goal.length()-1);
        //     if(goal.equals(s)) return true;
        //     i++;
        // }


        // return false;
        
    }
}