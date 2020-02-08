package ua.kpi.guessnumber;

import java.util.Scanner;

public class Controller {

    public static final String HELLO = "Hello";
    public static final String JAVA = "Java!";
    public static final String BLANK_SPACE = " ";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view  = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        model.setInputedString(
                inputString(scanner,
                        View.INPUT_FIRST_WORD,
                        HELLO,
                        View.WRONG_FIRST_WORD));
        model.addValue(BLANK_SPACE);
        model.addValue(
                inputString(scanner,
                        View.INPUT_FINAL_STRING,
                        JAVA,
                        View.WRONG_FINAL_STRING));

        view.printFinalMessage(View.OUTPUT_MESSAGE, model.getInputedString());
    }

    public String inputString(Scanner scanner, String printMessage,
                              String stringForPass, String errorMessage) {
        view.printMessage(printMessage);
        String inputedString = scanner.next();

        while (!inputedString.equals(stringForPass)) {
            view.printMessage(errorMessage);
            inputedString = scanner.next();
        }
        return inputedString;
    }
}