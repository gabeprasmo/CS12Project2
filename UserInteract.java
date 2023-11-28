import java.util.Scanner;
class UserInteract {

    private Catalog catalog;


    public UserInteract() {
        catalog = new Catalog();
    }

    // sc is short for scanner
    // Method to add an item to the catalog
    public void add_to_catalog() //throws FileNotFoundException, IOException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter item name: ");
        String itemName = sc.nextLine();

        System.out.println("Enter item category: ");
        String itemCategory = sc.nextLine();

        System.out.println("Enter item price: ");
        int itemPrice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        Item item = new Item(itemName, itemCategory, itemPrice);
        //ItemDatabase.//
        catalog.ItemDatabase("ItemCatalog.txt");
        catalog.writeItems(item); // saves the user inputs to the catalog
    }

    // Method to remove an item from the catalog
    public void remove_from_catalog() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the item to remove: ");
        String itemName = sc.nextLine();
        catalog.removeItem(itemName);
    }

}