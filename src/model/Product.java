package model;

public class Product {
    // product's field
    private int packageId;
    private String from;
    private String to;
    private int price;

    // non-default constructor
    public Product(int id, String from, String to, int price) {
        this.packageId = id;
        this.from = from;
        this.to = to;
        this.price = price;
    }

    // getter or accessor
    public int getPackageId() {
        return packageId;
    }
    public String getFrom() {
        return from;
    }
    public String getTo() {
        return to;
    }
    public int getPrice() {
        return price;
    }
}
