public class TicTacToe {
    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;

    /**
     Constructs an empty board.
     */
    public TicTacToe()
    {
        board = new String[ROWS][COLUMNS];
        // Fill with spaces
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = " ";
    }

    /**
     Sets a field in the board. The field must be unoccupied.
     @param i the row index
     @param j the column index
     @param player the player ("x" or "o")
     */
    public void set(int i, int j, String player)
    {
        if (board[i][j].equals(" "))
            board[i][j] = player;
    }

    public String getWinner()
    {
        for (int x = 0; x < 3; x++)
        {
            //Rows
            if ((board[x][1].equals(board[x][0])) && (board[x][1].equals(board[x][2])))
                return board[x][1];
        }

        for (int y = 0; y < 3; y++)
        {
            //Columns
            if ((board[1][y].equals(board[0][y])) && (board[1][y].equals(board[2][y])))
                return board[1][y];
        }

        //Diagonal
        if((board[1][1].equals(board[0][0])) && (board[1][1].equals(board[2][2])) ||
                (board[1][1].equals(board[0][2])) && (board[1][1].equals(board[2][0])))
        {
            return (board[1][1]);
        }
        return "";
    }

    /**
     Creates a string representation of the board, such as
     |x  o|
     |  x |
     |   o|
     @return the string representation
     */
    public String toString()
    {
        String r = "";
        for (int i = 0; i < ROWS; i++)
        {
            r += "|";

            for (int j = 0; j < COLUMNS; j++)
                r += board[i][j];

            r += "|\n";
        }
        return r;
    }
}
