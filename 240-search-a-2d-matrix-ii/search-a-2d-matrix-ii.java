class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = matrix[0].length-1;

        int i = 0;
        int j = col;

        while(i<=row && j>=0){
            if(matrix[i][j] == target) return true;

            else if(matrix[i][j]<target){
                i++;
            }
            else{
                j--;
            }
        }

        return false;
    }
}