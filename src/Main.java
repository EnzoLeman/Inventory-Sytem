import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Scanner object Initialization
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Shop Details
            System.out.print("What is your name? ");
            String ownerName = scanner.nextLine();

            System.out.print("Where is your shop located? ");
            String shopName = scanner.nextLine();

            System.out.println("");
            Shop shop = new Shop(ownerName, shopName);

            // Creating a stack for recently added products and a queue for product updates
            Stack<Product> recentlyAddedProducts = new Stack<>();
            Queue<Product> productUpdateQueue = new LinkedList<>();

            int choice;
            do {
                // System Main Display
                System.out.println("**** SHOP MANAGEMENT SYSTEM *****");
                System.out.println(" 1. View available products.");
                System.out.println(" 2. Add Product.");
                System.out.println(" 3. Update Product Details.");
                System.out.println(" 4. Exit.");
                System.out.println("**** ###################### *****");
                System.out.print("\nEnter your Choice: ");
                choice = scanner.nextInt();

                System.out.println("");

                switch (choice) {
                    case 1:
                        // View available products
                        if (recentlyAddedProducts.isEmpty()) {
                            System.out.println("No available Products\n");
                            break;
                        } else {
                            System.out.println("Available products in the shop:");
                            for (Product product : recentlyAddedProducts) {
                                System.out.println(product);
                            }
                            break;
                        }

                    case 2:
                        // Add Product
                        String productName;
                        System.out.printf("Enter product name: %s\n",scanner.nextLine());
                        productName = scanner.nextLine();

                        double productPrice;
                        System.out.printf("Enter product price: %s",scanner.nextLine());
                        productPrice = scanner.nextDouble();

                        double productQty;
                        System.out.printf("Enter product quantity: %s",scanner.nextLine());
                        productQty = scanner.nextDouble();

                        Product product = new Product(productName, productPrice, productQty);
                        
                        // Push the product onto the stack (recently added)
                        recentlyAddedProducts.push(product);
                        System.out.println("\n> Product added successfully!\n");

                        break;

                    case 3:
                        // Update Product Details
                        if (!recentlyAddedProducts.isEmpty()) {
                            System.out.print("Enter the product name to update: \n");
                            String productToUpdate = scanner.nextLine();

                            // Search and update product
                            boolean found = false;
                            for (Product p : recentlyAddedProducts) {
                                if (p.getName().equalsIgnoreCase(productToUpdate)) {
                                    double newPrice;
                                    System.out.print("Enter new price: \n");
                                    newPrice = scanner.nextDouble();
                                    
                                    double newQty;
                                    System.out.print("Enter new quantity: \n");
                                    newQty = scanner.nextDouble();

                                    // Update product
                                    p.setPrice(newPrice);
                                    p.setQuantity(newQty);

                                    productUpdateQueue.offer(p); // Add to update queue for processing
                                    found = true;
                                    break;
                                }
                            }

                            if (found) {
                                System.out.println("> Product updated successfully!\n");
                            } else {
                                System.out.println("> Product not found!\n");
                            }
                        } else {
                            System.out.println(" @No products to update.\n");
                        }
                        break;

                    case 4:
                        System.out.printf("> Goodbye %s%n" , shop.getOwnerName());
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } while (choice != 4);
        }
    }
}