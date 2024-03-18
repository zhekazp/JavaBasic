package homeWorks.homeWork41.homeWork41_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork41_4 {
    public static void main(String[] args) throws IOException {
        FileInputStream f1=new FileInputStream("homeWork/homeWorks/homeWork41/homeWork41_1/text.txt");
        FileOutputStream f2=new FileOutputStream("homeWork/homeWorks/homeWork41/homeWork41_4/text.txt");
        byte[] file=new byte[1024];
        int length;
        while ((length=f1.read(file))!=-1){
            f2.write(file,0,length);
        }

    }
}
