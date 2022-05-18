package com.next;

import com.next.splitter.CustomSplitter;
import com.next.splitter.DefaultSplitter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userString = getUserString();
        if (userString.isEmpty()) {
            System.out.println("result = " + 0);
            return;
        }

        calculate(userString);
    }

    private static String getUserString() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine().replace("\\n", "\n");
    }

    private static void calculate(final String userString) {
        try {
            String[] splitResult = getSplitResult(userString);
            new Validation(splitResult).check();

            System.out.println("result = " + new Calculator(splitResult).calculate());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException] " + e.getMessage());
        }
    }

    private static String[] getSplitResult(final String userString) {
        String[] customSplitResult = new CustomSplitter(userString).split();
        if (isDefaultSplit(customSplitResult)) {
            return new DefaultSplitter(userString).split();
        }

        return customSplitResult;
    }

    private static boolean isDefaultSplit(String[] customSplitResult) {
        return customSplitResult.length == 0;
    }
}
