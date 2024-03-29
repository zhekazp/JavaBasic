package homeWorks.homeWork34.classes;

public class MyLinkedList {
    private int size=0;
    private Element firstElement;
    private Element lastElement;
    private String nameOfClass="";

    public void addFirst(Object newObject){
        if(testObjectClass(newObject)){
            if(addIfEmpty(newObject)){
                Element element=new Element(newObject);
                element.setNextElement(firstElement);
                firstElement=element;
                size++;
            }
        }
    }
    public void addLast(Object newObject){
        if(testObjectClass(newObject)){
            if(addIfEmpty(newObject)){
                Element element=new Element(newObject);
                lastElement.setNextElement(element);
                element.setPreviousElement(lastElement);
                lastElement=element;
                size++;
            }
        }
    }
    public void add(Object newObject){
        addLast(newObject);
    }

    public void add(int index,Object newObject){
        if(testObjectClass(newObject)){
            if(index>=0 && index<=size){
                if(size==0){
                    addIfEmpty(newObject);
                }else{
                    if(index==size){
                        addLast(newObject);
                    }else {
                        if(index==0){
                            addFirst(newObject);
                        }else {
                            Element oldElement = getElement(index);
                            Element element = new Element(newObject);
                            element.setPreviousElement(oldElement.getPreviousElement());
                            oldElement.getPreviousElement().setNextElement(element);
                            oldElement.setPreviousElement(element);
                            element.setNextElement(oldElement);
                            size++;
                        }
                    }
                }
            }else{
                System.out.println("Error. Adding is impossible. Wrong index - "+index);
            }
        }
    }
    public void remove(int index){
        if(size>0) {
            if (index >= 0 && index < size) {
                Element tempElement = getElement(index);
                Element next=tempElement.getNextElement();
                Element previous=tempElement.getPreviousElement();
                if(index == 0){
                    firstElement = next;
                    if(size==2){
                        lastElement=firstElement;
                    }
                }
                if(index == size-1){
                    lastElement=previous;
                    if(size==2){
                        firstElement=lastElement;
                    }
                }
                if (previous != null) {
                    previous.setNextElement(tempElement.getNextElement());
                }
                if(next != null) {
                    next.setPreviousElement(tempElement.getPreviousElement());
                }
                size--;
            } else {
                System.out.println("Error. Removing is impossible. Wrong index - "+index);
            }
        }else{
            System.out.println("Error. Removing is impossible. List is empty");
        }
    }
    public Object get(int index){
         if(index<0 || index>=size) {
            System.out.println("Error. Getting is impossible. Index - "+index+" not exist");
            return null;
        }else{
            return getElement(index).getElement();
        }
    }
    //return size of list
    public int size(){
        return size;
    }
    private Element getElement(int index){
        boolean end = firstElement == null;
        Element tempElement=firstElement;
        int currentIndex=0;
        while (!end) {
            if (currentIndex==index) {
                end = true;
            }else {
                tempElement = tempElement.getNextElement();
            }
            currentIndex++;
        }
        return tempElement;
    }
    private boolean addIfEmpty(Object newObject){
        if(size==0){
            addFirstElement(newObject);
            return false;
        }
        return true;
    }
    private void addFirstElement(Object newObject){
        firstElement=new Element(newObject);
        lastElement=firstElement;
        nameOfClass=newObject.getClass().toString();
        size++;
    }
    private boolean testObjectClass(Object newObject){
        if(!nameOfClass.isEmpty() && !nameOfClass.equals(newObject.getClass().toString())){
            System.out.println("Error. The class of object that you want to add is different of first added object.");
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        String str="[";
        Element tempElement=firstElement;
        int currentIndex=0;
        if (tempElement!=null){
            while (tempElement.getNextElement() != null) {
                str +=currentIndex+"->"+ tempElement.getElement().toString();
                if (tempElement != lastElement) {
                    str += ", ";
                }
                tempElement=tempElement.getNextElement();
                currentIndex++;
            }
            str +=currentIndex+"->"+ tempElement.getElement().toString();
        }
        str+="]";
        return str;
    }
}

