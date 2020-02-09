package ua.kpi.guessnumber;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Scanner;

public class Model {

    private int limitBottom;
    private int limitTop;
    private int randomInteger;
    private final List<Integer> failedGuesses = new ArrayList<>();

    public int getLimitBottom() {
        return limitBottom;
    }

    public void setLimitBottom(int limitBottom) {
        this.limitBottom = limitBottom;
    }

    public int getLimitTop() {
        return limitTop;
    }

    public void setLimitTop(int limitTop) {
        this.limitTop = limitTop;
    }

    public void rollRandomNumber() {
        randomInteger = new Random().nextInt(limitTop-limitBottom) + limitBottom;
    }

    public void setLimits(int limitBottom, int limitTop) {
        setLimitBottom(limitBottom);
        setLimitTop(limitTop);
    }
    public boolean isNumberGuessed() {
        return failedGuesses.contains(randomInteger);
    }

//    public int guessNumber() {
//        Scanner scanner = new Scanner(System.in);
//        int answer = 0;
//        do {
////            answer = inputIntValue(scanner);
////            tryToGuess(answer);
//            inputIntValueWithScannerAndDiapason(scanner);
//        } while (!isNumberGuessed());
//        return answer;
//    }


}