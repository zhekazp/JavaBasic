package homeWork3.classes;

public class FizzBuzz {
    public String detect(int number) {
        int rest3=number % 3;
        int rest5=number % 5;
        if(rest3 != 0 & rest5 != 0){
            String r=toString();
            return Integer.toString(number);
        }else {
            if(rest3!=0){
                return "Buzz";
            } else if (rest5!=0){
                return "Fizz";
            } else {
                return "FizzBuzz";
            }
        }
    }
}
