package homeWorks.homeWork19;

import homeWorks.homeWork19.classes.ManagerHW5;

public class HomeWork19_5 {
    public static void main(String[] args) {

        ManagerHW5 manager = new ManagerHW5();
        int[] newArray=manager.getArray();

        manager.printArray(newArray,"Here is a new array :","");

        int[] evenNumbersArray= manager.evenNumbersArray(newArray);

        manager.printArray(evenNumbersArray,"Here is an even numbers array",
                "First array has no even numbers");
    }
}
