public class SudokuSolver {

    public boolean helper(char[][] board, int row, int col)
    {
        int newr = 0;
        int newc = 0;
        if(col != board.length-1)
        {
            newr = row;
            newc = col + 1;

        }

        else {
            newr = row + 1;
            newc = 0;
        }

        if(board[row][col] != '.')
        {
           if( helper(board, newr, newc))
           {
              return  true;
           }
        }

        else {
            for(int i = 1; i<=9; i++)
            {
                if(isSafe(board, row, col, i))
                {
                    board[row][col] = (char)(i + '0');
                }
            }
        }
    }
    
    public void solveSudoku(char[][] board)
    {
       helper(board, 0, 0);
    }
    
    public static void main(String[] args) {
        
    }
}
