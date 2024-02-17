package homeWorks.homeWork4;

public class HomeWork4_2 {
    public static void main(String[] args) {
        Average ac=new Average(0,1,2,3,4,5,6,7,8,9);
        ac.printAverage();
        System.out.println("Answer is "+(ac.sum % 10));

    }
}
