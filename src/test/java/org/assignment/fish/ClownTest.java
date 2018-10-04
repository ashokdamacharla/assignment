package org.assignment.fish;

import org.assignment.fish.ClownFish;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ClownTest {

    @Test
    public void testSizeColor() {
        ClownFish clownFish = new ClownFish();
        assertThat(clownFish.getSize(), is(equalTo("SMALL")));
        assertThat(clownFish.getColor(), is(equalTo("ORANGE")));
    }

    @Test
    public void testCrackJoke() throws IOException {
        OutputStream os = new ByteArrayOutputStream();
        os.write("Testing Sing.".getBytes());

        ClownFish clownFish = new ClownFish();
        clownFish.crackJoke();
        assertThat(os.toString(), is(equalTo("Testing Sing.")));
    }

}
