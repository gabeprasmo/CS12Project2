// might completely change and use HashMap instead
import java.io.*;
import java.util.ArrayList;
import java.util.List;



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
    private List<Item> loadItems()
    {

        List<Item> loadItems = new ArrayList<>(); // iniatializes a new                 array list. It will store items that are loaded from a file.

        try (ObjectInputStream itemListReader = new ObjectInputStream(new             FileInputStream(itemListFile))) // intialized a new                                                                 ObjectInputStream called itemListFile                                           that reads from the file
        {
            // the variable, loadedItems, reads the object from                             itemListReader and stores it in the list of items
            List<Item> loadedItems = (List<Item>) itemListReader.readObject();
            //loadedItems = (List<Item>) itemListReader.readObject();
        }
        catch (FileNotFoundException e) // Ignore if the file doesn't exist yet
        {

        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace(); // Handle the exception according to needs
        }
        return loadItems;
    }



    // a method that'll save the inputted items to the list
    private void SaveItems()
    {

        createFile("item1Stuff");

        writeToFile(  "item1Stuff", items.get(0).name, true);




    }



    // a method that writes the items inputted by the user to the file
    // create an instance of Item
    public void WriteItems(Item item)
    {
        items.add(item); // Reminder: items is the name of the list
        SaveItems();
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
            SaveItems(); // Update the file after removing an item
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

