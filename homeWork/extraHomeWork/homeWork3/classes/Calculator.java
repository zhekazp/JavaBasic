package homeWork3.classes;

public class Calculator {
    public double addition(double a, double b){
        return a+b;
    }
    public double subtraction(double a, double b){
        return a-b;
    }
    public double division(double a, double b){
        return a/b;
    }
    public double multiplication(double a, double b){
        return a*b;
    }
    public boolean isEven(double a) {
        if(a%2==0){
            return true;}else{
            return false;
        }
    }
    public String maxOfTwoNumbers(double a, double b) {
        if (a>b) {
            return "The first number is bigger";}else if (b<a){
            return "The second number is bigger";
        } else{
            return "The numbers is equal";
        }
    }
}

