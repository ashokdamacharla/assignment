package org.assignment.bird;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RoosterTest {

    @Test
    public void testSound() {
        Rooster rooster = new Rooster();
        rooster.sing();
        assertThat(rooster.isSinging(), is(equalTo(true)));
        assertThat(rooster.getSound(), is(equalTo("Cock-a-doodle-doo")));
    }

}
