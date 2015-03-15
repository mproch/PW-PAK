package pl.touk;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class CounterTest {

    @Test
    public void shouldStartWithZero() {
        Counter counter = new Counter();

        assertEquals(0, counter.getCounter());

    }

    @Test
    public void shouldReturnNumberOfInc() {
        Counter counter = new Counter();

        counter.inc();
        counter.inc();

        assertEquals(5, counter.getCounter());
    }

}
