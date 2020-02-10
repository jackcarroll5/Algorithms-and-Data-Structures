//TestProgPerson.java
/*This program will become the driver for the Person class where it will ask the user to
 *input their name and surname*/

import javax.swing.*;

public class TestProgPerson
{	
  public static void main(String args[])
  {
    String firstName,secondName;
      
   firstName = JOptionPane.showInputDialog("Please enter the first name of the person");		
   secondName = JOptionPane.showInputDialog("Please enter the second name of the person");
   
   Person object1 = new Person();
   Person object2 = new Person(firstName,secondName);	
	
  JOptionPane.showMessageDialog(null,"*****Person Class Tester*****\n\nCalling the Person() constructor ....." +
   "\nValue of object person1 is now " + object1 + "\n\nCalling the Person(String,String) constructor ....." +
   	"\nValue of object person2 is now " + object2 ,"Person Test",JOptionPane.INFORMATION_MESSAGE);
			
   System.exit(0);	
 }		
}