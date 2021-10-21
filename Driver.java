package Lab2;

public class Driver {
    public static void main(String[] args) {
        Province bc = new Province("British Columbia", "Victoria", 4648055);
        System.out.println(bc.getDetails());

        Canada canada = new Canada();
        canada.displayAllProvinces();

        System.out.println(canada.getNumOfProvincesBetween(1, 15));;
    }
}