package homeWork9.classes;

public class UtilHW_5 {
    public boolean isdigit(char a){
        if((int)a>47 & (int)a<58){
            return true;
        }else{
            return false;
        }
    }
    public boolean getLucky(String num){
        int firstSum=getInt(num.charAt(0))+getInt(num.charAt(1));
        int secondSum=getInt(num.charAt(2))+getInt(num.charAt(3));
        if (firstSum==secondSum){
            return true;
        }else{
            return false;
        }
    }
    public int getInt(char a){
        return (int) a-48;
    }
}
