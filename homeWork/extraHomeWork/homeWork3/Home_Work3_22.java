package homeWork3;

import homeWork3.classes.FizzBuzz;

public class Home_Work3_22 {
    public static void main(String[] args) {
        FizzBuzz fb=new FizzBuzz();

        if (!fb.detect(2).equals("2")){
            System.out.println("Application has an error");
        } else{
            if(!fb.detect(5).equals("Buzz")){
                System.out.println("Application has an error");
            } else{
                if(!fb.detect(6).equals("Fizz")){
                    System.out.println("Application has an error");
                } else{
                    if(!fb.detect(15).equals("FizzBuzz")){
                        System.out.println("Application has an error");
                    } else {
                        System.out.println("Application is ok");
                    }
                    }
                }
        }
    }
}
