import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Student Number: ");
        String studentNumber = scanner.nextLine();

        System.out.print("Program: ");
        String program = scanner.nextLine();

        System.out.print("Year Level: ");
        int yearLevel = scanner.nextInt();

        System.out.print("GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("\nName: " + fullName + "\nStudent Number: " + studentNumber + "\nProgram: " + program + "\nYear Level: " + yearLevel + "\nGPA: " + gpa);

        scanner.close();
        
        System.out.println("Althea Cassandra A. Miranda");
    }
}
