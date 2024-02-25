package homeWorks.homeWork29.homeWork29_4.services;

import java.util.Map;

public class ServiceHW29_4 {
    public static String getMax(Map<String,Integer> map){
        String name="";
        int max=0;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if (max < entry.getValue()){
                max=entry.getValue();
                name=entry.getKey();
            }
        }
        return name;
    }
}
