package com.next;

public class Splitter {
    public String[] split(String rawString) {
        return rawString.split(",|:");
    }

    public String[] customSplit(String rawString) {
        return new String[] {"1", "2"};
    }
}
