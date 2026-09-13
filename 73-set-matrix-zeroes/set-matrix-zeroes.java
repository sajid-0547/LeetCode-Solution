class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> colm = new HashSet<>();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    colm.add(j);
                }
            }
        }

        for(Integer r:rows){
            for(int i=0;i<col;i++){
                matrix[r][i]=0;
            }
        }

        for(Integer c:colm){
            for(int j=0;j<row;j++){
                matrix[j][c]=0;
            }
        }
        
    }
}