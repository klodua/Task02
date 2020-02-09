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

    public void gameIsOn(){

//        view.printMessage(View.START_GAME_QUESTION);
        model.setLimits(BOTTOM_LIMIT, TOP_LIMIT);
        model.rollRandomNumber();
//        view.printLimits(model.getLimitBottom(), model.getLimitTop());

        int guessedNumber = guessNumber();
//        view.printGuessedNumber(guessedNumber);
//        view.printAllAnswers(model.getAnswers());
//
//
//        view.printIntAndString(View.INPUTED_INT, 45);
    }

    public int guessNumber() {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        do {
//            answer = inputIntValue(scanner);
//            tryToGuess(answer);
            answer= inputIntValueWithScannerAndDiapason(scanner);
        } while (!model.isNumberGuessed());
        return answer;
    }

      public int inputIntValueWithScannerAndDiapason(Scanner sc) {
          view.printLimits(model.getLimitBottom(), model.getLimitTop());
        int res=0;
        view.printMessage(view.INPUT_INT_DATA
               );

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printLimits(model.getLimitBottom(), model.getLimitTop());
                view.printMessage(view.WRONG_INPUT_INT, view.INPUT_INT_DATA);
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) <= model.getLimitBottom() ||
                    res >= model.getLimitTop()) {
                view.printLimits(model.getLimitBottom(), model.getLimitTop());
                view.printMessage(view.WRONG_RANGE_DATA,
                        View.INPUT_INT_DATA);
                continue ;
            }
            break;
        }
        return res;
    }
}