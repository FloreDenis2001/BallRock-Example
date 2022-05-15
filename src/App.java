import View.View;
import controller.ControllerBall;
import controller.ControllerInterface;
import controller.ControllerRock;

public class App {
    public static void main(String[] args) {
        ControllerBall controllerBall=new ControllerBall();
        ControllerRock controllerRock=new ControllerRock();

        View view = new View(controllerRock);
        view.play();
        view.setControllerInterface(controllerRock);
        view.play();

    }
}
