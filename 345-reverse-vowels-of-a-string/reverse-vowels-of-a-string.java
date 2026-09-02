class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] arr = s.toCharArray();

        while(i<j){
            char ch1 = arr[i];
            char ch2 = arr[j];
            if((ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u' || ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U') && (ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u' || ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U')){
                char temp = ch1;
                arr[i] = ch2;
                arr[j] = temp;
                i++;
                j--;

            }else if(!(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u' || ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U') && (ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u' || ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U')){
                i++;

            }else if((ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u' || ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U') && !(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u' || ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U')){
                j--;
            }else{
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}