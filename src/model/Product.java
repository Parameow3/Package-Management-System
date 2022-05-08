package model;

public class Product {
    private int packageId;
    private String from;
    private String to;
    private int price;

    public Product(){

    }
    public Product(int id, String from, String to, int price) {
        this.packageId = id;
        this.from = from;
        this.to = to;
        this.price = price;
    }
    //setter and getter
    public int getPackageId() {
        return packageId;
    }
    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
