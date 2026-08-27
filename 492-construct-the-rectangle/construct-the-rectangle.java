class Solution {
    public int[] constructRectangle(int area) {
        int[] save = new int[2];
        for(int i=1;i<=Math.sqrt(area);i++){
            if(area%i == 0){
                save[0] = area/i;
                save[1] = i; 
            }
        }

        return save;
        
    }
}