import java.util.Scanner;

public class MyMath {

    public static int maxThreeNos(int a, int b, int c)
    {
        int max;

       if(c > a && c > b)
       {
          max = c;
       }

       else if(b > a && b > c)
        {
            max = b;
        }

       else
        {
            max = a;
        }

           return max;
    }

    public static double powerOfNo(double a,double b)//Simple Version
    {
        return Math.pow(a,b);
    }

    public static double powerOfNo1(double a,double b)//Algorithm based
    {
       double n = 1;

       for(int i = 1; i <= b; i++)
        n *= a;

           return n;
    }

    public static int sumOfNo(int n)//Sum
    {
         int sum = 0;

           for (int i = 0; i <= n; i++)
           sum += i;

       return sum;
    }


    public static int NotN(int n)//Factorial
    {
        int sum = 1;

        for (int i = 1; i <= n; i++)
            sum *= i;

        return sum;

    }

  public static boolean isPrime(int h)
  {
      boolean confirm = false;

      for (int i = 2; i < h; i++)
          if(h <= 3)
          {
              confirm = true;
              break;
          }
         else if(h % i == 0) {
              confirm = false;
              break;
          }
         else
             confirm = true;


   return confirm;
  }

    public static boolean isPrime1(int h)
    {

        for (int i = 2; i < Math.sqrt(h - 1); i++)
          /*  if(h <= 3)
            {
                confirm = true;
                break;
            }*/
            if(h % i == 0) {
                return false;
            }
            /*else
                confirm = true;*/


        return true;
    }

  public static boolean isPassword(String password)
  {
      boolean checker = false;
      int digits = 0,uppercase = 0,lowercase = 0;

    while(!checker) {
        if (password.length() == 8) {
            for (int i = 0; i < password.length(); i++)
            {
                if (Character.isUpperCase(password.charAt(i))) {
                    uppercase++;
                }
                if (Character.isLowerCase(password.charAt(i))) {
                    lowercase++;
                }
                if (Character.isDigit(password.charAt(i))) {
                    digits++;
                }
            }

            if (uppercase >= 1 && lowercase >= 1 && digits >= 1)
                checker = true;

        }
    }
        return checker;
    }


  public static String countingNum()
  {
      String txt = "";
      int num;
      int[] counts = new int[101];

      Scanner input = new Scanner(System.in);

      do {
               System.out.print("Please enter some numbers between 1 and 100: ");
               num = input.nextInt();


               counts[num]++;
               txt += "\n" + num + ": " + counts[num];

       }while (num >= 1 && num < 101);

      System.out.println("\n\nThis input has ended as the number is less than 1");

     return txt;
  }

  public static String ethelEncry()
  {
      int a;
      int n;
    int b;//n = No of Characters in encrypted message
      //a and b = Calculate offset
      String encryMessage = "";
      String decryMessage = "";

     Scanner input = new Scanner(System.in);

      System.out.print("\nPlease select the number of characters in the sentence: ");
      n = input.nextInt();

   System.out.print("Please enter an a value: ");
   a = input.nextInt();

      System.out.print("Please enter a b value: ");
      b = input.nextInt();

      if(a > 0 || b > 0) {
          double offset = Math.pow(a, b);
          char currentLetter;

          System.out.println("\nOffset value is " + offset);

          System.out.println("\n" + n + " " + a + " " + b);
          input.nextLine();

          System.out.print("Please enter an encrypted message: ");
          encryMessage = input.nextLine();

          System.out.println("\n" + encryMessage.toUpperCase());


          while (offset >= 26)
          {
              offset -= 26;
          }

          for (int i = 0; i < encryMessage.length(); i++)
          {
              currentLetter = encryMessage.charAt(i);

              if(currentLetter != ' ')
              {
                  currentLetter -= offset;

                  while (currentLetter < 'A')
                  {
                       currentLetter += 26;
                  }

              }

              decryMessage += currentLetter;
          }
      }

          return decryMessage;

  }

 /* public static String decry()
  {


      return decryMessage;
  }*/

  public static boolean[] sieveEraPrime(int limit)
  {

      boolean[] checkPrime = new boolean[limit];
      String pNum = "";
      String cNum = "";

      for (int h = 2; h < limit; h++) {
          checkPrime[h] = true;
      }

      for (int i = 2; i < limit; i++)
      {
        if(checkPrime[i])
        {
            pNum = pNum + i + ",";
            for (int j = i * i; j < limit; j += i)
            {
               checkPrime[j] = false;
            }
        }

      }
      System.out.println("\n\n" + pNum);//Returns the list of prime numbers in accordance with the limit
      return checkPrime;
  }

}
