package homeWorks.homeWork33.homeWork33_3;

import homeWorks.homeWork33.homeWork33_3.services.TourCollection;

public class MainApp {
    public static void main(String[] args) {
        TourCollection tasks = new TourCollection(5);
        tasks.addRequest("Turkiye");
        tasks.addRequest("England");
        tasks.addRequest("USA");
        tasks.addRequest("Egypt");
        tasks.addRequest("Hungary");
        tasks.addRequest("Greece");

        tasks.processRequest();

        tasks.getQueueSize();
        tasks.addRequest("Greece");
    }
}
