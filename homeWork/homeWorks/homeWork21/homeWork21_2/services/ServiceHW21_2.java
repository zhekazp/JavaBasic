package homeWorks.homeWork21.homeWork21_2.services;

import homeWorks.homeWork21.homeWork21_2.enity.UserHW21_2;

public class ServiceHW21_2 {
    private UserHW21_2 user;

    public ServiceHW21_2(String login, String email, String password) {
        user=new UserHW21_2(login,email,password);
    }
    public void changeLogin(String login){
        user.setLogin(login);
    }
    public void changeEmail(String email){
        user.setEmail(email);
    }
    public void changePassword(String newPassword, String oldPassword){
        if(checkNewPassword(newPassword,oldPassword)){
            user.setPassword(newPassword);
        }
    }

    private boolean checkNewPassword(String password,String oldPassword){
        if(!oldPassword.equals(user.getPassword())){
            System.out.println("Old password is incorrect");
            return false;
        } else{
            if (password.length()<6){
                System.out.println("New password is to short (minimum 6 letters)");
                return false;
            }
            else{
                return true;
            }
        }
    }
    public void printUserInfo(){
        System.out.println("Login : "+user.getLogin());
        System.out.println();
        System.out.println("Email : "+user.getEmail());
        System.out.println();
        System.out.println("Password : "+user.getPassword());
        System.out.println();

    }
}
