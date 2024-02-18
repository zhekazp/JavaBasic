package homeWorkOPP1.task4;

import java.util.Locale;

public class Palindrome {
    char[] letters;
    public boolean isPalindrome(String text){
        String str=prepareSting(text);
        stringToArray(str);
        return test();
    }
    private String prepareSting(String str){
        String result=str.toLowerCase();
        return result.replaceAll(" ","");
    }
    private void stringToArray(String str){
        letters=new char[str.length()];
        for (int i=0;i<str.length();i++){
            letters[i]=str.charAt(i);
        }
    }
    private boolean test(){
        int max=letters.length-1;
        for (int i=0;i<letters.length/2;i++){
            if(letters[i]!=letters[max]){
                return false;
            }
            max--;
        }
        return true;
    }
}
