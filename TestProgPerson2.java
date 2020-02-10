//TestProgPerson2.java
/*This program will become the driver for the Person class where it will ask the user to
 *input their name and surname*/

import javax.swing.*;

public class TestProgPerson2
{	
  public static void main(String args[])
  {
    String firstName = "",middleName = "",secondName = "";
    String text;
      
   firstName = JOptionPane.showInputDialog("Please enter the first name of the person");
   
   middleName = JOptionPane.showInputDialog("Please enter the middle name of the person");	
	
   secondName = JOptionPane.showInputDialog("Please enter the second name of the person");
   
   Person2 object1 = new Person2();
   Person2 object2 = new Person2(firstName,middleName,secondName);	
	
  text = "*****Person Class Tester*****\n\nCalling the Person() constructor ....." +
   "\nValue of object person1 is now \"" + object1 + "\"\n\nCalling the Person(String,String) constructor ....." +
   	"\nValue of object person2 is now \"" + object2 + "\""; 
   		
   text += "\n\nNow calling the equals method to see whether the names of objects person1 and person2 match";
   	
   	if(!object1.equals(object2))	
   	text += "\nThe name of object person1 does not equal the name of object person2";
   	else
   	 text += "\nThe name of object person1 equals the name of object person2";		
   				
    text += "\n\nMaking a third Person2 object with the values \"Mary Margaret Connors\"";
     
     Person2 object3 = new Person2("Mary","Margaret","Connors");
       
   text += "\nNow calling the makeCopy() method to copy the name of object person3 into the object person 1"; 
   	object1.makeCopy(object3);
   	
    text += "\nThe name of person1 is now " + object1; 
     
    text += "\n\nNow calling the equals() method again to see whether the names of objects person3 and person1 match(they should)";
   
   if(object3.equals(object1))  
   text += "\nThe name of object person1 equals the name of object person3";
   else
   	text += "\nThe name of object person1 does not equal the name of object person3";
    	 
   JOptionPane.showMessageDialog(null,text,"Person Tester",JOptionPane.INFORMATION_MESSAGE); 				
   System.exit(0);	
 }		
}