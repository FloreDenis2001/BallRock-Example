package controller;

import model.Ball;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerBall implements ControllerInterface {
    private ArrayList<Ball> balls;

    public ControllerBall() {
        balls = new ArrayList<>();
        this.load();
    }

    @Override
    public void afisare() {
        for (Ball x : balls) {
            System.out.println(x.toString());
        }
    }

    @Override
    public void load() {
        try {
            File file = new File("C:\\Users\\flore\\Desktop\\mycode\\exempluInterfata3\\src\\res\\balls.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                Ball x = new Ball(text);
                this.balls.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void moveLeft() {
        System.out.println("Ball moved to the left");
    }

    @Override
    public void moveRigh() {
        System.out.println("Ball moved to the right");
    }

    @Override
    public void moveUp() {
        System.out.println("Ball moved up");
    }

    @Override
    public void moveDown() {
        System.out.println("Ball moved down");

    }
}
