package homeWorks.homeWork36.collections.homeWork36_16;

import java.util.*;

public class HomeWork36_16 {
    public static void main(String[] args) {
        HashMap<String, List<String>> countries=new HashMap<>();
        countries.put("USA",new ArrayList<>(Arrays.asList("Washington","NewYork")));
        countries.put("Ukraine",new ArrayList<>(Arrays.asList("Kiev","Odessa")));
        countries.put("Germany",new ArrayList<>(Arrays.asList("Berlin","Dresden")));

        List<String> countriesName = new ArrayList<>(countries.keySet());
        Collections.sort(countriesName);
        for(String country : countriesName){
            System.out.println(country+" "+countries.get(country));
        }

    }
}
