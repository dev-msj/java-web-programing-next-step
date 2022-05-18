package com.next;

import com.next.splitter.CustomSplitter;
import com.next.splitter.DefaultSplitter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"1,2,3", "1:2:3", "1,2:3"})
    public void addTest(String input) {
        String[] splitString = new DefaultSplitter(input).split();
        Assertions.assertThat(
                new Calculator(splitString).calculate()
        ).isEqualTo(6);
    }

    @ParameterizedTest
    @ValueSource(strings = {"//a\n1a2a4", "//\n124", "//;;\n1;;2;;4"})
    public void addCustomSplitTest(String input) {
        String[] splitString = new CustomSplitter(input).split();
        Assertions.assertThat(
                new Calculator(splitString).calculate()
        ).isEqualTo(7);
    }
}
