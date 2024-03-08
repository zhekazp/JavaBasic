package homeWorks.homeWork36.generic.homeWork36_6;

public class Optional <T>{
    private T object;

    public Optional(T object) {
        this.object = object;
    }
    public boolean isPresent(){
        return object != null;
    }
    public T get(){
        return object;
    }
    public T orElse(T obj){
        return object != null?object:obj;
    }
}
