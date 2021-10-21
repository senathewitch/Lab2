package Lab2;

public class Province {
    private static final long DEFAULT_POPULATION = 4_648_055;
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";
    public static final String[] PROVINCES = {
            "British Columbia",
            "Alberta",
            "Ontario",
            "Quebec",
            "Manitoba",
            "Saskatchewan",
            "Nova Scotia",
            "New Brunswick",
            "Newfoundland and Labrador",
            "Prince Edward Island"
    };
    private static final String[] CAPITALS = {
            "Victoria",
            "Edmonton",
            "Winnipeg",
            "Fredericton",
            "St. John's",
            "Halifax",
            "Toronto",
            "Charlottetown",
            "Quebec City",
            "Regina"
    };
    private String name;
    private String capital;
    private long population;

    public Province(String name, String capital, long population) {
        if (isValidPopulation(population) && (isValidProvince(name))
                    && (isValidCapitalCity(capital))) {
                this.name = name;
                this.capital = capital;
                this.population = population;
            } else {
                this.population = DEFAULT_POPULATION;
                this.name = DEFAULT_PROVINCE;
                this.capital = DEFAULT_CAPITAL;
            }
        }

    public String getName() {

        return name;
    }

    public long getPopulation() {

        return population;
    }

    public String getCapital() {

        return capital;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setCapital(String capital) {

        this.capital = capital;
    }

    public void setPopulation(long population) {

        this.population = population;
    }
    private boolean isValidPopulation(long population) {
        if (population >= 30_000 && population <= 15_000_000) {
            return true;
        }
        return false;
    }

    private boolean isValidProvince(String name) {
        for (String province : PROVINCES) {
            if (province.equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidCapitalCity(String capital) {
        for (String cap : CAPITALS) {
            if (capital.equals(cap)) {
                return true;
            }
        }
        return false;
    }

    public String getDetails() {
        return "The capital of " + this.name + " (population. " + this.population + ") " + "is " + this.capital + ".";
    }
}