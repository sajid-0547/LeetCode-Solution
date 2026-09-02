class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr1 = s.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);

       int i=0;
       while(i!=arr1.length){
        if(arr1[i] != arr2[i]){
            break;
        }
        i++;
       }
    return arr2[i];
    }
}