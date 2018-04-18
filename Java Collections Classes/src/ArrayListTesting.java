import java.util.ArrayList;

public class ArrayListTesting {


    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Henry");
        names.add("Niamh");
        names.add("Penny");
        names.add("Rachel");

        System.out.println("\nThe names on the arraylist are: ");
        for (String s : names)
        {
            System.out.println(s);
        }

        System.out.println("\n\n");

        names.add(1,"Jessica");


        System.out.println("\nThe names on the updated arraylist is: ");
        for (String t : names)
        {
            System.out.println(t);
        }

        System.out.println("\n\nThe chosen name in the selected index is: " + names.get(2));


        names.remove(0);

        System.out.println("\nThe names on the updated arraylist when a name is removed is: ");
        for (String t : names)
        {
            System.out.println(t);
        }
    }

}
