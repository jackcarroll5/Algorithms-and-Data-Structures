//PrimeNumbers.java
/*This program will display the prime numbers from 1 to 100*/

//import.javax.swing.*;
//Prime Number = No divided by itself and 1.

public class PrimeNumbers
{
  public static void main(String args[])
  {
    String primeNum = "";
    int num = 0;
    
   for(int j = 1; j <= 100; j++)
   {
     int count = 0;
     
  for(num = j; num >= 1; num--)      
    if(j % num == 0)
     count++;	
    
    if(count == 2)
      primeNum = primeNum + j + ",";    
    }
    System.out.println("The prime numbers from 1 to 100 are:\n\n" + primeNum); 
    //JOptionPane.showMessageDialog(null,"The prime numbers from 1 to 100 are:\n\n" + primeNum,"Prime Numbers",JOptionPane.INFORMATION_MESSAGE);
  }
 }