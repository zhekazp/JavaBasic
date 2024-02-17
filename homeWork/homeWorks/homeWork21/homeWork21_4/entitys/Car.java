package homeWorks.homeWork21.homeWork21_4.entitys;

public class Car extends Vehicle{
    int doorsQuantity;
    public Car( String model, int doorsQuantity) {
        super( 4,model);
        this.doorsQuantity=doorsQuantity;
    }
    public void printDoorsQuantity(){
        System.out.println(super.getModel()+" has "+doorsQuantity+" doors");
        System.out.println();
    }
    @Override
    public void speedUp() {
        super.setCurrentSpeed(super.getCurrentSpeed()+10);
    }

    @Override
    public void speedBreak() {
        if(super.getCurrentSpeed()-10>0) {
            super.setCurrentSpeed(super.getCurrentSpeed() - 10);
        }else{
            super.setCurrentSpeed(0);
        }
    }
}
