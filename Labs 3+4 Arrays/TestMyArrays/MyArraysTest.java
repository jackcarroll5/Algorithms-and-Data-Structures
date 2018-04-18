import org.junit.Test;

import static org.junit.Assert.*;

public class MyArraysTest {

    @Test
    public void linearSearch() throws Exception {
     int [] l = {100,250,1000,300,460,580,700};
        int res = MyArrays.linearSearch(l,l.length,1000);
        int expected = 2;
        assertEquals(expected,res);




    }

    @Test
    public void merge() throws Exception {
      int [] a1 = {1,5,7,12,13,20};
        int [] a2 = {21,22,36,45,60,75,90};


        int [] merge = MyArrays.merge(a1,0,5,a2,0,6);

        int [] expected = {1,5,7,12,13,20,21,22,36,45,60,75,90};


        assertArrayEquals(expected,merge);

    }

    @Test
    public void merge1() throws Exception {





    }

    @Test
    public void selectSort() throws Exception {
        int [] l = {100,250,300,460,580,700};
        MyArrays.selectSort(l,l.length);
        int [] expected = l;
        assertEquals(expected,l);




    }





    @Test
    public void selectSortString() throws Exception {
       String [] name = {"Johnny","Maggie","Rachel","Sally"};
        MyArrays.selectSortString(name,name.length);
        String [] expected = name;
        assertArrayEquals(expected,name);


    }

    @Test
    public void insertSort() throws Exception {
        int [] l = {100,250,300,460,580,700};
        MyArrays.insertSort(l,l.length);
        int [] expected = l;
        assertEquals(expected,l);



    }

    @Test
    public void insertSortString() throws Exception {
        String [] name = {"Johnny","Maggie","Rachel","Sally"};
        MyArrays.insertSortString(name,name.length);
        String [] expected = name;
        assertArrayEquals(expected,name);

    }

    @Test
    public void binarySearch() throws Exception
    {
        int [] list = {12,33,45,66,77};
       int res = MyArrays.binarySearch(list,list.length,33);
        int expected = 1;
       assertEquals(expected,res);







    }

    @Test
    public void sumArray() throws Exception {



    }

    @Test
    public void removeArrayItem() throws Exception {



    }

    @Test
    public void insertArrayItem() throws Exception {




    }

    @Test
    public void max() throws Exception {





    }

    @Test
    public void min() throws Exception {




    }

}