package com.next.splitter;

public class DefaultSplitter {
    private final String rawString;

    public DefaultSplitter(final String rawString) {
        this.rawString = rawString;
    }

    public String[] split() {
        return rawString.split(RegexPattern.DEFAULT_PATTERN);
    }
}
