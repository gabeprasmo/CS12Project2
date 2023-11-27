/*import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public List<Item> getCartItems() {
        return cartItems;
    }

    public void addItem(Item item) {
        // Check if the item is already in the cart
        for (Item cartItem : cartItems) {
            if (cartItem.getName().equals(item.getName())) {
                // If yes update the quantity
                cartItem.setQuantity(cartItem.getQuantity() + item.getQuantity());
                return;
            }
        }

        // If not add the item to the cart
        cartItems.add(item);
    }


}*/

