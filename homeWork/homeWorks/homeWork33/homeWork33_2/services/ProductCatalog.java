package homeWorks.homeWork33.homeWork33_2.services;

import homeWorks.homeWork33.homeWork33_2.entitys.Product;

import java.util.HashMap;

public class ProductCatalog {
    private int currentId=0;
    private HashMap<Integer, Product> products=new HashMap<>();
    public void addProduct(Product product){
        currentId++;
        products.put(currentId,product);
        System.out.println("Product "+product.getName()+" added and has id- "+currentId);
    }
    public void printProductById(int id){
        System.out.println("Info about product by id ("+id+"):");
        Product temp=products.get(id);
        if(temp!=null) {
            System.out.println(temp);
        }else{
            System.out.println("Product is absent");
        }

    }
    public void removeProductBtId(int id){
        products.remove(id);
        System.out.println("Product with id - "+id+" removed.");
    }

}
