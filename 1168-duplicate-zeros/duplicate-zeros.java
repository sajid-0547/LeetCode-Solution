class Solution {
    public void duplicateZeros(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                st.push(arr[i]);
                st.push(0);
            }else{
                st.push(arr[i]);
            }
        }


        int n = arr.length;
        int rem = st.size()-n;

        while(rem != 0){
            st.pop();
            rem --;
        }

        int a = n-1;

        while(a != 0){
            arr[a] = st.peek();
            st.pop();
            a--;
        }

        
       
    }
}