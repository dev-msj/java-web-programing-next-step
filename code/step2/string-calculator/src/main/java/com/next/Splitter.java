package com.next;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Splitter {
    private final String rawString;

    public Splitter(final String rawString) {
        this.rawString = rawString;
    }

    public String[] split() {
        Object[] findResult = findStringPattern();
        if (isCustomSplit(findResult[0])) {
            return customSplit(findResult[1]);
        }

        return rawString.split(",|:");
    }

    private Object[] findStringPattern() {
        Pattern pattern = Pattern.compile("//(.*?)\n");
        Matcher matcher = pattern.matcher(this.rawString);

        if (matcher.find()) {
            return new Object[] {true, matcher.group(1).trim()};
        }

        return new Object[] {false, ""};
    }

    private boolean isCustomSplit(final Object findResult) {
        return (boolean) findResult;
    }

    private String[] customSplit(final Object findPattern) {
        String stringPattern = findPattern.toString();

        return this.rawString.split("\n")[1].split(stringPattern);
    }
}
