public class Checkerboard {

    public static void main(String[] args) {

        final int ROWS = 6;
        final int COLS = 6;

        int[][] counts = new int[ROWS][COLS];

        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLS; j++)
            {
                counts[i][j] = (i + j) % 2;
                System.out.printf("%2d",counts[i][j]);
            }
            System.out.println("\n");
        }

        System.out.println("\n");

        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLS; j++)
            {
                counts[i][j] = (i + j) % 2;
                System.out.printf("%2d",counts[i][j]);
            }
            System.out.println("\n");
        }

    }
}
