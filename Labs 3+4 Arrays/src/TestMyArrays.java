
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestMyArrays {
    public static void main(String[] args) {

        int[] list1 = {4, 9, 16, 12, 3};
        int[] list3 = {3, 4, 9, 12, 16};

        int[] list4 = {10, 25};
        int[] list5 = {8, 12, 14, 26, 28};

        int[] l6 = {40,35,76,40,76,21,98};
        int[] l7 = {40,35,76,21,98};

        String txt = "";
        String txt1 = "";

        String[] nameList1 = {"Bob", "Rob", "Sue", "Tom"};
        String[] nameList2 = {"Ann", "Bill", "Joe", "Sam", "Tim"};

        int[] numList1 = {34, 26, 77, 33, 99, 82, 12, 55};
        int[] numList3 = {12, 26, 33, 34, 55, 77 ,82, 99};

        String[] colourList = {"Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Indigo"};

        int[] numList2 = {1034, 1876, 1998, 2341, 2445, 2543, 3876};

        final int SIZE = 100;
        int[] list2 = new int[SIZE];
        list2[0] = 8;
        list2[1] = 12;
        list2[2] = 6;
        list2[3] = 3;
        list2[4] = 1;
        //list2[4] = 10;
        int sizeList2 = 5;


      String[] mergeString = MyArrays.merge(nameList1,0,3,nameList2,0,4);//Expected = Ann,Bill,Bob,Joe,Rob,Sam,Sue,Tim,Tom
        System.out.println("\nThe merged String array is ");
        for (int i = 0; i < mergeString.length; i++) {
            System.out.println(mergeString[i] + ",");
        }


        int[] merge = MyArrays.merge(numList3,0,7,list3,0,4);//Expect the opposite direction with the second array first and the first array second
        System.out.println("\nThe merged Int array is ");//Expected = 3,4,9,12,12,16,26,33,34,55,77,82,99
        for (int i = 0; i < merge.length; i++)
            txt += merge[i] + ",";
        System.out.println(txt);

        int[] merge1 = MyArrays.merge(list4,0,1,list5,0,4);//Expect the opposite direction with the second array first and the first array second
        System.out.println("\nThe merged Int array is ");//Expected = 8,10,12,14,25,26,28
        for (int i = 0; i < merge1.length; i++)
            txt1 += merge1[i] + ",";
        System.out.println(txt1);


        int linSearch1 = MyArrays.linearSearch(numList2, numList2.length, 1876);//Expected = Element 1
        System.out.println("\n\nThe element found here in the linear search was " + linSearch1);

        int simpleLinSearch1 = MyArrays.simpleLinearSearch(numList3,numList3.length,77);//Expected = Element 1
        System.out.println("\nThe element found here in the simple linear search was " + simpleLinSearch1);

        int simpleLinSearch2 = MyArrays.simpleLinearSearch(numList3,numList3.length,85);//Expected = Element -1
        System.out.println("\nThe element found here in the simple linear search was " + simpleLinSearch2);

        int simpleLinSearch3 = MyArrays.simpleLinearSearch(numList3,numList3.length,100);//Expected = Element -1
        System.out.println("\nThe element found here in the simple linear search was " + simpleLinSearch3);

        int simpleLinSearch4 = MyArrays.simpleLinearSearch(numList3,numList3.length,12);//Expected = Element 0
        System.out.println("\nThe element found here in the simple linear search was " + simpleLinSearch4);//Min Comparison

        int simpleLinSearch5 = MyArrays.simpleLinearSearch(numList3,numList3.length,99);//Expected = Element 7
        System.out.println("\nThe element found here in the simple linear search was " + simpleLinSearch5);//Max Comparison

        int simpleLinSearch6 = MyArrays.simpleLinearSearch(numList3,numList3.length,11);//Expected = Element -1
        System.out.println("\nThe element found here in the simple linear search was " + simpleLinSearch6);




        System.out.println("\n\nThe selected Int array in ascending order includes ");//Expected = 12,26,33,34,55,77,82,99
        MyArrays.selectSort(numList1, numList1.length);
        for (int i = 0; i < numList1.length; i++) {
            System.out.println(numList1[i] + ",");
        }

        System.out.println("\n\nThe selected Int array in descending order includes ");//Expected = 12,26,33,34,55,77,82,99
        MyArrays.selectSortReverse(numList1, numList1.length);
        for (int i = 0; i < numList1.length; i++) {
            System.out.println(numList1[i] + ",");
        }


        System.out.println("\nThe inserted Int array in ascending order includes ");//Expected = 12,26,33,34,55,77,82,99
        MyArrays.insertSort(numList1, numList1.length);
        for (int i = 0; i < numList1.length; i++) {
            System.out.println(numList1[i] + ",");
        }


        System.out.println("\nThe inserted Int array in descending order includes ");//Expected = 12,26,33,34,55,77,82,99
        MyArrays.insertSortReverse(numList1, numList1.length);
        for (int i = 0; i < numList1.length; i++) {
            System.out.println(numList1[i] + ",");
        }


        System.out.println("\n\nThe selected String array has ");//Expected = Blue,Green,Indigo,Orange,Red,Violet,Yellow
        MyArrays.selectSortString(colourList, colourList.length);
        for (int i = 0; i < colourList.length; i++){
        System.out.println(colourList[i] + ",");
    }

        System.out.println("\nThe inserted String array has ");//Expected = Blue,Green,Indigo,Orange,Red,Violet,Yellow
        MyArrays.insertSortString(colourList, colourList.length);
        for(int i = 0; i < colourList.length; i++) {
            System.out.println(colourList[i] + ",");
        }

        System.out.println("\nThe selected array has ");
        MyArrays.selectSort(numList2, numList2.length);
        for (int i = 0; i < numList2.length; i++){
            System.out.println(numList2[i] + ",");
        }

        System.out.println("\nThe inserted array has ");
        MyArrays.insertSort(numList2, numList2.length);
        for(int i = 0; i < numList2.length; i++) {
            System.out.println(numList2[i] + ",");
        }

        System.out.println("\n\nThe numbers with duplicates are: " + MyArrays.uniqueNumbers(l6));
        //MyArrays.uniqueNumbers(l6);//Expected = 21,35,40,40,76,76,98
        for(int i = 0; i < l6.length; i++) {
            System.out.println(l6[i] + ",");
        }

        System.out.println("\nThe unique numbers are: " + MyArrays.uniqueNumbers(l7));
        //MyArrays.uniqueNumbers(l7);//Expected = 21,35,40,76,98
        for(int i = 0; i < l7.length; i++) {
            System.out.println(l7[i] + ",");
        }

        System.out.println("\n\nThe alternative numbers with duplicates are: " + MyArrays.uniqueNumbersAlt(l6));
        //MyArrays.uniqueNumbers(l6);//Expected = 21,35,40,40,76,76,98
        for(int i = 0; i < l6.length; i++) {
            System.out.println(l6[i] + ",");
        }

        System.out.println("\nThe alternative numbers are: " + MyArrays.uniqueNumbersAlt(l7));
        //MyArrays.uniqueNumbers(l7);//Expected = 21,35,40,76,98
        for(int i = 0; i < l7.length; i++) {
            System.out.println(l7[i] + ",");
        }

          int binSearch1 = MyArrays.binarySearch(numList2,numList2.length,2341);//Expected = 3 (Element)
           System.out.println("\n\nThe element found here in the binary search was " + binSearch1);

        int binSearch2 = MyArrays.binarySearch(numList2,numList2.length,1034);//Expected = 0 (Element)
        System.out.println("\nThe element found here in the binary search was " + binSearch2);//Min

        int binSearch3 = MyArrays.binarySearch(numList2,numList2.length,3876);//Expected = 6 (Element)
        System.out.println("\nThe element found here in the binary search was " + binSearch3);//Max

        int binSearch4 = MyArrays.binarySearch(numList2,numList2.length,1111);//Expected = -1(Element)
        System.out.println("\nThe element found here in the binary search was " + binSearch4);

        int binSearch5 = MyArrays.binarySearch(numList2,numList2.length,5000);//Expected = -1(Element)
        System.out.println("\nThe element found here in the binary search was " + binSearch5);


        int sum1 = MyArrays.sumArray(list1, list1.length);
        System.out.println("\n\nThe sum of list 1 is " + sum1);// expected total = 44

        int sum2 = MyArrays.sumArray(list2, sizeList2);
        System.out.println("\nThe sum of list 2 is " + sum2);// expected total = 30


        int newSize = MyArrays.removeArrayItem(list2, sizeList2, 3);//Expected length = 4
        //output newSize //expected value?
        //output list2 //expected contents
        System.out.println("\n\nRemaining length in array list2 is " + newSize);

        int newerSize = MyArrays.removeArrayItemAlt(list2,4,sizeList2);//Expected length = 4
        //output newSize //expected value?
        //output list2 //expected contents
        System.out.println("\n\nRemaining length in array list2 is " + newerSize);


       int newSize1 = MyArrays.insertArrayItem(list2, newSize, 23,3);//Expected length = 5
        //output newSize //expected value?
        //output list2 //expected contents
        System.out.println("\n\nThe new length of the array list2 is " + newSize1);


        int max0 = MyArrays.max(list1,list1.length);
        System.out.println("\n\nMax number for list 1 is " + max0);//Expect max = 16

        int max1 = MyArrays.max(list2,sizeList2);
        System.out.println("\nMax number for list 2 is " + max1);//Expect max = 12


        int min0 = MyArrays.min(list1,list1.length);
        System.out.println("\n\nMin number for list 1 is " + min0);//Expect min = 3

        int min1 = MyArrays.min(list2,sizeList2);
        System.out.println("\nMin number for list 2 is " + min1);//Expect min = 1
    }
}
