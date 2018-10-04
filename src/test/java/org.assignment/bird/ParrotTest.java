package org.assignment.bird;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ParrotTest {

    @Test
    public void testSound() {
        Rooster rooster = new Rooster();
        Parrot parrotNearRooster = new Parrot(rooster);
        parrotNearRooster.sing();
        assertThat(parrotNearRooster.isSinging(), is(equalTo(true)));
        assertThat(parrotNearRooster.getSound(), is(equalTo(rooster.getSound())));

        Duck duck = new Duck();
        Parrot parrotNearDuck = new Parrot(duck);
        parrotNearDuck.sing();
        assertThat(parrotNearDuck.isSinging(), is(equalTo(true)));
        assertThat(parrotNearDuck.getSound(), is(equalTo(duck.getSound())));
    }
}
