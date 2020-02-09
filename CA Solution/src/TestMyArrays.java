public class TestMyArrays {

    public static void main(String[] args) {

        int[] list = {2,8,4,16};
        int[] num = {12,11,15,6};
        int[] listNum = {2,4,8,32,16};

        int[] lis = {12,11,15};

        int[] l = {5,25,35,60};
        int[] l1 = {10,35,85,25,30};


        double median = MyArrays.median(list);
        System.out.println("The median of the even array is " + median);//Expected Median = 6

        double middle = MyArrays.median(listNum);
        System.out.println("\nThe median of the odd array is " + middle);//Expected Median = 8


        double med = MyArrays.median(num);
        System.out.println("\nThe median of the even array is " + med);//Expected Median = 11.5

        double m = MyArrays.median(lis);
        System.out.println("\nThe median of the odd array is " + m);//Expected Median = 12.0



        int match = MyArrays.countMatches(l,l1);
        System.out.println("\n\nThe number of matching elements in the two arrays is " + match);//Expect 15 and 35 as the matching elements



    }


}
