package homeWorks.homeWork21.homeWork21_3.services;

import homeWorks.homeWork21.homeWork21_3.entity.SystemConfiguration;

import java.util.Arrays;

public class ServiceHW21_3 {
    SystemConfiguration systemConfiguration=new SystemConfiguration();
    private String[] levels={"ERROR","INFO","WARN"};
    public void printSystemConfigurationInfo(){
        System.out.println("Log level is: "+systemConfiguration.getLevel());
        System.out.println();
        System.out.println("Path :"+systemConfiguration.getPath());
    }
    public void changePath(String newPath){
        if(checkPath(newPath)){
            systemConfiguration.setPath(newPath);
            System.out.println("New path saved");
        }
    }
    private boolean checkPath(String path){
        if (path.charAt(path.length()-1)!='\\'){
            System.out.println("Wrong path");
            return false;
        }else{
            return true;
        }
    }
    public void changeLevel(String newLevel){
        if(checkLevel(newLevel)){
            systemConfiguration.setLevel(newLevel);
            System.out.println("Level saved");
        }
    }
    private boolean checkLevel(String level){
        if(levelExist(level)){
            return true;
        }else{
            System.out.println("Wrong level");
            return false;
        }
    }
    private boolean levelExist(String level){
        for(int i=0;i<levels.length;i++){
            if(levels[i].equals(level)){
                return true;
            }
        }
        return false;
    }
}
