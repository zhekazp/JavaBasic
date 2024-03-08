package homeWorks.homeWork36.generic.homeWork36_3;

public class Find<T extends Number> {
    public T findMax(T[] array){
        T temp=array[0];
        for(T obj : array){
            if(temp.doubleValue()>obj.doubleValue()){
                temp=obj;
            }
        }
        return temp;
    }
}
