package homeWorks.homeWork9;

import classes.UserInput;

public class HomeWork9_4 {
    public static void main(String[] args) {
        UserInput ui= new UserInput();
        int assessment=(int)(Math.random()*12+1);
        int maxTime=ui.inputInt("Enter time in minutes - how much can you kid watch TV everyday.");
        int lastTime=ui.inputInt("Enter last time for today");

        switch (assessment){
            case 1:
            case 2:
                lastTime=0;
                break;
            case 3:
                if (lastTime>30) {
                    lastTime=-30;} else {
                    lastTime=0;
                }
                break;
            case 4:
            case 5:
            case 6:
                if (lastTime+15<maxTime) {
                    lastTime=+15;}else{
                    lastTime=maxTime;
                }
                break;
            case 7:
            case 8:
            case 9:
                if (lastTime+45<maxTime) {
                    lastTime=+30;} else {
                    lastTime=maxTime;
                }
                break;
            case 10:
            case 11:
            case 12:
                if (lastTime+60<maxTime) {
                    lastTime=+60;} else {
                    lastTime=maxTime;
                }
                break;
        }
        System.out.println("You have in school today - "+assessment);
        System.out.println("So, you can watch TV - "+lastTime+" minutes");
    }
}
