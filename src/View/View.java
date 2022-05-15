package View;

import controller.ControllerInterface;

import java.util.Scanner;

public class View {
    private ControllerInterface controllerInterface;
    private Scanner scanner;

    public View(ControllerInterface controllerInterface) {
        this.controllerInterface = controllerInterface;
        this.scanner = new Scanner(System.in);
    }

    public ControllerInterface getControllerInterface() {
        return controllerInterface;
    }

    public void setControllerInterface(ControllerInterface controllerInterface) {
        this.controllerInterface = controllerInterface;
    }

    public void meniu() {
        System.out.println("===================Welcome===================");
        System.out.println("1.Move Left");
        System.out.println("2.Move Right");
        System.out.println("3.Move Up");
        System.out.println("4.Move Down");
        System.out.println("5.Afisare");
        System.out.println("6.Exit");
    }

    public void play() {
        boolean running = true;
        int alege;
        while (running) {
            meniu();
            alege = Integer.parseInt(scanner.nextLine());
            switch (alege) {
                case 1:
                    controllerInterface.moveLeft();
                    break;
                case 2:
                    controllerInterface.moveRigh();
                    break;
                case 3:
                    controllerInterface.moveUp();
                    break;
                case 4:
                    controllerInterface.moveDown();
                    break;
                case 5:
                    controllerInterface.afisare();
                    break;
                case 6:
                    running = false;
                    break;

            }

        }
    }
}
