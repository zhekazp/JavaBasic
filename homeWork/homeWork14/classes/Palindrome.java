package homeWork14.classes;

public class Palindrome {
    public boolean checkPalindrome(String str){
        int current=str.length()-1;
        for (int i = 0; i <=str.length()/2 ; i++) {
            if (str.charAt(i)!=str.charAt(current)){
                return false;
            }
            current--;
        }
        return true;
    }
}
