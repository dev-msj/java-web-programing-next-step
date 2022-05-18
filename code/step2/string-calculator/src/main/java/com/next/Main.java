package com.next;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userString = getUserString();
        System.out.println("result = " + new Calculator(userString).calculate());
    }

    private static String getUserString() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine().replace("\\n", "\n");
    }
}
