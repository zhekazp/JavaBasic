package homeWorks.homeWork12.classes;

import classes.UserInput;

public class DellChar {
    UserInput ui=new UserInput();
    public String dell(){
        String str=ui.inputText("Enter new text");
        String newStr="";
        for (int i=0;i<str.length();i++){
            if( (str.charAt(i) != '(') &&
                    (str.charAt(i) != ')')&&
                    (str.charAt(i) != '@')) {
                    newStr=newStr+str.charAt(i);
            }
        }
        return newStr;
    }
}

