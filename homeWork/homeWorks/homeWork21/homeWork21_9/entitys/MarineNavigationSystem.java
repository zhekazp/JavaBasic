package homeWorks.homeWork21.homeWork21_9.entitys;

public class MarineNavigationSystem extends NavigationSystem{

    public MarineNavigationSystem(String name) {
        super(name);
    }

    @Override
    public void startNavigation() {
        System.out.println(super.name+" started navigation.");
    }

    @Override
    public void stopNavigation() {
        System.out.println(super.name+" stopped navigation.");
    }
}
