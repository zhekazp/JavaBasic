package homeWorks.homeWork40.homeWork40_6;

import java.util.*;
import java.util.stream.Collectors;

public class HomeWork40_6 {
    public static void main(String[] args) {
        List<Product> products=new ArrayList<>();
        products.add(new Product("Cola","Drinks",5,10));
        products.add(new Product("Watter","Drinks",10,10));
        products.add(new Product("Fanta","Drinks",1.25,8));
        products.add(new Product("Vodka","Alcoholic Drinks",4,5));
        products.add(new Product("Whisky","Alcoholic Drinks",20,9));
        products.add(new Product("Rom","Alcoholic Drinks",25,15));
        products.add(new Product("Wine","Alcoholic Drinks",15,20));
        int averageQuantity=9;
        Map<String,Double> averagePrices= products.stream().
                filter(product -> product.getQuantity()>averageQuantity).
                collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));
        List<Map.Entry<String,Double>> list =new ArrayList<>(averagePrices.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println("average price of products in each category\n" +
                "whose quantity exceeds - "+averageQuantity);
        System.out.println(list);

    }
}
