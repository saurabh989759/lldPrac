package AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class Adder implements Callable<Void> {
    private  Count count ;
    private ExecutorService ex ;
    public Adder(Count count , ExecutorService ex) {
        this.count = count;
        this.ex = ex;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 0 ; i <= 1000 ; i++){
            count.value += 1 ;
        }
        return null;
    }
}
