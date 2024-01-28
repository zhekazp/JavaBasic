package classes;

import java.util.Scanner;

public class UserInput {
    public String inputText(String text){
        System.out.println(text);
        Scanner ns=new Scanner(System.in);
        return ns.nextLine();
    }
    public int inputInt(String text){
        System.out.println(text);
        Scanner ns=new Scanner(System.in);
        return ns.nextInt();
    }
    public double inputDouble(String text){
        System.out.println(text);
        Scanner ns=new Scanner(System.in);
        return ns.nextDouble();
    }
    public boolean inputBool(String text){
        System.out.println(text+" (y/n)");
        Scanner ns=new Scanner(System.in);
        return ns.nextLine().equalsIgnoreCase("y");
 }
}
