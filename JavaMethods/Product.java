public class Product {
    private String productID;
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String productID, String name, double price, int quantityInStock) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantityInStock() {
        return quantityInStock;
    }
    public void setProductID(String productID) {
        this.productID = productID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    
    public boolean isInStock(int quantityInStock) {
        if (quantityInStock > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void updateStock(int quantitySold) {
        if (quantitySold <= quantityInStock) {
            quantityInStock -= quantitySold;
        } else {
            System.out.println("Not enough stock to sell " + quantitySold + " units.");
        }
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }

}


