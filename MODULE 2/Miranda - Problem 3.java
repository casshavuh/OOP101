import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        
        System.out.print("Model: ");
        String model = scanner.nextLine();
        
        System.out.print("Plate Number: ");
        String plateNumber = scanner.nextLine();
        
        System.out.print("Manufacturing Year: ");
        int manufacturingYear = scanner.nextInt();
        
        System.out.print("Engine Displacement: ");
        double engineDisplacement = scanner.nextDouble();
        
        System.out.println("\nBrand: " + brand + "\nModel: " + model + "\nPlate: " + plateNumber + "\nYear: " + manufacturingYear + "\nEngine: " + engineDisplacement + " L");

        scanner.close();
        
        System.out.println("Althea Cassandra A. Miranda");
    }
}
