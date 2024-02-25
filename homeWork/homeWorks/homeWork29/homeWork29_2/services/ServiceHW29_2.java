package homeWorks.homeWork29.homeWork29_2.services;

import java.util.Collections;
import java.util.LinkedList;

public class ServiceHW29_2 {
    private LinkedList<Integer> list;
    private int max;
    private int min;

    public ServiceHW29_2(int size) {
        generateNewList(size);
    }
    public LinkedList<Integer> generateNewList(int size){
        LinkedList<Integer> newList =new LinkedList<>();
        for (int i=0;i<size;i++){
            newList.add((int)(Math.random()*100)+1);
        }
        list=newList;
        findMaxMin();
        return newList;
    }
    public void sortList(){
        //Collections.sort(list);
        int currentIndex=list.size();
        while (currentIndex>0){
            for(int i=0;i<currentIndex-1;i++){
                int currentElement=list.get(i);
                int nextElement=list.get(i+1);
                if(currentElement > nextElement){
                    list.set(i,nextElement);
                    list.set(i+1,currentElement);
                }
            }
            currentIndex--;
        }
    }
    private void findMaxMin(){
        min=list.getFirst();
        max=list.getFirst();
        for (int i=1;i<list.size();i++){
            int currentElement=list.get(i);
            if(currentElement>max){
                max=list.get(i);
            } else{
                if(currentElement<min){
                    min=list.get(i);
                }
            }
        }
    }

    public LinkedList<Integer> getList() {
        return list;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

}
