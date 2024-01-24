package homeWork6;

public class Stringinfo {
    private String mainWord;
    public int len;
    public void showString(String str){
        mainWord=str;
        System.out.println();
        System.out.println(str);
        len=str.length();
        System.out.println();
        System.out.println("Last char is :"+str.charAt(len-1));
        System.out.println();
    }
    public void checkWordContains(String str){
        System.out.println("String : '"+mainWord+"' contains word : "+str);
        System.out.println("Is it true? - "+mainWord.contains(str));
        System.out.println();
    }

    public void changeChar(char a, char b){
        System.out.println("We replaced in string  - '"+mainWord+"'  all letter - "+a+" to letter b");
        System.out.println("New string is  - "+mainWord.replace(a,b));
        System.out.println();
    }
    public void show_UL_case(){
        System.out.println("This is UPPER case  - "+mainWord.toUpperCase());
        System.out.println("This is lower case  - "+mainWord.toLowerCase());
        System.out.println();
    }

    public void delWord(int index,int end){
        mainWord=mainWord.substring(0,index)+mainWord.substring(end);
        System.out.println("New word after deleting part of string with begin index  - "+index+" : "+mainWord);
        System.out.println();
    }
}
