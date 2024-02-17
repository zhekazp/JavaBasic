package homeWorks.homeWork21.homeWork21_9.entitys;

abstract public class NavigationSystem {
    String name;

    public NavigationSystem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void startNavigation();
    abstract void stopNavigation();
}
