package org.assignment.fish;

import org.assignment.fish.Dolphin;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DolphinTest {

    @Test
    public void testSwim() {
        Dolphin dolphin = new Dolphin();
        dolphin.swim();
        assertThat(dolphin.isSwimming(), is(equalTo(true)));
    }
}
