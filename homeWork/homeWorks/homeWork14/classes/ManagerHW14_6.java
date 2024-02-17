package homeWorks.homeWork14.classes;

import java.util.Arrays;

public class ManagerHW14_6 {
    private boolean[] isEven;
    private int getEvenCount(String[] str){
        int counter=0;
        isEven=new boolean [str.length];
        for (int i=0;i<str.length;i++){
           if(str[i].length()%2 == 0){
               counter++;
               isEven[i]=true;
           }
        }
        return counter;
    }
    public String[] createEvenStringArray(String[] str){
        String[] newstr=new String[getEvenCount(str)];
        int index=0;
        for (int i=0;i<isEven.length;i++){
            if(isEven[i]){
                newstr[index]=str[i];
                index++;
            }
        }
        return newstr;
    }
    public String[] createOddStringArray(String[] str){
        String[] newstr=new String[str.length-getEvenCount(str)];
        int index=0;
       for (int i=0;i<isEven.length;i++){
            if(!isEven[i]){
                newstr[index]=str[i];
                index++;
            }
        }
        return newstr;
    }
}
