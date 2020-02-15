package ua.klodco.guessnumber;

public class Main {

    public static void main(String[] args) {
//        Model model = new Model();
//        View view = new View();
        Controller controller = new Controller(new Model(), new View());
        controller.gameIsOn();
    }
}