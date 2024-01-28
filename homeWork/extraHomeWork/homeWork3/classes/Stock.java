package homeWork3.classes;

public class Stock {
    private String companyName;
    private  int price;
    private  int minPrice;
    private  int maxPrice;

    public Stock(String companyName, int price) {
        this.companyName = companyName;
        this.price = price;
        minPrice=price;
        maxPrice=price;
    }
    public void getPriceInformation(){
        System.out.println("Stock :");
        System.out.println("Company : "+companyName);
        System.out.println("Current price : "+price);
        System.out.println("Max / min :"+maxPrice+" / "+minPrice);
    }
    public void updatePrice(int newPrice){
        price=newPrice;
        if(newPrice>maxPrice){
            maxPrice=newPrice;
        } else{
            if(newPrice<minPrice){
                minPrice=newPrice;
            }
        }
    }
}
