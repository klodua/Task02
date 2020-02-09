package ua.kpi.guessnumber;

import java.util.Scanner;

import static ua.kpi.guessnumber.Constants.BOTTOM_LIMIT;
import static ua.kpi.guessnumber.Constants.TOP_LIMIT;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view  = view;
    }

    public void processUser(){

        view.printMessage(View.START_GAME_QUESTION);
        model.setLimits(BOTTOM_LIMIT, TOP_LIMIT);
        model.rollRandomNumber();

        int guessedNumber = guessNumber();
        view.printGuessedNumber(guessedNumber);
        view.printAllAnswers(model.getAnswers());
//
//        Scanner sc = new Scanner(System.in);
//        int bott = 1;
//        int top = 2;
//        model.setInpunedInt(inputIntValueWithScannerAndDiapason(sc));
//        System.out.println("bottom line: "+model.getLimitBottom());
//        System.out.println("top line: "+ model.getLimitTop());
////        model.addIntOurValue(FOUR);
//
//        view.printIntAndString(View.INPUTED_INT, 45);
    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.START_GAME_QUESTION);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT + View.START_GAME_QUESTION);
            sc.next();
        }
        return sc.nextInt();
    }


      public int inputIntValueWithScannerAndDiapason(Scanner sc) {
        int res=0;
        view.printMessage(view.INPUT_INT_DATA +
                model.getLimitBottom() + model.getLimitTop());

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(view.WRONG_INPUT_INT
                        + view.INPUT_INT_DATA);
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) <= model.getLimitBottom() ||
                    res >= model.getLimitTop()) {
                view.printMessage(view.WRONG_RANGE_DATA
                        + View.INPUT_INT_DATA);
                continue ;
            }
            break;
        }
        return res;
    }
}