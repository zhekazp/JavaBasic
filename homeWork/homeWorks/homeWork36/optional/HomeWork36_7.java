package homeWorks.homeWork36.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HomeWork36_7 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);
        System.out.println(getMax(map));
    }
    public static Optional<Integer> getMax(HashMap<Integer,Integer> map){
        if(map.isEmpty()){
            return Optional.empty();
        }else{
            int max=0;
            for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
                if (entry.getKey() > max) {
                    max = entry.getKey();
                }
            }
            return Optional.of(max);
        }
    }
}
