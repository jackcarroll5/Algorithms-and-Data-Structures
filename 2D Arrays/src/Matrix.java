import java.util.Arrays;

public class Matrix {
    private int rows;
    private int columns;
    private double [][] grid;

    public Matrix(int r, int c){
        rows = r;
        columns = c;
        grid = new double[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++)
            {
                grid[row][col] = 0.0;
            }
        }
    }

    // sets the value of the element in column c of
    // row r to d
    public void set(int r, int c, double d){
        grid[r][c] = d;
    }

    private double get(int r, int c){
        // returns the value of the element in column c of//row r
        /*if (r >= c)
            return grid[r][c];
        else
            return grid[r][c];*/
        return grid[r][c];
    }


    private void fill(double d)
    {
        // sets all elements of matrix to d
       for (double[] row: grid)
       Arrays.fill(row,d);
    }

    public void display()
    {
        System.out.println("\n\nMatrix");
        // output the grid
        for (int i = 0; i < rows; i++)
        {
            // Print each row element and update the row total
            for (int j = 0; j < columns; j++)
            {
                System.out.print(grid[i][j] + " ");
            }
            // Display the row total and print a new lineg
        }
        System.out.println();
    }

    private Matrix add(Matrix m)
    {
        //returns the matrix addition of this matrix and
        // matrix m
        // Two matrices are added by adding the
        // corresponding elements of each matrix
        // both matrices must have the same dimensions –
        // you may assume this

        Matrix ans = new Matrix(this.rows,this.columns);

        int i;
        int j;

            for (i = 0; i < rows; i++)
            {
                for (j = 0; j < columns; j++)
                {
                    ans.grid[i][j] = this.grid[i][j] + m.grid[i][j];
                }
            }
        return ans;
    }

    private Matrix subtract(Matrix m){
        // returns the matrix result of subtracting matrix
        //m from this matrix
        // the elements of m are subtracted from the
        //corresponding elements of this matrix
        // Both matrices must have same dimensions – you may
       // assume this.
        Matrix ans = new Matrix(this.rows,this.columns);

        int i;
        int j;

          for (i = 0; i < rows; i++)
          {
            for (j = 0; j < columns; j++)
            {
               ans.grid[i][j] = this.grid[i][j] - m.grid[i][j];
            }
         }
       return ans;
    }

    public static void main(String[] args) {

     Matrix matrix = new Matrix(3,3);//9
        Matrix ma = new Matrix(2,2);//4

        matrix.set(0,0,3.5);
     matrix.set(0,1,5);
     matrix.set(0,2,3.7);
     matrix.set(1,0,4.4);

        System.out.println("\nThe chosen number in the matrix is " + matrix.get(0,0));//Expected = 3.5

        System.out.println();
       matrix.display();

     ma.fill(2);
     ma.display();

        Matrix mat1 = new Matrix(3,3);
        mat1.set(0,0,2.5);

        mat1.display();

        Matrix mat2 = matrix.add(mat1);
        System.out.println();

        mat2.display();

        mat2 = matrix.subtract(mat1);
        System.out.println();

        mat2.display();
    }
}
