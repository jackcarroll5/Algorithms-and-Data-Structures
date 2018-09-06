import java.util.Arrays;

public class TimetableAlt2 {

    private final int DAYS = 5;
    private final int HOURS = 9;
    private String[][] grid;

    private TimetableAlt2()
    {
        grid = new String[HOURS][DAYS];
        // Fill with empty string
        for (int row = 0; row < HOURS; row++)
        {
            for (int col = 0; col < DAYS; col++)
            {
                grid[row][col] = "";
            }
        }
    }

    public void set(int hour, int day, String moduleName) {
        // sets the value of the element in column day
        // of row hour to moduleName;
        // to be completed
        grid[hour][day] = moduleName;
    }

    private String get(int hour, int day) {

        /*if (hour >= day)
            return grid[hour][day];
        else
            return grid[hour][day];*/

        return grid[hour][day];
    }

    private void display()
    {
        // Display the grid in tabular form
        // to be completed
        System.out.println("\n     Days    Hours                  Module Name ");

        // Print countries, counts, and row totals
        for (int i = 0; i < DAYS; i++)
        {
            // Process the ith row
            System.out.printf("%10s\n", "Day " + i);

            // Print each row element and update the row total
            for (int j = 0; j < HOURS; j++)
            {
                //System.out.printf("%7d", grid[i][j]);
                System.out.printf("%20s\n", "Hours " + j);
            }
        }
    }

    private int countFreeSlots() {
        //count the number of empty slots in the grid
        // to be completed
        int countFreeSlots = 0;

        for (int row = 0; row < HOURS; row++)
        {
            for (int col = 0; col < DAYS; col++)
                if (grid[row][col].equals(""))
                {
                    countFreeSlots++;
                }
        }
        return countFreeSlots;
    }

    private int[] countDailyFreeSlots() {
        // counts and returns the number of free slots in each
        //day
        //int[] countDailyFreeSlots = {0, 0, 0, 0, 0};
        int[] countDailyFreeSlots = new int[DAYS];

        for (int row = 0; row < HOURS; row++)
        {
            for (int col = 0; col < DAYS; col++)
            {
                if (grid[row][col].equals(""))
                {
                    countDailyFreeSlots[col]++;
                }
            }
        }
        return countDailyFreeSlots;
    }

    private int findBusiestDay(){
        // finds the day with the least number of free slots
        // assume this is unique
        // returns day number i.e. 0 represents Monday, 1
        //represents Tuesday etc
        // first call countDailyFreeSlots method
        int [] counts = countDailyFreeSlots();
        int dayIndex = 0;

        // to be completed
         int lessSlots = counts[0];//Less number of slots remaining

        for (int i = 0; i < HOURS; i++)
        {
         for (int j = 0; j < DAYS; j++)
         {
            if(counts[j] < lessSlots)
                lessSlots = counts[j];
                dayIndex = j;
          }
         }
        return dayIndex;
    }

    public static void main(String[] args) {

        //String txt = "";

        TimetableAlt2 timetableAlt2 = new TimetableAlt2();

        timetableAlt2.set(5,0,"Programming");
        timetableAlt2.set(0,1,"Programming");
        timetableAlt2.set(3,1,"Algorithms");

        System.out.println("\nThe class name is: " + timetableAlt2.get(0,1));

        int[] dailyFreeSlots = timetableAlt2.countDailyFreeSlots();
        System.out.println("\nThe number of daily free slots for each day (Mon-Fri) is: ");
        System.out.println(Arrays.toString(dailyFreeSlots));
        /*for (int i = 0; i < dailyFreeSlots.length; i++)
            txt += dailyFreeSlots[i] + ",";
        System.out.println(txt);*/

        System.out.println("\nThe number of free slots is : " + timetableAlt2.countFreeSlots());

        System.out.println("\nThe busiest day is : " + timetableAlt2.findBusiestDay());

        timetableAlt2.display();
    }
}