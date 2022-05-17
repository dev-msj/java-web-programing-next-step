package com.next;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Splitter {
    private final String CUSTOM_SPLIT_PATTERN = "//(.*?)\n";

    public String[] split(String rawString) {
        return rawString.split(",|:");
    }

    public String[] customSplit(String rawString) {
        String stringPattern = findStringPattern(rawString);
        return rawString.split("\n")[1].split(stringPattern);
    }

    public String findStringPattern(String rawString) {
        Pattern pattern = Pattern.compile(this.CUSTOM_SPLIT_PATTERN);
        Matcher matcher = pattern.matcher(rawString);

        if (matcher.find()) {
            return matcher.group(1).trim();
        }

        return "";
    }
}
