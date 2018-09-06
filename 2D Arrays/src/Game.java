public class Game {

    private int size;
    private int[][] grid;

    private Game(int s)
    {
        size = s;
        grid = new int[size][size];

        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {
                grid[row][col] = 0;
            }
        }
    }

    public void set(int value, int row, int col)
    {   // store value at the specified row and column
       grid[row][col] = value;
    }

    public int get(int row, int col)
    {
     return grid[row][col];
    }

        private void writeGrid()
        {
            System.out.println("                          Total");
            // display the grid
            // Print countries, counts, and row totals
            for (int i = 0; i < size; i++)
            {
                // Process the ith row
                // System.out.printf("%15s", countries[i]);
                int total = 0;

                // Print each row element and update the row total
                for (int j = 0; j < size; j++)
                {
                    System.out.printf("%7d", grid[i][j]);
                    total += grid[i][j];
                }
                // Display the row total and print a new lineg
                System.out.printf("%8d\n", total);
            }
        }

    //Switch display from rows to columns. Numbers displayed in ascending order
    //from rows in vertical direction instead of showing ascending order of numbers in row form,
    //where the numbers are shown in a horizontal direction and the array is traversed by column first
    // before accessing the row.
    //Traverse 2d array by rows first before accessing particular column.
    private void noName()
    {
        int [][] newGrid = new int[size][size];

        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {
                newGrid[col][row] = grid[row][col];
            }
        }
        grid = newGrid;
    }

    private boolean isLastRowFull()
        {     // determine if the last row is full;
             for (int x = 0; x < size; x++)
             {
                 for (int y = 0; y < size; y++)
                 {
                  if (grid[x][y] == 0)
                      return false;
                 }
             }
           return true;
        }

    private int sum(){ /*Add*/
        //compute total medals for all countries and all medal types
        //Total all the medals
        int totalNum = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                totalNum += grid[i][j];
            }
        }
        System.out.println("\n\nTotal Number in matrix : "+ totalNum);

        return totalNum;
    }


    public static void main(String[] args) {

        Game game = new Game(3);

        game.set(1,0,0);
        game.set(2,0,1);
        game.set(3,0,2);
        game.set(4,1,0);
        game.set(5,1,1);
        game.set(6,1,2);
        game.set(7,2,0);
        game.set(8,2,1);
        game.set(9,2,2);

        game.writeGrid();

        System.out.println("\nThe selected element in the matrix is " + game.get(0,1));

        game.sum();

        System.out.println();
        game.noName();

        game.writeGrid();

        System.out.println("\nThe last row full is " + game.isLastRowFull());

        System.out.println();

        Game g = new Game(3);

        g.set(1,0,0);
        g.set(2,0,1);
        g.set(3,0,2);
        g.set(4,1,0);
        g.set(5,1,1);
        g.set(6,1,2);
        g.set(7,2,0);
        g.set(8,2,1);

        g.writeGrid();

        g.sum();

        System.out.println("\nThe last row full is " + g.isLastRowFull());
    }
}
