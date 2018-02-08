import java.util.Arrays;
import java.util.Scanner;

public class TestMyMath
{
    public static void main(String[] args) {

        int a = 3;
        int b = -4;
        int c = 0;
        String password;

        Scanner input = new Scanner(System.in);

        int max0 = MyMath.maxThreeNos(a,b,c);
        System.out.println("\nMax of " + a + ", " + b + ", " + c + " is: " + max0);

        int max = MyMath.maxThreeNos(1,5,3);
          System.out.println("\nMax number is " + max);//expect 5

        int max1 = MyMath.maxThreeNos(12,7,4);
        System.out.println("\nAnswer is " + max1); //expect 12

        int max2 = MyMath.maxThreeNos(3,1,10);
        System.out.println("\nMax number is " + max2); //expect 10


        double ans = MyMath.powerOfNo(2,3);
        System.out.println("\n\nThe answer is " + ans);//Expect 8.0

        double ans2 = MyMath.powerOfNo(-2,4);
        System.out.println("\nThe answer is " + ans2);//Expect 16.0

        double ans3 = MyMath.powerOfNo(2,0);
        System.out.println("\nThe answer is " + ans3);//Expect 1.0


        double an = MyMath.powerOfNo1(2,2);
        System.out.println("\n\nThe answer is " + an);//Expect 4.0

        double an1 = MyMath.powerOfNo1(3,4);
        System.out.println("\nThe answer is " + an1);//Expect 81.0

        double an2 = MyMath.powerOfNo1(-5,2);
        System.out.println("\nThe answer is " + an2);//Expect 25.0


        int sum = MyMath.sumOfNo(3);
        System.out.println("\n\nThe sum is " + sum);//Expect 6

        int sum1 = MyMath.sumOfNo(-1);
        System.out.println("\nThe sum is " + sum1);//Expect 0

        int sum2 = MyMath.sumOfNo(10);
        System.out.println("\nThe sum is " + sum2);//Expect 55


        int factorial = MyMath.NotN(5);
        System.out.println("\n\nThe answer is " + factorial);//Expect 120

        int factorial1 = MyMath.NotN(6);
        System.out.println("\nThe answer is " + factorial1);//Expect 720

        int factorial2 = MyMath.NotN(4);
        System.out.println("\nThe answer is " + factorial2);//Expect 24

         boolean prime = MyMath.isPrime(5);
        System.out.println("\n\n" + prime + " prime number");//Expect 5 to be a prime number

        boolean prime1 = MyMath.isPrime(6);
        System.out.println("\n" + prime1 + " prime number");//Expect 6 to not be a prime number

        boolean prime2 = MyMath.isPrime(89);
        System.out.println("\n" + prime2 + " prime number");//Expect 89 to be a prime number

        boolean prime3 = MyMath.isPrime1(92);
        System.out.println("\n" + prime3 + " prime number");//Expect 89 to be a prime number

        String numbers = MyMath.countingNum();
        System.out.println("\n\nThe numbers entered between 1 and 100 are " + numbers);//Expecting number of each number entered

        System.out.println("\n\nThe prime numbers are: " + Arrays.toString(MyMath.sieveEraPrime(100)));
        /*Returns whether the number mentioned within sieveEraPrime() method is true or false in terms of prime numbers*/


        System.out.println("\n\n" + MyMath.ethelEncry());

        System.out.print("\n\nPlease enter a password:");
        password = input.nextLine();

        if(MyMath.isPassword(password))
            {
            boolean pword = MyMath.isPassword(password);//Expect written string to be a valid password
            System.out.println("\nPassword is " + pword);
              }
              else {
            System.out.print("\nThis password is wrong! Please re-enter the password:");
            password = input.nextLine();
            boolean pword = MyMath.isPassword(password);
            System.out.println("\nPassword is " + pword);

        }




    }
}
