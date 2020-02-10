//TestProgClock2.java
/*This program tests various operations of the user-defined class Clock to ensure it
 *is working correctly*/
 
 import java.util.*;
 
 public class TestProgClock2
 {
   public static void main(String args[])
   {
  	 int hrs = 0;
 	 int mins = 0;
 	 int secs = 0;
 	
 	 Scanner input = new Scanner(System.in); 
 	
 	 System.out.println("Calling the 3-argument constructor.......");
 	 Clock firstClock = new Clock(7,3,28);
 	
    System.out.println("\nFirst Clock: " + firstClock);
    
 	System.out.println("\n\nCalling the no-argument constructor.......");
 	
 	Clock secondClock = new Clock();
 	
 	System.out.println("\nSecond Clock: " + secondClock);
 	
 	System.out.println("\n\nCalling the setTime() mutator.......");
 	
 	secondClock.setTime(5,45,16);
 	
 	System.out.println("\nAfter calling setTime(), secondClock " + secondClock);
 	
 	System.out.println("\n\nCalling equals() to determine if the times of the " +
 	"2 clocks are the same.......");
 	
 	if(firstClock.equals(secondClock))
    System.out.println("\nBoth times are equal.");	
 	else
 		System.out.println("\nThe two times are not equal");
 		
    System.out.print("\n\nEnter the hours, minutes, and seconds in the form hh:mm:ss - ");
    
    input.useDelimiter(":");
    hrs = input.nextInt();
    mins = input.nextInt();
    
    input.skip(":");
    input.useDelimiter("\\s");
    secs = input.nextInt();
       
    System.out.println();
    
    firstClock.setTime(hrs,mins,secs);
    
    System.out.println("\nNew time of firstClock: " + firstClock);
    
    System.out.println("\n\nCalling the incrementSeconds() method.......");
    firstClock.incrementSeconds(); 
        
    System.out.println("\nAfter incrementing the clock by one second, "
    	              + "firstClock " + firstClock);
        
    System.out.println("\n\nCalling the makeCopy() method.......");
    secondClock.makeCopy(firstClock);
    
     System.out.println("\nAfter copying firstClock into secondClock, "
     	               + "secondClock: " + secondClock);	
   }
 }