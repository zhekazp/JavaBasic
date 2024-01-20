package homeWork.homeWork4;

public class Average {
    int sum;
    int average;

    int aTemperature;
    public Average(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9){
        sum=i+i1+i2+i3+i4+i5+i6+i7+i8+i9;
        average=sum/10;
    }
    public Average(int tMonday, int tTuesday, int tWednesday, int tThursday,
                   int tFriday, int tSaturday,int tSunday){
        aTemperature=(tMonday+tTuesday+tWednesday+tThursday+tFriday+
                tSaturday+tSunday)/7;
    }

    public void printAverage() {
        System.out.println("Average value is "+average);
    }

    public void printTemperature(){
        System.out.println("The average temperature in my city is "+aTemperature);
    }
}
