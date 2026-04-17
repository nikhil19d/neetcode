class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> ro = new HashMap<>();
        HashMap<Integer, HashSet<Character>> co = new HashMap<>();
        HashMap<String, HashSet<Character>> s = new HashMap<>();
        for(int r = 0; r < 9; r++){
            for(int c = 0; c <9; c++){
            if(board[r][c] == '.') continue;
                String key = (r/3) + "," + (c/3);
                if(ro.computeIfAbsent(r, k -> new HashSet<>()).contains(board[r][c]) ||
                co.computeIfAbsent(c, k -> new HashSet<>()).contains(board[r][c]) ||
                s.computeIfAbsent(key, k -> new HashSet<>()).contains(board[r][c])
                ) return false;
                ro.get(r).add(board[r][c]);
                co.get(c).add(board[r][c]);
                s.get(key).add(board[r][c]);
            }
        }
        return true;
    }
}
