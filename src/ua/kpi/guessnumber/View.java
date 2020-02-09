package ua.kpi.guessnumber;

import java.util.List;
import java.util.StringJoiner;

import static java.lang.System.out;

public class View {

    public static final String START_GAME_QUESTION = "Guess number between 0 and 100. Input your answer:";
    public static final String WRONG_INPUT_INT = "Wrong input, only integers!";
    public static final String INPUT_INT_DATA = "Guess correct number:";
    public static final String WRONG_RANGE_DATA = "Wrong range of number!";
    public static final String WINNER_TEXT = "And we have a winner! The number is:";

    public void printMessage(String message) {
        out.println(message);
    }

    public void printMessage(String messageFirst, String messageSecond) {
        out.println(messageFirst + " " + messageSecond);
    }

    public void printMessage(String messageFirst, int number) {
        out.println(messageFirst + " " + number);
    }

    public void printLimits(int bottom, int top) {
        printMessage("Current limits: ]" + bottom + "..." + top + "[");
    }

    public void printAllAnswers(List<Integer> failedGuesses) {
        StringBuilder builder = new StringBuilder();
        for (Integer failedGuess : failedGuesses) {
            builder.append(failedGuess).append(" ");
        }
        out.println("Your attempts are: [ " + builder + "]");
    }
}