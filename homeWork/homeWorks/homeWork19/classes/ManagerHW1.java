package homeWorks.homeWork19.classes;

public class ManagerHW1 {
    public String[] newArray(int elementsCount){
        String[] newString=new String[elementsCount];
        for (int i=0;i<newString.length;i++){
            newString[i]="string"+i;
        }
        return newString;
    }
    public void changeElements(String[] str){
        String temp;
        int counter=str.length-1;
        for (int i=0;i<str.length/2;i++){
            temp=str[i];
            str[i]=str[counter];
            str[counter]=temp;
            counter--;
        }
    }
}
