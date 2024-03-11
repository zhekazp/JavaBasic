package homeWorks.homeWork38.homeWork2;

public class HomeWork2 {
    public static void main(String[] args) {
        Sum sum=(a,b)->a+b;
        System.out.println(sum.sumTwoNum(3,4));
    }
    interface Sum{
        int sumTwoNum(int a, int b);
    }
}
