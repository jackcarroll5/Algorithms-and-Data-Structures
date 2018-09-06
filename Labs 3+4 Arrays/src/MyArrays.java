import java.util.Arrays;

public class MyArrays {

    public static int linearSearch(int[] a, int currentSize, int searchKey)//Done
    {
        boolean found = false;
        int index = 0;

        while (!found && index < currentSize)
        {
            if(a[index] == searchKey)
                found = true;
            else
                index++;
        }

        if (found) {
            return index;
        }
        else
            return -1;
    }

    public static int simpleLinearSearch(int[] a, int currentSize, int searchKey)//Done
    {
       for(int i = 0; i < currentSize; i++)
       {
           if(searchKey == a[i])
           {
               return i;
           }
           else if(a[i] > searchKey)//searchKey < a[i]
               //Improved
               return -1;
       }
        return -1;
    }


    public static int[] merge(int[] a1, int l1, int r1, int[] a2, int l2, int r2) //r1 = start of merge, r2 = end of merge
    {//r1 = Right1
        // r2 = Right2
        //Done
        int i = l1;//Left1
        int j = l2;//Left2
        int k = 0;

        int[] a3 = new int[r1 - l1 + 1 + r2 - l2 + 1];

        /*int size = r1 - l1 + 1 + r2 - l2 + 1;
        int[] a3 = new int[size]; */
        while (i <= r1 && j <= r2)
        {
            if (a1[i] <= a2[j])
            {
                a3[k] = a1[i];
                i++;
                k++;
            }
            else //if(a1[i] >= a2[j])
                a3[k] = a2[j];
                j++;
                k++;
        }

        if (i <= r1)//First array not completed
        {
            for (int l = i; l <= r1; l++)//Left1 and Right1
                a3[k] = a1[l];
                k++;
        }
        else {
            for (int m = j; m <= r2; m++)//Left2 and Right2
                a3[k] = a2[m];
                k++;
        }
        return a3;
    }

    public static String[] merge(String[] a1, int l1, int r1, String[] a2, int l2, int r2) //r1 = start of merge, r2 = end of merge
    {
        //Done
        int i = l1;
        int j = l2;
        int k = 0;

        String [] a3 = new String[r1 - l1 + 1 + r2 - l2 + 1];

        while (i <= r1 && j <= r2)
        {
            if(a1[i].compareTo(a2[j]) <= 0)
            {
                a3[k] = a1[i];
                i++;
                k++;
            }
            else //if(a1[i].compareTo(a2[j]) >= 0)
                a3[k] = a2[j];
                j++;
                k++;
        }
        if(i <= r1)//First array not completed
        {
            for(int l = i; l <= r1; l++)
                a3[k] = a1[l];
                k++;
        }
        else
        {
            for(int m = j; m <= r2; m++)
                a3[k] = a2[m];
                k++;
        }
        return a3;
    }


    public static void selectSort(int [] a, int currentSize)//Ascending Order
    {
      for (int i = 0; i <= currentSize - 2; i++)
      {
         //find smallest of a[i] to a[currentSize-1]
          //int minArrayVal = a[0];
          int index = i;
          int minArrayVal = a[i];

           for (int j = i + 1; j < a.length; j++)
            {
              if(a[j] < minArrayVal)//minArrayVal > a[j]
              {
                  minArrayVal = a[j];
                  index = j;
              }
            }
           /*if p != i, swap a[p] and a[i]*/
          int tempoSmall = a[i];
          a[i] = a[index];
          a[index] = tempoSmall;
           }
    }

    public static void selectSortReverse(int [] a, int currentSize)//Descending Order
    {
        for (int i = 0; i <= currentSize - 2; i++)
        {
            //find smallest of a[i] to a[currentSize-1]
            //int minArrayVal = a[0];
            int minArrayVal = a[i];
            int index = i;

            for (int j = i + 1; j < a.length; j++)
            {
                if(a[j] > minArrayVal)//minArrayVal < a[j]
                {
                    minArrayVal = a[j];
                    index = j;
                }
            }
            /*if p != i, swap a[p] and a[i]*/
            int tempoSmall = a[i];
            a[i] = a[index];
            a[index] = tempoSmall;
        }
    }

