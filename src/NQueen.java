
import java.util.ArrayList;
import java.util.List;

public class NQueen {

    public void helper(char [][] board,  List<List<String>> allBoards, int col)
    {

       if()

        for(int row = 0; row<board.length; row++)
        {
            if(isSafe(row, col, board))
            {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }
    
    public List<List<String>> solveNQueen(int n)
    {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);


    }
    
    public static void main(String[] args) {
        
    }
}
