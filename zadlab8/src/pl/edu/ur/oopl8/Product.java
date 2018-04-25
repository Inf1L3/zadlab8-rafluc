package pl.edu.ur.oopl8;

public abstract class Product {

    private double price;
    private String name;
    private String describe;

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public Product(double price, String name, String describe) {
        this.price = price;
        this.name = name;
        this.describe = describe;
    }
    

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void buy();

    public abstract void showInfo();
}
//Produkty typu ubranie, lekarstwa, narzędzia nie powinny być opisane jako abstrakcyjne
