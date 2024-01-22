package homeWork6;

import java.util.Scanner;

public class UserInput {
    public String inputText(String text){
        System.out.println(text);
        Scanner ns=new Scanner(System.in);
        String result=ns.nextLine();
        //ns.close();
        return result;
    }
    public int inputInt(String text){
        System.out.println(text);
        Scanner ns=new Scanner(System.in);
        return ns.nextInt();
    }
    public double inputDouble(String text){
        System.out.println(text);
        Scanner ns=new Scanner(System.in);
        double result =ns.nextDouble();
        //ns.close();
        return result;
    }
}
