package homeWork3.classes;

public class Product {
    private String name;
    public double regularPrice;
    public double discount;

    public Product(String name) {
        this.name = name;
    }
    public void printInformation(){
        System.out.println("Product name: "+name);
        System.out.println("Regular price: "+regularPrice);
        System.out.println("Discount: "+discount);
        System.out.println("Last price: "+actualPrice());
    }
    public double actualPrice(){
        return regularPrice-discount;
    }
}
