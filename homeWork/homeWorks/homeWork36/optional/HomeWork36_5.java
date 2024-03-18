package homeWorks.homeWork36.optional;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;

public class HomeWork36_5 {
    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<>();
        list.add("someString");
        Optional<String> str=list.stream().findFirst();

        System.out.println(str.orElseThrow(()->new NoSuchElementException("List is empty")));
        System.out.println(getDouble(null));
    }

    static Optional<Integer> getDouble(Integer number){
        if(number==null){
            throw new IllegalArgumentException("Bad data");
        }
        return Optional.of(number*2);
    }

}
