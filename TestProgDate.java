//TestProgDate.java
/**/

import java.util.*;

public class TestProgDate
{
	public static void main(String args[])
	{
	 int day = 0,month = 0,year = 0;
		
	Scanner input = new Scanner(System.in);
	
	Date firstDate = new Date(1,1,2000);
	
	System.out.println("Just called the Date() constructor - value of first date object is " +
	firstDate + "\n");
	
	System.out.print("Please enter a day value: ");
	day = input.nextInt();
	System.out.print("Please enter a month value: ");
	month = input.nextInt();
	System.out.print("Please enter a year value: ");
	year = input.nextInt();
	
	Date secondDate = new Date(day,month,year);
	
	System.out.println("\nJust called the Date(int,int,int) constructor - value of second date object is \n" +
	secondDate);
	
	if(!secondDate.equals(firstDate))
	System.out.println("\nJust calling the equals() method to check whether the date objects \n" +
	"hold the same values. The result is that the dates are different");
	else
	System.out.println("\nJust calling the equals() method to check whether the date objects \n" +
	"hold the same values. The result is that the dates are the same");	
	}
}