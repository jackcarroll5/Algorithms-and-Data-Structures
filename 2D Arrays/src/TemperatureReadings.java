import java.util.Arrays;

public class TemperatureReadings
{
    private final int HOURS = 24;
    private final int DAYS = 31;
    private int[][] grid;

    private TemperatureReadings()
    {
        grid = new int[HOURS][DAYS];
        for (int row = 0; row < HOURS; row++)
            for (int col = 0; col < DAYS; col++)
                grid[row][col] = 0;
    }

    public void set(int hour, int day, int temperature)
    {
        // store reading at the specified position in the grid
        grid[hour][day] = temperature;
    }

    private int get(int hour, int day)
    {
        // return the value at the specified position in the grid
        if (hour >= day)
            return grid[hour][day];
        else
            return grid[hour][day];

        //return grid[hour][day]; Alt Solution
    }

    private int[] calculateColumnAverages()
    {
        //compute column averages i.e. average temperature for each day of the month
        // first compute column totals i.e. daily total for each day
        int [] columnTotals = new int[DAYS];

        for (int j = 0; j < DAYS; j++)
        {
            // Total the jth column
            columnTotals[j] = 0;

            for (int i = 0; i < HOURS; i++)
            {
                columnTotals[j] += grid[i][j];
            }
           columnTotals[j] = columnTotals[j] / HOURS;
        }
        return columnTotals;
    }

    private void display()
    {
        //display the grid in tabular form
        System.out.println("Days (x) Hours(y)                                                                                                                                                                                                                            Total");

        // Print countries, counts, and row totals
        for (int i = 0; i < HOURS; i++)
        {
            // Process the ith row
            // System.out.printf("%15s", countries[i]);
            int total = 0;

            // Print each row element and update the row total
            for (int j = 0; j < DAYS; j++)
            {
                System.out.printf("%7d", grid[i][j]);
                total += grid[i][j];
            }
            // Display the row total and print a new lineg
            System.out.printf("%8d\n", total);
        }
    }

    /*Displays and counts the number of days that are within the
    * minimum and maximum average temperatures for the 31 days.
    * Based on the calculation of the average temperatures for the day according
    * to the hourly temperatures per hour.*/
    private int noName(int min, int max)
    {
        int [] dailyAverages = calculateColumnAverages();
        int count = 0;
        for (int i = 0; i < DAYS; i++)
        {
            if (dailyAverages[i] >= min && dailyAverages[i] <= max)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        String txt = "";
        TemperatureReadings temp = new TemperatureReadings();

        temp.set(0,0,18);
        temp.set(1,0,24);
        temp.set(2,0,14);
        temp.set(3,0,20);
        temp.set(4,0,27);
        temp.set(5,0,17);
        temp.set(6,0,12);

        temp.set(0,1,24);

        temp.set(1,2,20);
        temp.set(23,2,28);
        temp.set(1,3,15);
        temp.set(1,4,12);
        temp.set(1,5,17);
        temp.set(1,6,12);
        temp.set(5,7,21);
        temp.set(0,30,18);

        System.out.println("Selected temperature is: " + temp.get(0,0));

       temp.display();

        System.out.println("\nThe average column tempratures are ");
       int [] averages = temp.calculateColumnAverages();
        System.out.println(Arrays.toString(averages));
       /*for (int i = 0; i < averages.length; i++)
            txt += averages[i] + ", ";
        System.out.println(txt);*/

        System.out.println("\n\nThe number of days within the minimum and maximum average column temperatures is: " + temp.noName(1,40));
    }
}