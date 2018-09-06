import java.util.Arrays;

public class Medals {

   private final int COUNTRIES = 7;//Row
   private final int MEDALS = 3;//Column

    private String[] countries =
            {
                    "Canada",
                    "China",
                    "Germany",
                    "Korea",
                    "Japan",
                    "Ireland",
                    "United States"
            };

        /*int[][] counts =
                {
                        { 1, 0, 1 },
                        { 1, 1, 0 },
                        { 0, 0, 1 },
                        { 1, 0, 0 },
                        { 0, 1, 1 },
                        { 0, 1, 1 },
                        { 1, 1, 0 }
                };*/

    private int[][] counts;

    private Medals()
    {
        counts = new int[COUNTRIES][MEDALS];
    }

    private void set(int country, int medal, int count) {
        // store count at the specified position in the grid
        counts[country][medal] = count;
        }

        private void display()
        {
            System.out.println("        Country    Gold  Silver  Bronze   Total");

            // Print countries, counts, and row totals
            for (int i = 0; i < COUNTRIES; i++)
            {
                // Process the ith row
                System.out.printf("%15s", countries[i]);

                int total = 0;

                // Print each row element and update the row total
                for (int j = 0; j < MEDALS; j++)
                {
                    System.out.printf("%8d", counts[i][j]);
                    total += counts[i][j];
                }
                // Display the row total and print a new lineg
                System.out.printf("%8d\n", total);
            }
        }

    private int sum(){ /*Add*/
        //compute total medals for all countries and all medal types
       //Total all the medals
        int totalMedals = 0;
        for (int i = 0; i < COUNTRIES; i++) {
            for (int j = 0; j < MEDALS; j++) {
                totalMedals += counts[i][j];
            }
        }
        System.out.println("\n\nTotal medals: "+ totalMedals);

        System.out.println();
        return totalMedals;
    }

    private int[] calculateRowTotals(){
        //compute row totals i.e. total number of medals for each country
        //Saving row Totals
        int []countryTotals = new int[COUNTRIES];

        for (int i = 0; i < COUNTRIES; i++)
        {
            // Total the ith row
            countryTotals[i] = 0;

            for (int j = 0; j < MEDALS; j++)
                countryTotals[i] += counts[i][j];
        }
        return countryTotals;
    }

    private int[] calculateColumnTotals() {
        //compute column totals i.e. total number of medals for each medal type
     //Saving column Totals
        int []medalTotals = new int[MEDALS];

        for (int j = 0; j < MEDALS; j++)
        {
            // Total the jth column
            medalTotals[j] = 0;

            for (int i = 0; i < COUNTRIES; i++)
                medalTotals[j] += counts[i][j];
        }
        return medalTotals;
    }

    public static void main(String[] args) {

        Medals medals = new Medals();

        medals.set(0,0,1);
        medals.set(0,1,3);
        medals.set(1,2,1);
        medals.set(2,1,3);
        medals.set(3,1,2);
        medals.set(4,2,1);
        medals.set(5,0,2);
        medals.set(6,1,2);

    medals.display();

    medals.sum();

  int[] rowTotals =  medals.calculateRowTotals();
  int[] colTotals =  medals.calculateColumnTotals();

    System.out.println("Medal Column Totals");
    for (int i = 0; i < colTotals.length; i++)
        System.out.println("Column " + i + ": " + colTotals[i]);

    System.out.println();

        System.out.println("Medals per Country Totals");
        for (int i = 0; i < rowTotals.length; i++)
            System.out.println("Row " + i + ": " + rowTotals[i]);
    }
}