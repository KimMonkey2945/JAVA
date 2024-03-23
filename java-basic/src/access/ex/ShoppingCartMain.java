package access.ex;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("마늘", 4000, 20);
        Item item2 = new Item("상추", 3000, 43);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayItems();
    }

}
