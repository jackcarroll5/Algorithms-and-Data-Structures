public class MagicSquare {

private static boolean isMagicSquare(int[][] a)
 {
     int n = rowSum(a[0]);

     for (int[] row: a)
     {
         int sum = rowSum(row);

         if (sum != n)
             return false;
     }

//Sum of columns checked against n
     int sum = 0;

     for (int i = 0; i < a.length; i++)
     {
         sum = 0;

         for (int j = 0; j < a.length; j++)
         {
            sum += a[i][j];
         }

         if (sum != n)
             return false;
     }

     //Diagonal from top Left to Bottom Right corner
     sum = 0;

     for (int i = 0; i < a.length; i++)
     {
         sum += a[i][i];
     }

     if (sum != n)
         return false;

     //Diagonal from Top Right to Bottom Left corner
     sum = 0;

     for (int i = 0; i < a.length; i++)
     {
        sum += a[i][a.length - 1 - i];
     }

     if (sum != n)
         return false;

     //Returns sum of elements in row

     return true;
 }

 private static int rowSum(int[] row)
 {
     int sum = 0;

     for (int element : row)
         sum += element;

     return sum;
 }

    public static void main(String[] args)
    {
      int [][] square = {
              {16, 3, 2, 13},
              {5, 10, 11, 8},
              {9, 6, 7, 12},
              {4, 15, 14, 1},
      };//All sums return as 33

        int [][] squareFalse = {
                {3, 16, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1},
        };//Different Values



      System.out.println("\nThe magic square is " + MagicSquare.isMagicSquare(square));//Expected = True

        System.out.println("\nThe magic square is " + MagicSquare.isMagicSquare(squareFalse));//Expected = False

    }

}
