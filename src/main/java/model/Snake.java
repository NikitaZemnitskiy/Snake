package model;

import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;

public class Snake {
    PartOfSnake header;
    public List<PartOfSnake> snakeList = new ArrayList<PartOfSnake>();

    public Snake(List<PartOfSnake> snakeList) {
        this.snakeList = snakeList;
        header = snakeList.get(0);
    }
    public List<Point> getPointsOfSnake(){
        List<Point> pointList = new ArrayList<>();
        for (PartOfSnake partOfSnake: snakeList){
          pointList.add(partOfSnake.point);
        }
        return pointList;
    }

    public void move(Direction.DirectionType directionType) throws Exception {

        switch (directionType){
            case UP: snakeList.get(snakeList.size()-1);
                snakeList.add(0, new PartOfSnake(new Point(header.point.getX()-1, header.point.getY())));            break;

            case DOWN: snakeList.get(snakeList.size()-1);
                snakeList.add(0, new PartOfSnake(new Point(header.point.getX()+1, header.point.getY())));
                break;

            case RIGHT: snakeList.get(snakeList.size()-1);
                snakeList.add(0, new PartOfSnake(new Point(header.point.getX(), header.point.getY()+1)));
                break;

            case LEFT: snakeList.get(snakeList.size()-1);
                snakeList.add(0, new PartOfSnake(new Point(header.point.getX(), header.point.getY()-1)));
                break;
            default: throw new Exception("Snake incorrect direction");

        }
        header = snakeList.get(0);
        if (header.point.getX() == 0 ||
                header.point.getY() == 0 ||
                header.point.getX() == Main.board.weight ||
                header.point.getY() == Main.board.height ){
            System.out.println("You are die(");
            System.exit(0);
        }
        if (header.point != Main.board.currentFood.point){
            snakeList.remove(snakeList.get(snakeList.size()-1));
        }
        else {
            Main.board.currentFood.isEaten = true;
        }

        Main.board.boardBuilder();



    }
}
