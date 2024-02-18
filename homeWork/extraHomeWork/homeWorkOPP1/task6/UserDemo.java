package homeWorkOPP1.task6;

import homeWorkOPP1.task6.entitys.Users;

/*
Create a repository class to work with UserEntity
Functional requirements:
  - user saving
  - getting user by id
  - getting users by name
  - getting all users
  - user editing
  - deleting a user
*/
public class UserDemo {
    public static void main(String[] args) {
    Users app=new Users(3);
    app.saveUser("Nick");
    app.saveUser("Pit");
    app.saveUser("Anton");
    app.saveUser("Lisa");

    app.printAllUsers();

    app.searchUser(2);
    app.searchUser(4);

    app.searchUser("Pit");
    app.searchUser("Lisa");

    app.editUser(4,"Marta");
    app.editUser(2,"Den");
    app.printAllUsers();

    app.delUser(2);
    app.saveUser("Lisa");
    app.printAllUsers();
    }
}
