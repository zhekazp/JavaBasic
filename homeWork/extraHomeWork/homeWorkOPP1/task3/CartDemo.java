package homeWorkOPP1.task3;
/*
Application works with banking cart(withdraw and deposit operations using creditLimit).
*/
public class CartDemo {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard("1234 4567 8901 2345",1234);

        creditCard.changeLimit(50000);

        creditCard.withdraw(133,10000);
        creditCard.withdraw(1234,10000);
        creditCard.withdraw(1234,40001);
        creditCard.printBalance();
        creditCard.deposit(1234,20000);
        creditCard.printBalance();


    }
}
