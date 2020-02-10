//Person2.java
/*This program will display the method for the name and surname of a person 
 *which will form the GUI where it will supply a name when testing out this Person class*/

public class Person2
{
  private String firstName;
  private String middleName;	
  private String secondName;
	
public Person2()
{
 setName("","","");	
}	
	
public Person2(String name,String midname,String surname)	
{
 setName(name,midname,surname);	
}

public Person2(Person2 p)
{
 //firstName = p.firstName;	
 //middleName = p.middleName;	
 //secondName = p.secondName;
 setFirstName(p.firstName);
 setMiddleName(p.middleName);
 setSecondName(p.secondName);
}
	
public String toString()	
{
  //String str = "";		
 return getFirstName() + " " + getMiddleName() + " " + getLastName();	
}	
	
public void setName(String name,String midname,String surname)
{	
 //firstName = name;
 setFirstName(name);
 setMiddleName(midname);			
 //secondName = surname;
 setSecondName(surname);	
}
	
public void setFirstName(String name)	
{	
  firstName = name;	
}

public void setMiddleName(String midname)	
{	
  middleName = midname;	
}
	
public void setSecondName(String surname)
{	
 secondName = surname;	
}

public String getFirstName()
{
  return firstName;	
}

public String getMiddleName()
{
  return middleName;	
}
	
public String getLastName()	
{
 return secondName;	
}

//public boolean matchesFirstName(String fName)
public boolean matchesFirstName(Person2 p)
{
  return p.getFirstName().equals(firstName);
  //return firstName.equals(fName);		
}

//public boolean matchesMiddleName(String mName)
public boolean matchesMiddleName(Person2 p)
{
   //return middleName.equals(mName);	
  return p.getMiddleName().equals(middleName);		
}

//public boolean matchesLastName(String sName)
public boolean matchesLastName(Person2 p)
{
 //return secondName.equals(sName);
 return p.getLastName().equals(secondName);		
}

public boolean equals(Person2 otherPerson)
{	
 return(firstName == otherPerson.firstName && middleName == otherPerson.middleName && secondName == otherPerson.secondName);
 /*	return (matchesFirstName(otherPerson.firstName) && matchesMiddleName(otherPerson.middleName)
    	 && matchesLastName(otherPerson.secondName));*/	
}

public void makeCopy(Person2 otherPerson)
{
 firstName = otherPerson.firstName;	
 middleName = otherPerson.middleName;	
 secondName = otherPerson.secondName;
 /*setFirstName(otherPerson.firstName);
    	setMiddleName(otherPerson.middleName);
    	setLastName(otherPerson.lastName);*/		
}	
}