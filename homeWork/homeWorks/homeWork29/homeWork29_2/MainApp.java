package homeWorks.homeWork29.homeWork29_2;

import homeWorks.homeWork29.homeWork29_2.services.ServiceHW29_2;

public class MainApp {
    public static void main(String[] args) {

        ServiceHW29_2 app = new ServiceHW29_2(10);

        System.out.println("Here is new list :");
        System.out.println(app.getList());
        System.out.println("The max value is : "+app.getMax());
        System.out.println("The min value is : "+app.getMin());

        app.sortList();
        System.out.println("Here is sorted list :");
        System.out.println(app.getList());
    }

}
