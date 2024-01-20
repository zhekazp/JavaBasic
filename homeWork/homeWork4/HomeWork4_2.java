package homeWork.homeWork4;

public class HomeWork4_2 {
    public static void main(String[] args) {
//        int i=0,i1=1,i2=2,i3=3,i4=4,i5=5,i6=6,i7=7,i8=8,i9=9;
//        int sum=i+i1+i2+i3+i4+i5+i6+i7+i8+i9;
//        int average=sum/10;
//        System.out.println(average);
//        System.out.println("Answer is "+(sum % 10));
        Average ac=new Average(0,1,2,3,4,5,6,7,8,9);
        ac.printAverage();
        System.out.println("Answer is "+(ac.sum % 10));

    }
}
