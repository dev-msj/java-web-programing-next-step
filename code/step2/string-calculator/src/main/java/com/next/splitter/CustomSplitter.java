package com.next.splitter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomSplitter {
    private final String rawString;

    public CustomSplitter(String rawString) {
        this.rawString = rawString;
    }

    public String[] split() {
        Pattern pattern = Pattern.compile(RegexPattern.CUSTOM_PATTERN);
        Matcher matcher = pattern.matcher(this.rawString);

        if (matcher.find()) {
            return customSplit(matcher);
        }

        return new String[] {};
    }

    private String[] customSplit(final Matcher matcher) {
        String customPattern = matcher.group(1).trim();

        return matcher.group(2).split(customPattern);
    }

    private boolean isCustomSplit(final String[] findResult) {
        return findResult.length != 0;
    }
}
