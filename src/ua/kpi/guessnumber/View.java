package ua.kpi.guessnumber;

import static java.lang.System.out;

public class View {
    // Text's constants
    public static final String INPUT_FIRST_WORD = "Input first string: \"Hello\"";
    public static final String WRONG_FIRST_WORD = "Wrong input! We need to see single word \"Hello\"! ";
    public static final String INPUT_FINAL_STRING = "Input final string: \"Java!\"";
    public static final String WRONG_FINAL_STRING = "Wrong input! We need to see 2nd string \"Java\" with \"!\" ";
    public static final String OUTPUT_MESSAGE = "The whole sentence is: ";

    public void printMessage(String message) {
        out.println(message);
    }

    public void printFinalMessage(String outputMessage, String inputedSting) {
        out.println(outputMessage + inputedSting);
    }
}