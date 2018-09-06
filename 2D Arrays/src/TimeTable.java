public class TimeTable {

    private final int DAYS = 5;
    private final int HOURS = 9 ;  // 9 hours per day

    private ClassDetails[][] grid;

    public TimeTable() {
        // the grid will have null values
        grid = new ClassDetails[DAYS][HOURS];
    }

    public void set(int day, int hour, ClassDetails details)
    {
        // store details at the specified position in the grid
         if (day >= 0 && day < DAYS && hour >= 0 && hour < HOURS)
        {
            grid[day][hour] = details;
        }
     }

    private void display() {
        // display the grid
        System.out.println("\n     Days     Hours                   Name     RoomNo");

        // Print countries, counts, and row totals
        for (int i = 0; i < DAYS; i++)
        {
            // Process the ith row
            System.out.printf("%10s\n", "Day " + i);

            // Print each row element and update the row total
            for (int j = 0; j < HOURS; j++)
            {
                System.out.printf("%20s\n", "              Hours " + j + "                 " + grid[i][j]);
            }
        }
        System.out.println("\n");
    }

    private ClassDetails get(int day, int hour) {
        // returns the object at the specified position in the grid
        /*if (hour >= day)
            return grid[hour][day];
        else
            return grid[hour][day];*/

        return grid[hour][day]; //Alt Solution
    }

    /*private int getNumberOfClassesFor(String name){
    //e.g. get number of Algorithms classes
        int noClasses = 0;

        for (int row = 0; row < HOURS; row++)
        {
            for (int col = 0; col < DAYS; col++)
            {
                if (grid[row][col].equals(name))
                {
                    noClasses++;
                }
            }
        }
        return noClasses;
}*/

    /*private int getNumberOfFreeSlots(){

        int noFreeSlots = 0;

        for (int row = 0; row < HOURS; row++)
        {
            for (int col = 0; col < DAYS; col++)
            {
                if (grid[row][col].equals(""))
                {
                    noFreeSlots++;
                }
            }
        }
        return noFreeSlots;
    }*/

    public static void main(String[] args) {

       TimeTable timeTable = new TimeTable();

       ClassDetails classDetails = new ClassDetails("Programming","T106");

         timeTable.set(0,0,classDetails);
         timeTable.set(1,1,classDetails);
        timeTable.set(1,1,classDetails);
        timeTable.set(1,2,classDetails);
        timeTable.set(2,2,classDetails);
        timeTable.set(3,3,classDetails);

        System.out.println("\nThe selected class details are:\nClass: " + timeTable.get(1,1).getName() + "  \nRoom No: " + timeTable.get(1,1).getRoomNo());

       //System.out.println("\nThe number of classes for the chosen class is: " + timeTable.getNumberOfClassesFor("Programming"));

         timeTable.display();

        //System.out.println("\nThe number of free slots for the chosen class is: " + timeTable.getNumberOfFreeSlots()); ;

    }

}
