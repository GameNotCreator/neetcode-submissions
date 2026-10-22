class Solution {
    public boolean hasDuplicates(char[] board){
        HashMap<Character, Integer> count = new HashMap<>();
        for(Character b : board){
            if (b == '.') continue;
            count.put(b, count.getOrDefault(b, 0) + 1);
        }
        for(Integer i : count.values()){
            if (i > 1) return true; 
        }
        return false;
    }
    public boolean columnIsValid(char[][] board, int index){
        char[] out = new char[board.length];
        for(int i  = 0; i < board.length; i++){
            out[i] = board[i][index];
        }
        return !hasDuplicates(out);
    }
    public boolean squareIsValid(char[][] board, int index){
        int row = (index/3) *3;
        int col = (index % 3) *3;
        char[] out = new char[board.length];
        for(int i = 0; i < 9; i++){
            out[i] = board[row + i/3][col + i%3];
        }
        return !hasDuplicates(out);
    }
    public boolean isValidSudoku(char[][] board) {
        boolean out = true;
        for(int i = 0; i < 9; i++){
            out = out && !hasDuplicates(board[i]) 
                      && columnIsValid(board, i)
                      && squareIsValid(board, i);
        }
        return out;
    }  
}
