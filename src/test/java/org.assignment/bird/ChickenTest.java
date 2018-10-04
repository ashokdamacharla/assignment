package org.assignment.bird;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ChickenTest {

    @Test
    public void testSound() {
        Chicken chicken = new Chicken();
        chicken.sing();
        assertThat(chicken.isSinging(), is(equalTo(true)));
        assertThat(chicken.getSound(), is(equalTo("Cluck, cluck")));
        chicken.swim();
        assertThat(chicken.isFlying(), is(equalTo(false)));
    }

}
