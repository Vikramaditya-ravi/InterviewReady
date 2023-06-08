class Solution {
    public boolean isPresentAlready(char[][] board,int r , int c){
        int temp = board[r][c];

        for (int i = 0; i < 9; i++) {
            if( i!=r && board[i][c] == temp ){
                return true;
            }
        }
        for (int i = 0; i < 9; i++) {
            if(i!= c && board[r][i] == temp){
                return true;

            }
        }

        int x = (r/3)*3;
        int y = (c/3)*3;

        for (int i = x; i < x+3; i++) {
            for (int j = y; j < y+3; j++) {

                if(i==r && j == c){
                    continue;
                }
                if (board[i][j] == temp  ){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if(board[i][j] != '.'){
                    if (isPresentAlready(board,i,j)){
                        return false;
                    }
                }

            }
        }
        return true;

    }
}