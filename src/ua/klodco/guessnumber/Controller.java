package ua.klodco.guessnumber;

import java.util.Scanner;

import static ua.klodco.guessnumber.Constants.BOTTOM_LIMIT;
import static ua.klodco.guessnumber.Constants.TOP_LIMIT;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void gameIsOn() {

        model.setLimits(BOTTOM_LIMIT, TOP_LIMIT);
        model.rollRandomNumber();
        int guessedNumber = guessNumber();
        view.printMessage(View.WINNER_TEXT, guessedNumber);
        view.printAllAnswers(model.getFailedGuesses());
    }

    public int guessNumber() {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            answer = inputWithCheckingValueAndDiapason(scanner);
        } while (!model.isNumberGuessed());
        return answer;
    }

    public int inputWithCheckingValueAndDiapason(Scanner scanner) {
        view.printLimits(model.getLimitBottom(), model.getLimitTop());
        int result;
        view.printMessage(View.INPUT_INT_DATA);

        while (true) {
            // check int - value
            while (!scanner.hasNextInt()) {
                view.printLimits(model.getLimitBottom(), model.getLimitTop());
                view.printMessage(View.WRONG_INPUT_INT, View.INPUT_INT_DATA);
                scanner.next();
            }
            // check value in diapason
            if ((result = scanner.nextInt()) <= model.getLimitBottom() ||
                    result >= model.getLimitTop()) {
                view.printLimits(model.getLimitBottom(), model.getLimitTop());
                view.printMessage(View.WRONG_RANGE_DATA, View.INPUT_INT_DATA);
                continue;
            } else {
                model.attemptToGuess(result);

            }
            break;
        }
        return result;
    }
}