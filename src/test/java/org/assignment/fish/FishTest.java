package org.assignment.fish;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FishTest {

    @Test
    public void testSound() {
        Fish fish = new Fish();

        assertThat(fish.isSinging(), is(equalTo(false)));
        assertThat(fish.isWalking(), is(equalTo(false)));
        fish.swim();
        assertThat(fish.isSwimming(), is(equalTo(true)));
    }

}
