package AdderSubtractorSync;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    Count count ;
    Adder(Count count  ) {
        this.count = count;
    }
    @Override
    public Void call() throws Exception {
       for(int i = 1 ; i < 100000 ; i++){
           count.increment(i);
       }
       return null;
    }
}
