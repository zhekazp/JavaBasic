package homeWork3;

import homeWork3.classes.Product;

public class ProductDemo {
    public static void main(String[] args) {
        Product pr=new Product("pen");
        pr.regularPrice=10;
        pr.discount=2;
        pr.printInformation();
    }
}
