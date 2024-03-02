package homeWorks.homeWork34.classes;

public class Element {
    private Object element;
    private Element nextElement;
    private Element previousElement;
    int index;

    public Element(Object element, int index) {
        this.element = element;
        this.index = index;
    }

    public Object getElement() {
        return element;
    }

    public Element getNextElement() {
        return nextElement;
    }

    public int getIndex() {
        return index;
    }

    public Element getPreviousElement() {
        return previousElement;
    }

    public void increaseIndex(){
        index++;
    }
    public void decreaseIndex(){
        index--;
    }

    public void setPreviousElement(Element previousElement) {
        this.previousElement = previousElement;
    }

    public void setNextElement(Element nextElement) {
        this.nextElement = nextElement;
    }
}
