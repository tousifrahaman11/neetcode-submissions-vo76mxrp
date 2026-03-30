class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int r = 0, l = m-1;

        while( r < n && l>= 0){
            if(matrix[r][l] > target){
                l--;
            } else if(matrix[r][l] < target){
                r++;
            } else{
                return true;
            }
        }
        return false;
    }
}
