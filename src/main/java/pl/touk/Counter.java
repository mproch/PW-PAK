package pl.touk;

/**
 * taki tam licznik
 */
public class Counter {

    private int counter = 0;

    public final void inc() {
        counter++;
    }

    /**
     *
     * @return wartosc licznika
     */
    public final int getCounter() {
        return counter;
    }

}
