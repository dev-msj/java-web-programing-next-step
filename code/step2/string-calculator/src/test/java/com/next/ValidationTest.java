package com.next;

import com.next.splitter.DefaultSplitter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidationTest {
    @Test
    public void MinusNumberCheckTest() {
        String[] splitResult = new DefaultSplitter("1,-2,3").split();
        Assertions.assertThatThrownBy(() -> new Validation(splitResult).check()).isInstanceOf(RuntimeException.class);
    }

    @Test
    public void StringCheckTest() {
        String[] splitResult = new DefaultSplitter("1,a,3").split();
        Assertions.assertThatThrownBy(() -> new Validation(splitResult).check()).isInstanceOf(RuntimeException.class);
    }
}
