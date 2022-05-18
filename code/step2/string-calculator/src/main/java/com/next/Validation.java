package com.next;

public class Validation {
    private final String[] splitResult;

    public Validation(String[] splitResult) {
        this.splitResult = splitResult;
    }

    public void check() throws RuntimeException {
        checkStringValue();
        checkMinusNumber();
    }

    private void checkStringValue() throws RuntimeException {
        for (String value : splitResult) {
            isStringValue(value);
        }
    }

    private void isStringValue(String value) throws RuntimeException {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new RuntimeException("숫자가 아닌 값을 입력했습니다.");
        }
    }

    private void checkMinusNumber() throws RuntimeException {
        for (String value : splitResult) {
            isMinusNumber(value);
        }
    }

    private void isMinusNumber(String stringValue) throws RuntimeException {
        int value = Integer.parseInt(stringValue);
        if (value < 0) {
            throw new RuntimeException("음수를 입력했습니다.");
        }
    }
}
