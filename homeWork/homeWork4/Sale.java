package homeWork4;

public class Sale {
    int discount;
    int pay;

    public Sale(int priceA, int priceB) {
        discount=100;
        pay=priceA+priceB-discount;
    }
    public void printResult(){
        System.out.println("Total amount : "+pay);
        System.out.println("Discount : "+discount);
    }
}
