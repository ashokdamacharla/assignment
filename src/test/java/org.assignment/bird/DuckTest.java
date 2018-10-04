package org.assignment.bird;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DuckTest {

    @Test
    public void testSound() {
        Duck duck = new Duck();
        duck.sing();
        assertThat(duck.isSinging(), is(equalTo(true)));
        assertThat(duck.getSound(), is(equalTo("Quack, quack")));
        duck.swim();
        assertThat(duck.isSwimming(), is(equalTo(true)));
    }

}
