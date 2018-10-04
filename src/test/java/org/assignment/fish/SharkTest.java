package org.assignment.fish;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SharkTest {

    @Test
    public void testSizeColor() {
        Shark shark = new Shark();
        assertThat(shark.getSize(), is(equalTo("LARGE")));
        assertThat(shark.getColor(), is(equalTo("GREY")));
    }

    @Test
    public void testEat() throws IOException {
        OutputStream os = new ByteArrayOutputStream();
        os.write("Testing Sing.".getBytes());

        Shark shark = new Shark();
        shark.eat(new Fish());

        assertThat(os.toString(), is(equalTo("Testing Sing.")));
    }

}
