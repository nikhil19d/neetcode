class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> row = new HashMap<>();
        HashMap<Integer, HashSet<Character>> col = new HashMap<>();
        HashMap<String, HashSet<Character>> squ = new HashMap<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                String key = (i/3) + "," + (j/3);
                if(row.computeIfAbsent(i,k -> new HashSet<>()).contains(board[i][j]) ||
                   col.computeIfAbsent(j,k -> new HashSet<>()).contains(board[i][j]) ||
                   squ.computeIfAbsent(key,k -> new HashSet<>()).contains(board[i][j])) return false;
                row.get(i).add(board[i][j]);
                col.get(j).add(board[i][j]);
                squ.get(key).add(board[i][j]);
            }
        }
        return true;
    }
}
