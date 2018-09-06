import java.util.Arrays;

public class TimetableAlt {
    private final int DAYS = 5;
    private final int HOURS = 9;
    private String[][] grid;

    private TimetableAlt() {
        grid = new String[HOURS][DAYS];
        // Fill with empty string
        for (int row = 0; row < HOURS; row++) {
            for (int col = 0; col < DAYS; col++) {
                grid[row][col] = "";
            }
        }
    }
    public void set(int hour, int day, String moduleName)
    {
        grid[hour][day] = moduleName;
    }

    private String get(int hour, int day) {
        // returns the value at the at the specified position in
        //the grid
        if (hour >= day)
            return grid[hour][day];
        else
            return grid[hour][day];

        //return grid[hour][day]; Alt Solution
    }

    private int countFreeSlots() {
        //count the number of empty slots in the grid
        int countFreeSlots = 0;

        for (int row = 0; row < HOURS; row++)
        {
            for (int col = 0; col < DAYS; col++)
            {
                if (grid[row][col].equals(""))
                {
                    countFreeSlots++;
                }
            }
        }
        return countFreeSlots;
    }

    private int count(String moduleName) {
        // count the number of occurrences of moduleName in the
        //grid
        int noTimes = 0;

        for (int row = 0; row < HOURS; row++)
        {
            for (int col = 0; col < DAYS; col++)
                if (grid[row][col].equals(moduleName))
                {
                    noTimes++;
                }
        }
        return noTimes;
    }

    private int[] countDailyFreeSlots() {
        // counts and returns the number of empty slots in each
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


    public static void main(String[] args)
    {
        //String txt = "";
      TimetableAlt timetableAlt = new TimetableAlt();

        timetableAlt.set(0,1,"Algorithms");
        timetableAlt.set(8,2,"Algorithms");
        timetableAlt.set(4,3,"Software Testing");

        System.out.println("\nThe chosen class name is " + timetableAlt.get(0,1));

        System.out.println("\n\nThe number of free slots is: \n" + timetableAlt.countFreeSlots());

      int[] dailyFreeSlots = timetableAlt.countDailyFreeSlots();
        System.out.println("\nThe number of daily free slots for each day (Mon-Fri) is: ");
        System.out.println(Arrays.toString(dailyFreeSlots));
        /*for (int i = 0; i < dailyFreeSlots.length; i++)
            txt += dailyFreeSlots[i] + ",";
        System.out.println(txt);*/

        System.out.println("\n\nThe number of times that the selected course shows up is \n" + timetableAlt.count("Algorithms"));
    }
}
