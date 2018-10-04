package org.assignment.fly;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ButterFlyTest {

    @Test
    public void testCaterpillar() {
        Caterpiller caterpiller = new Caterpiller();
        assertThat(caterpiller.isFlying(), is(equalTo(false)));
        caterpiller.walk();
        assertThat(caterpiller.isWalking(), is(equalTo(true)));
    }

    @Test
    public void testMetamorph() {
        Caterpiller caterpiller = new Caterpiller();
        assertThat(caterpiller.metamorph().getClass().getName(), is(equalTo(ButterFly.class.getName())));
        assertThat(caterpiller.metamorph().isWalking(), is(equalTo(false)));
        assertThat(caterpiller.metamorph().isFlying(), is(equalTo(true)));
    }

    @Test
    public void testButterFly() {
        ButterFly butterFly = new ButterFly();
        butterFly.fly();
        assertThat(butterFly.isFlying(), is(equalTo(true)));
        assertThat(butterFly.isSinging(), is(equalTo(false)));
    }

}
