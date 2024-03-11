package homeWorks.homeWork36.optional;

import java.util.HashSet;
import java.util.Optional;

public class HomeWork36_3 {
    public HashSet<String> getNewSet(HashSet<String> set){
        return transfer(set).orElseGet(HashSet::new);
    }
    public Optional<HashSet<String>> transfer(HashSet<String> set){
        if(set.isEmpty()){
            return Optional.empty();
        }else{
        HashSet<String> set2=new HashSet<>();
        for(String str : set){
            str+="transferred";
            set2.add(str);
        }
        return Optional.of(set2);}
    }
}
