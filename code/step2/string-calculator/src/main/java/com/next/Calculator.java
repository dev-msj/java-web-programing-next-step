package com.next;

public class Calculator {
    private final String[] splitString;
    private int result;

    public Calculator(String[] splitString) {
        this.splitString = splitString;
    }

    public int calculate() {
        for (String value : splitString) {
            this.result += Integer.parseInt(value);
        }

        return this.result;
    }
}
