import java.util.Arrays;

public class MyArrays {

    public static double median(int[] a)
    {
        double median;

        Arrays.sort(a);

       int m = a.length / 2;

        if(a.length % 2 == 0)
        {
            median = (a[m - 1] + a[m]) / 2.0;
        }
        else
            median = a[m];

        return median;
    }

    public static int countMatches(int[] a1, int[] a2)
    {
        Arrays.sort(a1);
        Arrays.sort(a2);

        int r1 = a1.length - 1;
        int r2 = a2.length - 1;

        int i = 0;
        int j = 0;
        int count = 0;

        while (i <= r1 && j <= r2)
        {
            if(a1[i] == a2[j])
            {
                //a3[k] = a1[i];
                i++;
                j++;
                count++;
            }

            else if(a1[i] > a2[j]){
                //a3[k] = a2[j];
                j++;
            }

            else//a1[i] < a2[j]
                i++;
        }
        return count;
    }
}