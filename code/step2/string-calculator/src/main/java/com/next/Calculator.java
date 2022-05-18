package com.next;

public class Calculator {
    private final String rawString;
    private int result;

    public Calculator(String rawString) {
        this.rawString = rawString;
    }

    public int calculate() {
        String[] splitResult = getSplitResult();
        validateSplitResult(splitResult);
        add(splitResult);

        return this.result;
    }

    private String[] getSplitResult() {
        return new Splitter(this.rawString).split();
    }

    private void validateSplitResult(String[] splitResult) {
        new Validation(splitResult).check();
    }

    private void add(String[] splitResult) {
        for (String value : splitResult) {
            this.result += Integer.parseInt(value);
        }
    }
}
