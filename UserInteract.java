import java.util.Scanner;
import java.io.*;

class UserInteract {

    private Catalog catalog;


    public UserInteract()
    {
        catalog = new Catalog();
    }

    // sc is short for scanner
    // Method to add an item to the catalog
    public void add_to_catalog() //throws FileNotFoundException, IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item name: ");
        String itemName = sc.nextLine();
        System.out.println("Enter item price: ");
        String itemPrice = sc.nextLine();
        System.out.println("Enter item category: ");
        int itemCategory = sc.nextInt();
        Item item = new Item(itemName,Integer.valueOf(itemPrice));

        //ItemDatabase.//
        catalog.ItemDatabase("myFavTextFile.txt");
        catalog.WriteItems(item); // saves the user inputs to the catalog
    }

    // Method to remove an item from the catalog
    public void remove_from_catalog() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the item to remove: ");
        String itemName = sc.nextLine();
        catalog.removeItem(itemName);
    }

  /*
     // Method to handle user choices and interact with the catalog
    public void userChoice() //throws FileNotFoundException, IOException {
  {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add item to catalog");
            System.out.println("2. Remove item from catalog");
            System.out.println("3. View shopping cart");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    add_to_catalog();
                    break;
                case 2:
                    remove_from_catalog();
                    break;
                case 3:
                    //viewShoppingCart();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);
    }*/

}

// Method to view items in the shopping cart
//private void viewShoppingCart() {

//System.out.println("Shopping Cart:");
//for (Item cartItem : catalog.getShoppingCart().getCartItems()) {
// System.out.println(cartItem.getName() + " - Quantity: " + cartItem.getQuantity());
//}
// }
//}
