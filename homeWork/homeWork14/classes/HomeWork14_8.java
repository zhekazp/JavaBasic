package homeWork14.classes;

public class HomeWork14_8 {
    public static void main(String[] args) {

        Palindrome p=new Palindrome();
        if (p.checkPalindrome("saippuakivikauppias")){
            System.out.println("The word is Palindrome");
        }else {
            System.out.println("The word is not Palindrome");
        }
    }
}
