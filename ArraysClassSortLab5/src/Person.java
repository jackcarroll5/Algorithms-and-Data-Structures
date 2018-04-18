import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person implements Comparable<Person>{

    private String firstName;
    private String surname;
    private GregorianCalendar dob;

    public Person()
    {
        setFirstName("");
        setSurname("");
        setDob(new GregorianCalendar(1,1,1));
    }

    public Person(String firstName, String surname, GregorianCalendar dob)
    {
        setFirstName(firstName);
        setSurname(surname);
        setDob(dob);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public GregorianCalendar getDob() {
        return dob;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(GregorianCalendar dob) {
        this.dob = dob;
    }

    /*public int compareTo(Person o)
    {

      return compareTo(o,sortBy.NAME);
    }*/


    /*@Override  //Sort out by first name and surname (A)
    public int compareTo(Person o) {
        String s = surname + firstName;
        String sOther = o.surname + o.firstName;
        return s.compareTo(sOther);
    }*/

    @Override //Sort out by DOB (B)
    public int compareTo(Person o) {
        return getDob().compareTo(o.getDob());
    }


    @Override
    public String toString() {
        return getSurname() + "," + getFirstName() + ",\n" + getDobString();
    }

    public String getDobString()
    {
        return dob.get(GregorianCalendar.YEAR) + "-" + dob.get(GregorianCalendar.MONTH) + "-" + dob.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public static void main(String[] args) {
     Person p = new Person("Ted","Murphy",new GregorianCalendar(1994,2,28));
        Person p2 = new Person("Bob","Murphy",new GregorianCalendar(1994,7,16));

        Person[] people = new Person[] {p2,p};

        Arrays.sort(people);

        System.out.println("Order by Surname, FirstName");

        for (Person list: people)
        {
           System.out.println(list.toString());
        }

        //Arrays.sort(people,);


        Arrays.sort(people);
        System.out.println("\nOrder by DOB");

        for (Person list: people)
        {
            System.out.println(list.toString());
        }


        int pos = Arrays.binarySearch(people,p2);//Expected = 1
        System.out.println("\nPosition of Person element: " + pos);

        int posElement = Arrays.binarySearch(people,p);//Expected = 1
        System.out.println("\nPosition of Person element: " + posElement);

    }

}
