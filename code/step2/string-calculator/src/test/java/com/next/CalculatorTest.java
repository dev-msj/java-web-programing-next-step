package com.next;

import com.next.Calculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"1,2,3", "1:2:3", "1,2:3"})
    public void addTest(String input) {
        Assertions.assertThat(new Calculator(input).calculate()).isEqualTo(6);
    }

    @ParameterizedTest
    @ValueSource(strings = {"//a\n1a2a4", "//\n124", "//;;\n1;;2;;4"})
    public void addCustomSplitTest(String input) {
        Assertions.assertThat(new Calculator(input).calculate()).isEqualTo(7);
    }
}
