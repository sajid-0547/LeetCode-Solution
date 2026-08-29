class Solution {
    public int reverseBits(int n) {
        char[] binary = String.format("%32s",Integer.toBinaryString(n)).replace(' ','0').toCharArray();
        int i=0,j=31;
        while(i<j){
            char ch = binary[i];
            binary[i] = binary[j];
            binary[j] = ch;
            i++;
            j--;
        }
        String str = new String(binary);
        int ans = Integer.parseInt(str,2);
        return (int)ans;

    }
}