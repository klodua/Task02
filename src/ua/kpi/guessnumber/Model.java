package ua.kpi.guessnumber;

public class Model {
    private String inputedString;

    public String addValue(String addedValue) {
        return inputedString += addedValue;
    }

    public String getInputedString() {
        return inputedString;
    }

    public void setInputedString(String inputedString) {
        this.inputedString = inputedString;
    }
}