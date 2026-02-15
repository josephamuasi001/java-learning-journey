public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item item1 = new Item("Mango", 80);
        Item item2 = new Item("Banana", 100);
        Item item3 = new Item("Bread", 12)

    
        inventory.addItem(item1);
        inventory.addItem(item2);
        
        inventory.displayInventory();
    }

    
}