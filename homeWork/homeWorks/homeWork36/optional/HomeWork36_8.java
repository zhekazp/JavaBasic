package homeWorks.homeWork36.optional;

import java.util.HashSet;
import java.util.Optional;

public class HomeWork36_8 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        GetAddString get=(str1,str2)->{
            return str1+str2;
        };

        System.out.println(change(get,set,"new"));
    }

   public static Optional<HashSet<String>> change(GetAddString getStr, HashSet<String> set, String str2){
       if(set.isEmpty()){
           return Optional.of(new HashSet<String>());
       }else {
           HashSet<String> newSet=new HashSet<>();
           for (String tempStr : set) {
                newSet.add(getStr.get(tempStr,str2));
           }
           return Optional.of(newSet);
       }
    }


}
