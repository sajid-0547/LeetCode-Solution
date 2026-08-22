class Solution {
    public boolean canBeEqual(String s1, String s2) {
       
       if(s1.equals(s2)) return true;

       char arr[] = s1.toCharArray();

       char temp = arr[0];
       arr[0] = arr[2];
       arr[2] = temp;

       if(String.valueOf(arr).equals(s2)) return true;

       temp = arr[1];
       arr[1] = arr[3];
       arr[3] = temp;
       if(String.valueOf(arr).equals(s2)) return true;

       char arr1[] = s1.toCharArray();
       temp = arr1[1];
       arr1[1] = arr1[3];
       arr1[3] = temp;
       if(String.valueOf(arr1).equals(s2)) return true;

    return false;

    }
}