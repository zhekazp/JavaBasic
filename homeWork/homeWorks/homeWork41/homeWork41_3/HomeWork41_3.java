package homeWorks.homeWork41.homeWork41_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork41_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("homeWork/homeWorks/homeWork41/homeWork41_3/test.csv"));
        String line;
        List<List<String>> list=new ArrayList<>();
        while ((line=br.readLine())!= null){
            String[] elements=line.split(",");
            List<String> tempSList=new ArrayList<>();
            tempSList.addAll(Arrays.asList(elements));
            list.add(tempSList);
        }
        System.out.println(list);
    }
}
