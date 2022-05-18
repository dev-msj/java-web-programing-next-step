package com.next;

public class Calculator {
    private final String rawString;
    private int result;

    public Calculator(String rawString) {
        this.rawString = rawString;
    }

    public int calculate() {
        try {
            String[] splitResult = getSplitResult();
            validateSplitResult(splitResult);
            add(splitResult);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException] " + e.getMessage());
            return -9999999;
        }

        return this.result;
    }

    private String[] getSplitResult() {
        return new Splitter(this.rawString).split();
    }

    private void validateSplitResult(String[] splitResult) throws RuntimeException {
        new Validation(splitResult).check();
    }

    private void add(String[] splitResult) {
        for (String value : splitResult) {
            this.result += Integer.parseInt(value);
        }
    }
}
