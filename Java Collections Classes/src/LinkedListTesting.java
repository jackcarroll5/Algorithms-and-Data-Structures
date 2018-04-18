import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTesting {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.addLast("Kay");
        names.addLast("Jay");
        names.addLast("May");
        names.addLast("Fay");


        System.out.println("The list of names at the start is: ");
        for (String s : names)
        {
            System.out.println(s);//Expected = Kay,Jay,May,Fay
        }

        ListIterator<String> iterator = (ListIterator<String>) names.iterator();

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.add("Ray");

        System.out.println("\n\nThe list of names when the new name is added is: ");
        for (String s : names)
        {
            System.out.println(s);//Expected = Kay,Jay,May,Ray,Fay
        }


        iterator = (ListIterator<String>) names.iterator();
        iterator.next();
        iterator.next();


       iterator.remove();


        System.out.println("\n\nThe list of names when the selected name is removed is: ");
        for (String s : names)
        {
            System.out.println(s);//Expected = Kay,May,Ray,Fay
        }


        System.out.println("\n\nThe list of names through the iterator is: ");
        iterator = (ListIterator<String>) names.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());//Expected = Kay,May,Ray,Fay
        }

        System.out.println("\n\n\nThe list of names through the list iterator is: ");
        ListIterator<String> namesList = names.listIterator();

        while (namesList.hasNext())
        {
            System.out.println(namesList.next());//Expected = Kay,May,Ray,Fay
        }

        System.out.println("\nThe list of names in reverse order through the list iterator is: ");
       namesList = names.listIterator(names.size());

       while (namesList.hasPrevious())
        {
            System.out.println(namesList.previous());//Expected = Fay,Ray,May,Kay
        }
    }
}
