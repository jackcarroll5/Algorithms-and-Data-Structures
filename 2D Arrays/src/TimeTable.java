public class TimeTable {

    private final int DAYS = 5;
    private final int HOURS = 9 ;  // 9 hours per day

    private ClassDetails[][] grid;

    public TimeTable() {
        // the grid will have null values
        grid = new ClassDetails[DAYS][HOURS];
    }

    public void set(int day, int hour, ClassDetails details) {
        // store details at the specified position in the grid
if (day >= 0 && day < DAYS && hour >= 0 && hour < HOURS) {
    grid[day][hour] = details;
}
    }

    public void display() {
        // display the grid

        System.out.println("     Days     Hours                   Name     RoomNo");

        // Print countries, counts, and row totals
        for (int i = 0; i < DAYS; i++)
        {
            // Process the ith row
            System.out.printf("%10s", "Day " + i);

            int total = 0;

            // Print each row element and update the row total
            for (int j = 0; j < HOURS; j++)
            {
                //System.out.printf("%7d", grid[i][j]);
                System.out.printf("%20s\n", "Hours " + j);
                //total = total + grid[i][j];
            }


        }



    }

    public ClassDetails get(int day, int hour) {
        // returns the object at the specified position in the grid


        return null;
    }

    public int getNumberOfClassesFor(String name){
    //e.g. get number of Algorithms classes




   return 0;
}

    public int getNumberOfFreeSlots(){



        return 0;
    }

    public static void main(String[] args) {

       TimeTable timeTable = new TimeTable();

       ClassDetails classDetails = new ClassDetails("Programming","T106");

         timeTable.set(0,0,classDetails);

         timeTable.display();

    }

}
