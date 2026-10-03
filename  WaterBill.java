import java.util.Scanner;

class WaterBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read water consumption
        System.out.print("Enter water consumption in litres: ");
        double water = sc.nextDouble();

        // Calculate water bill using if-else
        if (water <= 500) {
            System.out.println("Water Bill: Rs.100");
        } else {
            System.out.println("Water Bill: Rs.200");
        }

        sc.close();
    }
}