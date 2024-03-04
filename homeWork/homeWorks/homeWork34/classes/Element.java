package homeWorks.homeWork34.classes;

public class Element {
    private Object element;
    private Element nextElement;
    private Element previousElement;

    public Element(Object element) {
        this.element = element;
    }

    public Object getElement() {
        return element;
    }

    public Element getNextElement() {
        return nextElement;
    }

    public Element getPreviousElement() {
        return previousElement;
    }

    public void setPreviousElement(Element previousElement) {
        this.previousElement = previousElement;
    }

    public void setNextElement(Element nextElement) {
        this.nextElement = nextElement;
    }
}
