package model;

public class Food {
    Point point;
    boolean isEaten = false;
    Food(){
        int x =7;
        int y = 7;
        point = new Point(x,y);
        System.out.println(point);
    }
}
