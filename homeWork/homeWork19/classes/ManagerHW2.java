package homeWork19.classes;

import classes.UserInput;

public class ManagerHW2 {
    private String str;
    public ManagerHW2(){
        UserInput ui=new UserInput();
        str = ui.inputText("Enter as many words as you wish (between words must stay a space)");
    }
    public void countWords(){
        boolean test=false;
        int counter=1;
        for (int i=0;i<str.length();i++){
            if(test && str.charAt(i)!=' '){
                counter++;
                test=false;
            }
            if(str.charAt(i)==' '){
                test=true;
            }
        }
        System.out.println("You entered - "+counter+" words");
    }

}
