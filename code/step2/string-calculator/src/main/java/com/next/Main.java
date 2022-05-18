package com.next;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userString = getUserString();
        int result = getResult(userString);
        System.out.println("result = " + result);
    }
    
    private static String getUserString() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine().replace("\\n", "\n");
    }

    private static int getResult(String userString) {
        return userString.isEmpty() ? 0 : new Calculator(userString).calculate();
    }
}
