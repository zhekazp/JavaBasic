package homeWork4;

public class Average {
    int sum;
    int average;

    public Average(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9){
        sum=i+i1+i2+i3+i4+i5+i6+i7+i8+i9;
        average=sum/10;
    }

    public void printAverage() {
        System.out.println("Average value is "+average);
    }
}
