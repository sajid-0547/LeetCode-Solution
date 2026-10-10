class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix[0].length;
        int n=matrix.length;
        ArrayList<Integer> list = new ArrayList<>();

        int top = 0;
        int left = 0;
        int right = m-1;
        int bottom = n-1;


        while(list.size() < m*n){

            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            if(top>bottom) break;

            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;

            if(left>right) break;

            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;

            if(top>bottom) break;
            
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
        }
        
        return list;
    }
}