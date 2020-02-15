package ua.klodco.guessnumber;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Model {

    private int limitBottom;
    private int limitTop;
    private int randomInteger;
    private final List<Integer> failedGuesses = new ArrayList<>();

    public List<Integer> getFailedGuesses() {
        return failedGuesses;
    }

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
        randomInteger = new Random().nextInt(limitTop - 1) + limitBottom + 1;
    }

    public void setLimits(int limitBottom, int limitTop) {
        setLimitBottom(limitBottom);
        setLimitTop(limitTop);
    }

    public boolean isNumberGuessed() {
        return failedGuesses.contains(randomInteger);
    }

    public void addAnswer(int answer) {
        failedGuesses.add(answer);
    }

    public void attemptToGuess(int inputedInt) {
        addAnswer(inputedInt);
        if (inputedInt != randomInteger) {
            updateLimits(inputedInt);
        }
    }

    private void updateLimits(int inputedInt) {
        if (inputedInt > randomInteger) {
            setLimitTop(inputedInt);
        } else {
            setLimitBottom(inputedInt);
        }
    }
}