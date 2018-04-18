import java.util.Arrays;
import java.util.Collections;

import java.util.Collections;
import java.util.ArrayList;

public class ArraysClassTest {

    public static void main(String[] args) {
        int[] sort1 = {12,45,76,98,25,3};
        System.out.println("Expected = 3,12,25,45,76,98");
        int currentSize = 6;
          //Arrays.sort(sort1);

          Arrays.sort(sort1,0,currentSize); //Sort fromIndex to toIndex
        System.out.println("Actual: ");
          for (int i = 0; i < currentSize; i++)
          {
              System.out.print(sort1[i] + ",");
          }





         sort1 = new int[]{9,65,37,92,3,67}; //Updated Sort1
        System.out.println("\n\nExpected = 3,9,37,65,67,92");
        currentSize = 6;
        //Arrays.sort(sort1);



        Arrays.sort(sort1,0,currentSize);
        System.out.println("Actual: ");
        for (int i : sort1)
        {
            System.out.print(i + ",");
        }





        sort1 = new int[]{100,54,96,28,59,43}; //Updated Sort1
        System.out.println("\n\nExpected = 28,43,54,59,96,100");
        //Arrays.sort(sort1);



        Arrays.sort(sort1);
        System.out.println("Actual: ");
        for (int i : sort1)
        {
            System.out.print(i + ",");
        }












    }
}
