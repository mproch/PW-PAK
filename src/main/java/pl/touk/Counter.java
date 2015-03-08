package pl.touk;

public class Counter {

    private int counter = 0;

    public final void inc() {
        counter++;
    }

    public final int getCounter() {
        return counter;
    }

}
