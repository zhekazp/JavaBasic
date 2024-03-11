package homeWorks.homeWork38.homeWork1;

public class MainApp {
    public static void main(String[] args) {
        String str="BIG STRING";
        LowStringInterface newStr= String::toLowerCase;
        System.out.println(newStr.lowString(str));
    }


}
