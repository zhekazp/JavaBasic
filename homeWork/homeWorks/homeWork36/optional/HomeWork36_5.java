package homeWorks.homeWork36.optional;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class HomeWork36_5 {
    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<>();
        //String first=getFirst(list).orElseThrow(NoSuchElementException::new);

    }
    static Optional<String> getFirst(ArrayList<String> list){
        if(list.getFirst()!=null){
            return Optional.of(list.getFirst());
        }    else{
            return Optional.of("");
        }
    }
}
