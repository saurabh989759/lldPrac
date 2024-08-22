package AdderSubtractorSync;

public class Count {
    long value = 0 ;

    public synchronized void increment(int x) {
        value += x;
    }
    public synchronized void decrement(int x) {
        value -= x;
    }
}
