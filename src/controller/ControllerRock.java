package controller;

import model.Ball;
import model.Rock;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerRock implements ControllerInterface {

    private ArrayList<Rock> rocks;

    public ControllerRock() {
        rocks = new ArrayList<>();
        this.load();
    }

    @Override
    public void afisare() {
        for (Rock x : rocks) {
            System.out.println(x.toString());
        }
    }

    @Override
    public void load() {
        try {
            File file = new File("C:\\Users\\flore\\Desktop\\mycode\\exempluInterfata3\\src\\res\\rock.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                Rock x = new Rock(text);
                this.rocks.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void moveLeft() {
        System.out.println("Rock moved to the left");
    }

    @Override
    public void moveRigh() {
        System.out.println("Rock moved to the right");
    }

    @Override
    public void moveUp() {
        System.out.println("Rock moved up");
    }

    @Override
    public void moveDown() {
        System.out.println("Rock moved down");

    }
}
