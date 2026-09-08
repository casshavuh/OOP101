import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Food Item: ");
        String foodItem = scanner.nextLine();

        System.out.print("Category: ");
        String category = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("Serving Size: ");
        int servingSize = scanner.nextInt();

        System.out.println("\nItem: " + foodItem + "\nCategory: " + category + "\nPrice: PHP " + price + "\nServing Size: " + servingSize);

        scanner.close();
        
        System.out.println("Althea Cassandra A. Miranda");
    }
}
