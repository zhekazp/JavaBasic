package homeWorks.homeWork21.homeWork21_2;

import homeWorks.homeWork21.homeWork21_2.services.ServiceHW21_2;

public class HW21_2_Demo {
    public static void main(String[] args) {
        ServiceHW21_2 app=new ServiceHW21_2("User1","user1@gmail.com","123456");
        app.printUserInfo();
        app.changeEmail("user2@gamil.com");
        app.changeLogin("User2");
        app.changePassword("654321","ko45as");
        app.changePassword("65432","123456");
        app.changePassword("654321","123456");
        app.printUserInfo();
    }
}
