public class PeakFinding {

    private static int findPeak(int [][] peakArray, int l, int r)
    {
       l = 0;
        r = -1;

        if(peakArray.length <= 0)
        {
            return 0;
        }

       if(r == -1)
       {
           r = peakArray[0].length;
       }

       int j = (l + r) / 2;
        int max = findMax(peakArray,j);


       if(j > 0 && peakArray[max][j - 1] > peakArray[max][j])
       {
           r = j;
           return findPeak(peakArray,l,r);
       }

       else if(j + 1 < peakArray[max].length && peakArray[max][j + 1]
               > peakArray[max][j])
       {
           l = j;
           return findPeak(peakArray,l,r);
       }

        return peakArray[max][j];
    }


  private static int findMax(int[][] peakArray, int col)
  {
      int max = 0;
      int index = 0;

      for (int i = 0; i < peakArray.length; i++)
      {
          if(max < peakArray[i][col])
          {
              max = peakArray[i][col];
              index = i;
          }
      }
      return index;
  }


    public static void main(String[] args) {

      int [][] peakArray = {
              {0,  0,  9,  0,  0,  0,  0},
         {0,  0,  0,  0,  0,  0,  0},
        {0,  1,  0,  0,  0,  8,  9},
         {0,  2,  0,  0,  0,  0,  0},
        {0,  3,  0,  0,  0,  0,  0},
         {0,  5,  0,  0,  0,  0,  0},
        {0,  4,  7,  0,  0,  0,  0}
    };

      int peak = PeakFinding.findPeak(peakArray,0,-1);

    System.out.println("The peak of the array is " + peak);


    }
}
