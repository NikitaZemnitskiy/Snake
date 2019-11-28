package model;

import java.util.ArrayList;
import java.util.List;

public class Main {
   static Board board;
    public static void main(String[] args) throws Exception {
        List<PartOfSnake> startSnake = new ArrayList<>();
        startSnake.add(new PartOfSnake(new Point(5, 5)));
        startSnake.add(new PartOfSnake(new Point(5, 6)));
        startSnake.add(new PartOfSnake(new Point(5, 7)));
        Player player = new Player();
        player.SnakeInit(startSnake);
        board = new Board(10, 10, player.snake);
        board.boardBuilder();
        player.play();
    }
}