    public static void selectSortString(String [] a, int currentSize)
    {
        for (int i = 0; i <= currentSize - 2; i++)
        //for (int i = 0; i < currentSize - 1; i++)
        //for (int i = 0; i <= a.length - 1; i++)
        {
            //find smallest of a[i] to a[currentSize-1]
            int index = i;//Min String
            //int index = a[i];

            for (int j = i + 1; j < a.length; j++)
            //for (i = 1; i < a.length; i++)
            {
               if(a[j].compareTo(a[index]) < 0)
               {
                   index = j;
               }
            }
            /*if p != i, swap a[p] and a[i]*/
            String temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
    }

    public static void insertSort(int[] a, int currentSize) //Done
            //Ascending Order
    {
        for (int i = 1; i <= currentSize - 1; i++)
        {
            int val = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > val)
            {
               a[j + 1] = a[j];
               j--;
            }
            a[j + 1] = val;
        }
    }

    public static void insertSortReverse(int[] a, int currentSize) //Done
            //Descending Order
    {
        for (int i = 1; i <= currentSize - 1; i++)
        {
            int val = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] < val)//Descending Order
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = val;
        }
    }

    public static void insertSortString(String [] a, int currentSize) //Done
    {
        for (int i = 1; i <= currentSize - 1; i++)
        {
            String val = a[i];
            int j = i - 1;

            while (j >= 0 && a[j].equals(val))
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = val;
        }
    }


    public static int binarySearch(int[] a, int currentSize, int searchKey) {
        int l = 0;
        int r = currentSize - 1;
        boolean found = false;

        while (!found && l <= r)
        {
            int m = ((l + r) / 2);

            if (searchKey == a[m])
            {
                found = true;
            }
            else if (searchKey < a[m])
            {
                r = m - 1;
            }
            else
                l = m + 1;
        }

        int m = ((l + r) / 2);

        if (found)
            return m;
        else
            {
            return -1;
        }
    }

    public static int binarySearchAlt(int[] a, int searchKey) {

        int l = 0; //l = low
        int h = a.length - 1;//h = high

        if(l <= h)
        {
        //Check fixed point in array
        while (l <= h)
        {
           int mid = l + (h + l) / 2;

           if (searchKey < a[mid])//a[mid] > searchKey
           {
               h = mid - 1;
           }

           else if (searchKey > a[mid]) {//a[mid] < searchKey
               l = mid + 1;
           }

            else
           //if(searchKey == a[mid])
                return mid;
        }
      }
     return -1;
    }

    public static boolean uniqueNumbers(int[] a)
    {
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++)
                if (a[i] == a[j])
                    return false;
        }
        return true;
    }

    public static boolean uniqueNumbersAlt(int[] a)
    {
        Arrays.sort(a);

        for (int i = 0; i < a.length - 1; i++)
        {
                if (a[i] == a[i + 1])
                    return false;
        }
        return true;
    }

    public static int sumArray(int [] values, int currentSize)
    {
        int total = 0;

       for (int i = 0; i < currentSize; i++)
       {
           total += values[i];
       }
      return total;
    }

    public static int removeArrayItem(int[] values, int currentSize, int pos)
    {
       for (int i = pos + 1; i <= currentSize - 1; i++)
       {
           values[i - 1] = values[i];
       }
        return currentSize - 1;
    }

    //noName()
    public static int removeArrayItemAlt(int[] values, int pos, int currentSize)
    {
        for (int i = pos; i < currentSize - 1; i++)
        {
            values[i] = values[i + 1];
        }
        currentSize--;
        return currentSize;
    }


    public static int insertArrayItem(int[] values, int currentSize, int value, int pos)
    {
       if(currentSize < values.length)
       {
          for (int i = currentSize - 1; i >= pos; i--)
           {
             values[i + 1] = values[i];
           }
           values[pos] = value;
          currentSize++;
         //return currentSize + 1;
        }
        //return currentSize + 1;
       return currentSize;
    }

   public static int max(int[] values,int currentSize)
   {
       int maxArrayVal = values[0];

   for (int i = 1; i < currentSize; i++)
    if (values[i] > maxArrayVal)//
    {
       maxArrayVal = values[i];
    }
       return maxArrayVal;
   }


   //noName - Index of Elements - No of items in array less than max no
    //Index of smallest starting from
    //Counts number of elements within array and traverses through the array
    //to give out the index of the array.
    public static int numberLessThanMax(int[] values, int currentSize)
    {
        int val = values[0];
        int index = 0;

        for (int i = 1; i < currentSize; i++)
        {
            if (values[i] > val)//val < values[i]
                val = values[i];
                index = i;
        }
        return index;
    }


    public static int min(int[] values,int currentSize)
    {
        int minArrayVal = values[0];

        for (int i = 1; i < currentSize; i++)
            if (values[i] < minArrayVal)//minArrayVal > values[i]
            {
                minArrayVal = values[i];
            }
        return minArrayVal;
    }
}
