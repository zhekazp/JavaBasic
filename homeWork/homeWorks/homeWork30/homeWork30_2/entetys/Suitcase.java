package homeWorks.homeWork30.homeWork30_2.entetys;

public class Suitcase implements Comparable<Suitcase> {
   private Size size;
   private Color color;
    private  Materiel materiel;

    public Suitcase(Size size, Color color, Materiel materiel) {
        this.size = size;
        this.color = color;
        this.materiel = materiel;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    @Override
    public String toString() {
        return "Suitcase{" +
                "size=" + size +
                ", color=" + color +
                ", materiel=" + materiel +
                '}';
    }

    @Override
    public int compareTo(Suitcase o) {
       int result= size.compareTo(o.getSize());
       if(result==0){
           result= materiel.compareTo(o.getMateriel());
       }
        if(result==0){
            result= color.compareTo(o.getColor());
        }
        return result;
    }
}
