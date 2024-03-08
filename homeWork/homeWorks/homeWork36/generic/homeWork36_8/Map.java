package homeWorks.homeWork36.generic.homeWork36_8;

import java.util.ArrayList;

public class Map<K,V> {
    private ArrayList<K> key;
    private ArrayList<V> value;

    public Map() {
        this.key = new ArrayList<>();
        this.value = new ArrayList<>();
    }
    public void put(K key,V value){
        int index=this.key.indexOf(key);
        if(index==-1){
            this.key.add(key);
            this.value.add(value);
        }else{
            this.key.add(index,key);
            this.value.add(index,value);
        }
    }
    public V get(K key){
        int index=this.key.indexOf(key);
        if(index==-1){
            return null;
        }else{
            return value.get(index);
        }
    }
    public void remove(K key){
        int index=this.key.indexOf(key);
        value.remove(index);
    }
}
