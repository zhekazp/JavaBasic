package homeWorks.homeWork34.classes;

public class MyLinkedList {
    private int size=0;
    private int currentFreeIndex=0;
    private Element firstElement;
    private Element lastElement;
    private String nameOfClass;

    //Add new Element to list
    public void add(Object newObject){
           if(size == 0){
                addFirst(newObject);
           }else{
               if(testObjectClass(newObject)){
                   addLast(newObject);
               }
           }
    }

    //Add element by index
    public void add(int index,Object newObject){
        {
            if(isIndexCorrect(index)){
                if (size==0){
                    addFirst(newObject);
                }else {
                    if (testObjectClass(newObject)) {
                        if (index == currentFreeIndex) {
                            addLast(newObject);
                        } else {
                            Element newElement=new Element(newObject, index);
                            Element tempElement=getElement(index);
                            newElement.setPreviousElement(tempElement.getPreviousElement());
                            tempElement.getPreviousElement().setNextElement(newElement);
                            newElement.setNextElement(tempElement);
                            tempElement.setPreviousElement(newElement);
                            changeIndexesAfterAdd(newElement);
                            currentFreeIndex++;
                            size++;
                        }
                    }
                }
            }
        }
    }

    //Add first element to list when list is empty
    private void addFirst(Object newObject){
        firstElement=new Element(newObject,currentFreeIndex);
        lastElement=firstElement;
        nameOfClass=newObject.getClass().toString();
        currentFreeIndex++;
        size++;
    }

    //Add last element to list
    private void addLast(Object newObject){
        Element newElement=new Element(newObject, currentFreeIndex);
        newElement.setPreviousElement(lastElement);
        lastElement.setNextElement(newElement);
        lastElement=newElement;
        currentFreeIndex++;
        size++;
    }
    // check if the index is correct for adding
    private boolean isIndexCorrect(int index){
        if(index<0 || index> currentFreeIndex){
            System.out.println("Error. Wrong index");
            return false;
        }
        return true;
    }

    //check if the objects  that added are same
    private boolean testObjectClass(Object newObject){
        if(!nameOfClass.equals(newObject.getClass().toString())){
            System.out.println("Error. The class of object that you want to add is different of first added object.");
            return false;
        }
        return true;
    }

    //return size of list
    public int size(){
        return size;
    }

    //remove element from list by index
    public void remove(int index){
        if(size>0) {
            if (index >= 0 && index < currentFreeIndex) {
                Element tempElement = getElement(index);
                Element next=tempElement.getNextElement();
                Element previous=tempElement.getPreviousElement();
                if(index == 0){
                    firstElement = next;
                }
                if(index == currentFreeIndex-1){
                    lastElement=previous;
                }
                if (previous != null) {
                    previous.setNextElement(tempElement.getNextElement());
                }
                if(next != null) {
                    next.setPreviousElement(tempElement.getPreviousElement());
                }
                changeIndexesAfterRemove(tempElement);
                currentFreeIndex--;
                size--;
            } else {
                System.out.println("Error. Wrong index");
            }
        }else{
            System.out.println("Error. List is empty");
        }
    }

   /* private void changeIndexes(Element element,boolean increase){
        Element tempElement=element;
        while (hasNext(tempElement)){
            if(increase) {
                tempElement.getNextElement().increaseIndex();
            }else{
                tempElement.getNextElement().decreaseIndex();
            }
            tempElement=tempElement.getNextElement();
        }
    }*/

    //Change all indexes after adding of element that stay after added element
    private void changeIndexesAfterAdd(Element element){
        Element tempElement=element;
        while (hasNext(tempElement)){
            tempElement.getNextElement().increaseIndex();
            tempElement=tempElement.getNextElement();
        }
    }

    //Change all indexes after removing of element that stay after removed element
    private void changeIndexesAfterRemove(Element element){
        Element tempElement=element;
        while (hasNext(tempElement)){
            tempElement.getNextElement().decreaseIndex();
            tempElement=tempElement.getNextElement();
        }
    }

    // check if the element has next element
    private boolean hasNext(Element element){
        return element.getNextElement() != null;
    }

    //return element by index
    public Object get(int index){
        if(index<0 || index>=currentFreeIndex) {
            return null;
        }else{
            return getElement(index).getElement();
        }
    }

    // return object by index
    private Element getElement(int index){
        Element tempElement = firstElement;
          boolean end = false;
            if (firstElement == null) {
                end = true;
            }
            while (!end) {
                if (tempElement.getIndex()==index) {
                    end = true;
                }else {
                    tempElement = tempElement.getNextElement();
                }
            }
        return tempElement;
    }

    @Override
    public String toString() {
        String str="[";
        Element tempElement=firstElement;
        if (tempElement!=null){
            while (hasNext(tempElement)) {
                str +=tempElement.getIndex()+"->"+ tempElement.getElement().toString();
                if (tempElement != lastElement) {
                    str += ", ";
                }
                tempElement=tempElement.getNextElement();
            }
            str +=tempElement.getIndex()+"->"+ tempElement.getElement().toString();
        }
        str+="]";
        return str;
    }
}

