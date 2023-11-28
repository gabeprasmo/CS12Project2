
// This class will create an item object with a name, category, and price.
public class Item
{
    // makes the variables private
    public String name;
    public String category;
    public int price;
    public int quantity; //New Quanity attribute

    //public Item(String name, String category, int price)
    public Item(String itemName, String itemCategory, int itemPrice)
    {
        this.name = itemName;
        this.category = itemCategory;
        this.price = itemPrice;
    }


    //getter and setter for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}


