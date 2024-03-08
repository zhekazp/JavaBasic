package homeWorks.homeWork36.collections.homeWork36_13;

import java.util.TreeSet;

public class homeWork36_13 {
    public static void main(String[] args) {
        TreeSet<Point> set=new TreeSet<>();
        set.add(new Point(4,7));
        set.add(new Point(7,4));
        set.add(new Point(14,70));
        set.add(new Point(400,7));
        System.out.println(set);
        for(Point point : set){
            if(point.x> point.y){
                System.out.println(point);
            }
        }
    }
    static class Point implements Comparable<Point>{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        @Override
        public int compareTo(Point o) {
            return (y-x)-(o.y-o.x);
        }
    }
}
