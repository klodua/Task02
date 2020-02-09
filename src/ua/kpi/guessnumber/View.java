package ua.kpi.guessnumber;

import static java.lang.System.out;

public class View {
    // Text's constants
    public static final String START_GAME_QUESTION = "Guess number between 0 and 100. Input your answer:";
    public static final String WRONG_INPUT_INT = "Wrong input, only integers!";
    public static final String INPUTED_INT = "You inputed: ";
    public static final String INPUT_INT_DATA = "Guess correct number: ";
    public static final String WRONG_RANGE_DATA = "Wrong range of number!";


    //

//    public static final String INPUT_FINAL_STRING = "Input final string: \"Java!\"";
//    public static final String WRONG_FINAL_STRING = "Wrong input! We need to see 2nd string \"Java\" with \"!\" ";
//    public static final String OUTPUT_MESSAGE = "The whole sentence is: ";
////
//    public static final String INPUT_FIRST_WORD = "The whole sentence is: ";
//    public static final String WRONG_FIRST_WORD = "Wrong input! We need to see single word \"Hello\"! ";




    public void printMessage(String message) {
        out.println(message);
    }
    public void printMessage(String messageFirst,String messageSecond) {
        out.println(messageFirst +" " + messageSecond);
    }

    public void printFinalMessage(String outputMessage, String inputedSting) {
        out.println(outputMessage + inputedSting);
    }

    public void printIntAndString(String outputMessage, int inputedSting) {
        out.println(outputMessage + inputedSting);
    }
    public void printLimits(int bottom, int top) {
        printMessage("Current limits: ]"+bottom+"..."+top+"[");
    }
}