//Date.java
/*This object oriented program prepares the date, month and year for the Java Program*/

public class Date
{
  private int day;	
  private int month;	
  private int year;	
	
 public Date()
 {
 setDay(1);	
 setMonth(1);	
 setYear(2000);		
 }	
	
 public Date(int d, int m, int yr)
 {
  setDay(d);	
 setMonth(m);	
 setYear(yr);		
 }	
 	
 public String toString()
 {
  return getDay() + "-" + getMonth() + "-" + getYear();
 } 	
 	
 public void setDay(int d)
 {
 if(d >= 1 && d <= 31)
 day = d;	
 }	
 	
 public void setMonth(int m)
 {
 if(m >= 1 && m <= 12)
 month = m;	
 }
 
 public void setYear(int yr)
 {
 if(yr >= 0 && yr <= 10000)	
 year = yr;	
 }
 
 public int getDay()
 {
  return day;	
 }
 
 public int getMonth()
 {
   return month;	
 }
	
 public int getYear()
 {
  return year;	
 }
 
 public boolean equals(Date newDate)
 {
  return (day == newDate.day && month == newDate.month && year == newDate.year);	 	
 }
}