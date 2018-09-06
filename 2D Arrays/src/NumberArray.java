public class NumberArray {

    private static int[][] counts;

    private final int ROWS = 3;
    private final int COLUMNS = 3;


    private NumberArray()
    {
        counts = new int[ROWS][COLUMNS];
    }

    private void set(int row, int column, int count) {
        // store count at the specified position in the grid
        counts[row][column] = count;
    }

    private void get(int [][] counts)
    {
        System.out.println("The numbers in the array are: ");
        for (int [] row: counts)
        {
            for (int x: row)
            {
                System.out.print(x + " ");
            }
        }
    }

    private void display()
    {
        System.out.println("                          Total");

        // Print countries, counts, and row totals
        for (int i = 0; i < ROWS; i++)
        {
            // Process the ith row
            int total = 0;

            // Print each row element and update the row total
            for (int j = 0; j < COLUMNS; j++)
            {
                System.out.printf("%7d", counts[i][j]);
                total = total + counts[i][j];
            }

            // Display the row total and print a new lineg
            System.out.printf("%8d\n", total);
        }
    }

    private int sum(){ /*Add*/
        //compute total medals for all countries and all medal types
        //Total all the medals
        int totalNums = 0;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                totalNums += counts[i][j];
            }
        }
        System.out.println("\n\nTotal Number: "+ totalNums);

        System.out.println();

        return totalNums;
    }

    /*Main Method*/
    public static void main(String[] args) {

        NumberArray arrayNum = new NumberArray();

        arrayNum.set(0,0,1);
        arrayNum.set(0,1,2);
        arrayNum.set(0,2,3);

        arrayNum.set(1,0,4);
        arrayNum.set(1,1,5);
        arrayNum.set(1,2,6);

        arrayNum.set(2,0,7);
        arrayNum.set(2,1,8);
        arrayNum.set(2,2,9);

        arrayNum.display();

        arrayNum.sum();

         arrayNum.get(counts);
    }
}
