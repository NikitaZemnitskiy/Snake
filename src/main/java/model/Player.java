package model;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.List;
import java.util.Scanner;

public class Player {
    int point;
    Snake snake;
    public void SnakeInit(List<PartOfSnake> partOfSnakeList){
        snake = new Snake(partOfSnakeList);
    }
    public void play() throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String inputString = scanner.nextLine();
            switch (inputString){
                case "w": snake.move(Direction.DirectionType.UP);
                break;
                case "s": snake.move(Direction.DirectionType.DOWN);
                break;
                case "a": snake.move(Direction.DirectionType.LEFT);
                    break;
                case "d": snake.move(Direction.DirectionType.RIGHT);
                    break;
                case "x":
                    System.out.println("EXIT");
                    System.exit(0);
            }
        }
    }
}
