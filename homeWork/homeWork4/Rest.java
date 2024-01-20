package homeWork.homeWork4;

public class Rest {
    int rest2;
    int rest3;

    public Rest(int number) {
        rest2=number%2;
        rest3=number%3;
    }

    public void printResult() {
        System.out.println("Rest of dividing 2 is "+rest2);
        System.out.println("Rest of dividing 3 is "+rest3);
    }
}
