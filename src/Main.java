import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner object Innitialization
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Shop Details
            System.out.print("What is your name? ");
            String owner_Name = scanner.nextLine();

            System.out.print("Where is your shop locate? ");
            String shop_Name = scanner.nextLine();

            Shop shop = new Shop(owner_Name, shop_Name);


            int choice;
            do { 
                // System Main Display
                System.out.println("**** SHOP MANAGEMENT SYSTEM *****");
                System.out.println(" 1. View available products.");
                System.out.println(" 2. Add Product.");
                System.out.println(" 3. Update Product Details.");
                System.out.println(" 4. Exit.");
                System.out.println("**** ###################### *****");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:

                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        System.out.println("Goodbye Mr.");
                        break;        
                    default:
                        throw new AssertionError();
                }
            } while (choice != 4);
        }
        
    }
}
