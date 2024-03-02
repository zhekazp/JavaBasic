package homeWorks.homeWork33.homeWork33_2;

import homeWorks.homeWork33.homeWork33_2.entitys.Product;
import homeWorks.homeWork33.homeWork33_2.services.ProductCatalog;

public class MainApp {
    public static void main(String[] args) {

        ProductCatalog products = new ProductCatalog();
        products.addProduct(new Product("Milk",2));
        products.addProduct(new Product("Watter",1.3));
        products.addProduct(new Product("Cola",1.5));
        products.addProduct(new Product("Sprite",1.4));

        products.printProductById(2);
        products.removeProductBtId(2);
        products.printProductById(2);

    }
}

