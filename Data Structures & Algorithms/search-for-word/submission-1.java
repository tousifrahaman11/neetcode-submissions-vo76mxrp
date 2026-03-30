class Solution {
    private int r, c;
    public boolean exist(char[][] board, String word) {
        r = board.length;
        c = board[0].length;

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(dfs(board, word, i, j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, String word, int i, int j, int k){
        if( k == word.length()){
            return true;
        }
        if(i < 0 || j < 0 || i >= r || j >= c || board[i][j] != word.charAt(k) ){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';
        boolean res = dfs(board, word, i+1, j, k+1) || dfs(board, word, i-1, j, k+1) || dfs(board, word, i, j+1, k+1) || dfs(board, word, i, j-1, k+1);
        board[i][j] = temp;
        return res;
    }
}
