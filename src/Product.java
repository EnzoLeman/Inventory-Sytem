
class Product {
    private String name;
    private double price;
    private double quantity;

    // Constructor to initialize product
    public Product(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters for product properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return " Name: " + name + "\n Price: " + price + "\n Quantity: " + quantity + "\n";
    }
}
