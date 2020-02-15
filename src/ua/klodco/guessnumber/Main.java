package ua.klodco.guessnumber;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.gameIsOn();
    }
}