class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> row = new HashMap<>();
        Map<String, Set<Character>> sq = new HashMap<>();

        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){

                if(board[r][c] == '.') continue;

                String s1 = (r/3) + "." + (c/3);

                if (row.computeIfAbsent(r, k -> new HashSet<>()).contains(board[r][c]) ||
                    cols.computeIfAbsent(c, k -> new HashSet<>()).contains(board[r][c]) ||
                    sq.computeIfAbsent(s1, k -> new HashSet<>()).contains(board[r][c])) {

                    return false;
                }

                row.get(r).add(board[r][c]);
                cols.get(c).add(board[r][c]);
                sq.get(s1).add(board[r][c]);
            }
        }

        return true;   // ✅ FIXED
    }
}
