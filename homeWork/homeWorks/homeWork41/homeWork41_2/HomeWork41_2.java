package homeWorks.homeWork41.homeWork41_2;

import java.io.*;

public class HomeWork41_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("homeWork/homeWorks/homeWork41/homeWork41_1/text.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("homeWork/homeWorks/homeWork41/homeWork41_2/text.txt"));
        String line;
        while ((line=br.readLine())!= null){
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
