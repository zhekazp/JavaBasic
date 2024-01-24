package homeWork6;

import homeWork6.classes.Stringinfo;

public class HomeWork6_1 {

    public static void main(String[] args) {
        String str=new String("I study Basic Java!");
        Stringinfo strm=new Stringinfo();
        strm.showString(str);
        strm.checkWordContains("Java");
        strm.changeChar('a','o');
        strm.show_UL_case();
        strm.delWord(strm.len-5,strm.len-1);
    }
}
