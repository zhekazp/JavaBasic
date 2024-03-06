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
    public int inputPositiveInt(String text){
        System.out.println(text);
        Scanner ns=new Scanner(System.in);
        String str=ns.nextLine();
        if(checkDigit(str)){
            int res= Integer.parseInt(str);
            if(res>0){
                return res;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
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
   private boolean checkDigit(String str){
        boolean test=true;
       if(str.isEmpty()){
           return false;
       }else {
           for (int i = 0; i < str.length() && test; i++) {
               if (!Character.isDigit(str.charAt(i))) {
                   test = false;
               }
           }
       }
        return test;
    }
}
