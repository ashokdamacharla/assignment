package org.assignment.bird;

import org.assignment.bird.Bird;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BirdTest {

    @Test
    public void testWalk() throws java.io.IOException {
        OutputStream os = new ByteArrayOutputStream();
        os.write("Testing Walk.".getBytes());
        PrintStream stream = new PrintStream(os, true);

        Bird bird = new Bird(true, "");
        bird.walk();

        assertThat(os.toString(), is(equalTo("Testing Walk.")));
    }

    @Test
    public void testFly() throws java.io.IOException {
        OutputStream os = new ByteArrayOutputStream();
        os.write("Testing Fly.".getBytes());
        PrintStream stream = new PrintStream(os, true);

        Bird bird = new Bird(false, "");
        bird.fly();

        assertThat(os.toString(), is(equalTo("Testing Fly.")));
    }

    @Test
    public void testSing() throws java.io.IOException {
        OutputStream os = new ByteArrayOutputStream();
        os.write("Testing Sing.".getBytes());
        PrintStream stream = new PrintStream(os, true);

        Bird bird = new Bird(true, "Test");
        bird.sing();

        assertThat(os.toString(), is(equalTo("Testing Sing.")));
    }

}
