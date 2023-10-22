import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response;
        Scanner read = new Scanner(System.in); // Object to read user data by keyboard

        do {
            System.out.println("Please enter a number to select an option:");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Exit");

            // Read user data
            response = Integer.parseInt(read.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Goodbye");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Please select a correct option");
            }
        } while (response != 0);

        read.close();

        System.out.println("Finished program");
    }
}
