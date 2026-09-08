import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        System.out.print("RAM in GB: ");
        int ram = scanner.nextInt();

        System.out.print("Storage in GB: ");
        int storage = scanner.nextInt();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.println("\nBrand: " + brand + "; \nModel: " + model + "; \nRAM: " + ram + " GB; \nStorage: " + storage + " GB; \nPrice: PHP " + price);

        scanner.close();
        
        System.out.println("Althea Cassandra A. Miranda");
    }
}
