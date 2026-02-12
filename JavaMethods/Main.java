public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("P001", "Laptop", 999.99, 10);
        Product product2 = new Product("P002", "Smartphone", 499.99, 20);

        product1.displayProductInfo();
        System.out.println();
        product2.displayProductInfo();

        System.out.println("\nSelling 3 units of Laptop...");
        product1.updateStock(3);
        product1.displayProductInfo();

        System.out.println("\nSelling 5 units of Smartphone...");
        product2.updateStock(5);
        product2.displayProductInfo();
    }
}
