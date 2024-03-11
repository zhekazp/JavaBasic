package homeWorks.homeWork36.optional;

import java.util.HashMap;
import java.util.Optional;

public class HomeWork36_2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,5);
        map.put(1,7);
        map.put(2,3);
        System.out.println(getMax(map));
    }
    public static Optional<Integer> getMax(HashMap<Integer,Integer> map){
        if(map.isEmpty()){
            return Optional.empty();
        }
        else{
            int max=0;
            for(Integer n: map.values()){
                if(max<n){
                    max=n;
                }
            }
            return Optional.of(max);
        }
    }
}
