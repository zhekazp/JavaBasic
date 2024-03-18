package homeWorks.homeWork36.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HomeWork36_9 {
    public static void main(String[] args) {
        List<Cat> cats=new ArrayList<>();
        cats.add(new Cat("cat1"));
        cats.add(new Cat("SuperCat"));

        CheckCat checkCat=(cat)->{
          return cat.getName().length()>4;
        };
        System.out.println(getCat(checkCat,cats));
    }
   static interface CheckCat{
        boolean check(Cat cat);
   }
     static Optional<Cat> getCat(CheckCat checkCat,List<Cat> cats){
        for (Cat cat : cats){
            if(checkCat.check(cat)){
                return Optional.of(cat);
            }
        }
        return Optional.empty();
    }
    static class Cat{
        String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
