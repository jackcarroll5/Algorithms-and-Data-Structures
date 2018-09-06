public class PeakFindingAlt {

   private static int intmidCol;

private static int [] findMax(int[][] peak, int rows, int columns)
{
    if(columns == 1)
    {
        int row = findPeak(peak,rows,1);
        return new int[]{row, 0};
    }
    else
    {
        intmidCol = columns / 2;
        return findPeakDef(peak, rows, columns, intmidCol);
    }
}

private static int [] findPeakDef(int[][] peak, int rows, int columns, int mid)
{
    int row = findPeak(peak,rows,mid);

    if ((mid == 0 && peak[row][mid] >= peak[row][mid + 1])
            || (mid == columns - 1 && peak[row][mid] >= peak[row][mid - 1])
            || (peak[row][mid] >= peak[row][mid - 1] && peak[row][mid] >= peak[row][mid + 1]))
    {
      return new int[]{row, mid};
    }

    else if(peak[row][mid] < peak[row][mid - 1])
    {
        intmidCol = intmidCol / 2;
        return findPeakDef(peak, rows, columns, mid - intmidCol);
    }

    else
        intmidCol = intmidCol / 2;
        return findPeakDef(peak, rows, columns, mid + intmidCol);
}

private static int findPeak(int[][] peak, int rows, int mid)
{
    int row = 0;
    int max = peak[0][mid];

   for (int i = 0; i < rows; i++)
    {
       if(peak[i][mid] > max)
         max = peak[i][mid];
         row = i;
    }
    return row;
}

    public static void main(String[] args)
    {
        int [][] peak = {
                {10, 8, 10, 10},
            {14, 13, 12, 11},
            {15, 9, 11, 21},
            {16, 17, 19, 2}
        };

       int [] p = findMax(peak, peak.length, peak[0].length);

        System.out.println("The peak in this array is: " + peak[p[0]][p[1]]);//Expected Peak = 19
    }
}
