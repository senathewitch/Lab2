package Lab2;

public class Canada {
    private Province[] provinces;
    public Canada() {
        this.provinces = new Province[10];
        this.provinces[0] = new Province("British Columbia","Victoria",4_648_055);
        this.provinces[1] = new Province("Alberta","Edmonton",4_067_175);
        this.provinces[2] = new Province("Quebec", "Quebec City", 8_164_361);
        this.provinces[3] = new Province("Nova Scotia", "Halifax", 923_598);
        this.provinces[4] = new Province("New Brunswick", "Fredericton", 747_101);
        this.provinces[5] = new Province("Manitoba", "Winnipeg", 1_278_365);
        this.provinces[6] = new Province("Prince Edward Island", "Charlottetown", 142_907);
        this.provinces[7] = new Province("Saskatchewan", "Regina", 1_098_352);
        this.provinces[8] = new Province("Newfoundland and Labrador", "St. John's", 519_716);
        this.provinces[9] = new Province("Ontario", "Toronto", 13_448_494);
    }

    public void displayAllProvinces() {
        for (Province province : provinces) {
            System.out.println(province.getDetails());
        }
    }

    public int getNumOfProvincesBetween(int min, int max) {
            int count = 0;
            for (Province province : provinces) {
                if (province.getPopulation() > min * 1_000_000 &&
                province.getPopulation() < max * 1_000_000) {
                    count ++;
                }
            }
        return count;
    }
}