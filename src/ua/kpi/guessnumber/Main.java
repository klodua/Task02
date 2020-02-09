package ua.kpi.guessnumber;

import java.util.Scanner;

import static ua.kpi.guessnumber.View.START_GAME_QUESTION;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);
//        int asd = model.rollRandomNumber();
//        System.out.println(asd);
        controller.gameIsOn();



//        int tryGuess = controller.inputIntValueWithScanner();

        /*System.out.println(START_GAME_QUESTION);
        Scanner sc = new Scanner(System.in);
        int tryGuess = sc.nextInt();
        if (tryGuess==asd){
            System.out.println("Your are the winner");
        }else {


        }*/

        // Initialization
//        Model model = new Model();
//        View view = new View();
//        Controller controller = new Controller(model, view);
//        // Run
//        controller.processUser();
    }
}