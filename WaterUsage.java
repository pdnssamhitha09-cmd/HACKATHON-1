import java.util.Scanner;

class WaterUsage {

    // Method to calculate total water consumption
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read morning water usage
        System.out.print("Enter morning water usage: ");
        int morningUsage = sc.nextInt();

        // Read evening water usage
        System.out.print("Enter evening water usage: ");
        int eveningUsage = sc.nextInt();

        // Call the method
        int total = calculateTotal(morningUsage, eveningUsage);

        // Display total consumption
        System.out.println("Total Water Consumption: " + total + " litres");

    }
}