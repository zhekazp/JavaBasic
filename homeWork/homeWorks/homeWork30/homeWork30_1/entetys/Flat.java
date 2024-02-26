package homeWorks.homeWork30.homeWork30_1.entetys;

public class Flat {
    private int rooms;
    private int square;

    public Flat(int rooms, int square) {
        this.rooms = rooms;
        this.square = square;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "rooms=" + rooms +
                ", square=" + square +
                '}';
    }
}
