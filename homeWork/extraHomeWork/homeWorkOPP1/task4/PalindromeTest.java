package homeWorkOPP1.task4;

public class PalindromeTest {
    public static void main(String[] args) {
   Palindrome app = new Palindrome();
        boolean test = true;
        if(!app.isPalindrome("racecar")){
            test=false;
        }
        if(!app.isPalindrome("leVeL")){
            test=false;
        }
        if(!app.isPalindrome("sum summus mus")){
            test=false;
        }
        if(!app.isPalindrome("А роза упала на лапу Азора")){
            test=false;
        }
        if(app.isPalindrome("This is no palindrome")){
            test=false;
        }
        if(test){
            System.out.println("application works correct");
        }else{
            System.out.println("application works incorrect");
        }
    }
}
