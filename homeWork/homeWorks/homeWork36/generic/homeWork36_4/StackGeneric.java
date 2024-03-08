package homeWorks.homeWork36.generic.homeWork36_4;

import java.util.List;

public class StackGeneric<T> {
    private List<T> stack;
    public void push(T obj){
        stack.add(obj);
    }
    public T peak(){
        return stack.getLast();
    }
    public T pop(){
        T temp=stack.getLast();
        stack.removeLast();
        return temp;
    }
}
