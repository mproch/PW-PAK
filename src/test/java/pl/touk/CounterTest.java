package pl.touk;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;


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

        assertEquals(2, counter.getCounter());
    }

}
