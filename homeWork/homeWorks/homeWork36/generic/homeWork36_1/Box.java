package homeWorks.homeWork36.generic.homeWork36_1;

import java.util.List;

public class Box<T> {
    private  T object;
    public void put(T obj){
        object=obj;
    }
    public T get(){
        return object;
    }
    public void printList(List<T> list){
        for(T obj : list){
            System.out.println(obj);
        }
    }
}
