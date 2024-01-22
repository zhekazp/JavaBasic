package homeWork4;

public class AverageT {
    int aTemperature;

    public AverageT(int tMonday, int tTuesday, int tWednesday, int tThursday,
                    int tFriday, int tSaturday, int tSunday) {
        aTemperature = (tMonday + tTuesday + tWednesday + tThursday + tFriday +
                tSaturday + tSunday) / 7;
    }
    public void printTemperature(){
        System.out.println("The average temperature in my city is "+aTemperature);
    }
}
