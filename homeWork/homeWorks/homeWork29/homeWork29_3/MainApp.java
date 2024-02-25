package homeWorks.homeWork29.homeWork29_3;

import classes.UserInput;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        UserInput ui=new UserInput();
        Map<String,String> dictionary=new HashMap<>();
        dictionary.put("car","das Auto");
        dictionary.put("table","der Tish");
        dictionary.put("wall","die Wand");
        dictionary.put("teacher","der Lehrer");
        dictionary.put("pen","der Stift");

        String word=ui.inputText("Enter english word");

        String translation =dictionary.get(word);
        if(translation!=null) {
            System.out.println("Translation of word - " + word + " is :" + translation);
        }else{
            System.out.println("Dictionary has no word - "+word);
        }
        dictionary.remove("pen");

        System.out.println(dictionary);
    }
}
