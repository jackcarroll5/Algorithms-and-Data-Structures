public class Town implements Comparable<Town> {
    private String name;
    private String county;
    private int population;

    public Town(String name, String county, int population) {
        this.name = name;
        this.county = county;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCounty() {
        return county;
    }

    public int getPopulation() {
        return population;
    }

    public int compareToName(Town other) {
        return name.compareTo(other.name);
    }

    public int compareToCounty(Town other) {
        return county.compareTo(other.county);
    }


    public String toString() {
        return "Town[" + name + "," + county + "," + population + "]";
    }

    @Override //Population
    public int compareTo(Town o) {
       return Integer.compare(population,o.population);
    }
}


