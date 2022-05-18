package com.next;

import com.next.splitter.CustomSplitter;
import com.next.splitter.DefaultSplitter;

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
        String[] customSplitResult = new CustomSplitter(rawString).split();
        if (isDefaultSplit(customSplitResult)) {
            return new DefaultSplitter(this.rawString).split();
        }

        return customSplitResult;
    }

    private boolean isDefaultSplit(String[] customSplitResult) {
        return customSplitResult.length == 0;
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
