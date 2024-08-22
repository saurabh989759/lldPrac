package AdderSubtractorSync;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    Count count ;

    Subtractor(Count count ) {
        this.count = count;

    }
    @Override
    public Void call() throws Exception {
        for (int i = 1
             ; i < 100000; i++) {

            count.decrement(i);


        }
        return null;
    }
}
