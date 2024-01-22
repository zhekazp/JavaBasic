package homeWork2;
public class HomeWork2_2 {
    public static void main(String[] args) {
        int digit=476;
        int result1=digit/100;
        int result2=(digit-result1*100)/10;
        int result3=digit-result1*100-result2*10;
        System.out.println();
        System.out.println("Число :"+digit+" -> "+result1+", "+result2+", "+result3);
    }
}
