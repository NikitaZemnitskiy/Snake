package model;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Board {
    int height;
    int weight;
    Snake snake;
    Food currentFood;
    public Board(int height, int weight, Snake snake) {
        this.height = height;
        this.weight = weight;
        this.snake = snake;
        currentFood = new Food();

    }
    public void boardBuilder (){
        List<Point> fillPoint = new ArrayList<Point>();
        for (int i = 0; i<height; i++){
            fillPoint.add(new Point(0,i));
            fillPoint.add(new Point(weight,i));
        }
        for (int i = 0; i<weight; i++){
            fillPoint.add(new Point(i,0));
            fillPoint.add(new Point(i,height));
        }
       for (Point point: snake.getPointsOfSnake()){
           fillPoint.add(point);
       }
       fillPoint.add(currentFood.point);
       for(int k = 0; k<=height; k++) {
           String currentString = "";
           for (int i = 0; i <= weight; i++) {
               if (fillPoint.contains(new Point(k,i))){
                   currentString = currentString.concat("#");
           }
               else {
                  currentString = currentString.concat(" ");
               }
       }
           System.out.println(currentString);
       }
        if (currentFood.isEaten = true){
            currentFood = new Food();
        }
    }

}
