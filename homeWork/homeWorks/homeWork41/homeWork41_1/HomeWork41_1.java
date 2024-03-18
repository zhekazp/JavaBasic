package homeWorks.homeWork41.homeWork41_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork41_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("homeWork/homeWorks/homeWork41/homeWork41_1/text.txt"));
        String line;
        while ((line=br.readLine())!= null){
            System.out.println(line);
        }
    }

}
