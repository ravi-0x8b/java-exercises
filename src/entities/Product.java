package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
    };

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }

    public double TotalValueInStock() {
        return price * quantity;
    }
    public void AddProducts(int quantity) {
        this.quantity += quantity;
    }
    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }
}
