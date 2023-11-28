
import java.io.*;
import java.util.*;



// This class store the items in an array
class Catalog
{
    /*A private attribute that stores instances of Item class.
    It will allow us to add, remove, access Item objects */
    private List<Item> items;
    private String itemListFile; // itemListFile is for storing and loading the                                     list of items
    //private ShoppingCart shoppingCart; //Attribute for shopping cart

    public void ItemDatabase(String itemListFile)
    {
        this.itemListFile = itemListFile;
        this.items = loadItems();
        //this.shoppingCart = new ShoppingCart(); //Intialize the shopping cart
    }



    // a method that loads the items from the file
    private List<Item> loadItems() {
        List<Item> loadedItems = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(itemListFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line by commas to extract individual attributes
                String[] itemData = line.split(",");
                if (itemData.length >= 4) { // Ensure the line has all necessary attributes
                    String itemName = itemData[0];
                    String itemCategory = itemData[1];
                    int itemPrice = Integer.parseInt(itemData[2]);
                    //int itemQuantity = Integer.parseInt(itemData[3]);

                    // Create a new Item object using the extracted attributes
                    Item newItem = new Item(itemName, itemCategory, itemPrice);
                    //newItem.setQuantity(itemQuantity);

                    loadedItems.add(newItem); // Add the new item to the list
                } else {
                    System.out.println("Invalid data format in the file: " + line);
                    // You can choose to handle or log this issue as needed
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            // Handle exceptions according to your application's needs
        }

        return loadedItems;
    }


    // a method that'll save the inputted items to the list
    private void saveItems() {
        createFile("ItemCatalog");
        try (FileWriter fileWriter = new FileWriter(itemListFile)) {
            // declare a loop that iterated over each Item object in the items list
            for (Item item : items) {
                // a string representation of the item's attributes separated by a delimiter
                String itemInfo = item.name + "," + item.category + "," + " $" + item.price + "\n";
                fileWriter.write(itemInfo);
            }
            System.out.println("Items saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving items to the file.");
            e.printStackTrace();
        }
    }

    // a method that writes the items inputted by the user to the file
    // create an instance of Item

    public void writeItems(Item item) {;
        items.add(item);
        saveItems();
    }

    public void removeItem(String itemName) {
        Item itemToRemove = null;
        for (Item catalogItem : items) {
            if (catalogItem.name.equalsIgnoreCase(itemName)) {
                itemToRemove = catalogItem;
                break;
            }
        }

        if (itemToRemove != null) {
            items.remove(itemToRemove);
            System.out.println("Item removed successfully.\n");
            saveItems(); // Update the file after removing an item
        } else {
            System.out.println("Item not found in the catalog. Please try again.\n");
        }
    }

    public void createFile(String filename)
    {
        // first, try creating the file normally
        try
        {
            File myObj = new File(filename + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        }
        // if an error occurred, then do the following:
        catch (IOException e)
        {
            System.out.println("An error occurred creating " + filename + ".txt");
            e.printStackTrace(); // prints the line number(s) that caused the error
        }
    }


    /*
    Tries to write to a file called "filename.txt"
    Parameter filename: the name of the file to be written to
    Parameter textToWrite: the text to write to the file
    Parameter shouldAppend: true: adds to the end of the file. false: overwrites the file.
    */
    public void writeToFile(String filename, String textToWrite, boolean shouldAppend) {
        // first, try writing to the file normally
        try
        {
            FileWriter myWriter = new FileWriter(filename + ".txt", shouldAppend);
            myWriter.write(textToWrite);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        // if an error occurred, then do the following:
        catch (IOException e) {
            System.out.println("An error occurred writing to " + filename + ".txt");
            e.printStackTrace(); // prints the line number(s) that caused the error
        }
    }
}

