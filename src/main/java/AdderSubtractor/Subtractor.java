package AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class Subtractor implements Callable<Void> {
    private  Count count ;
    private ExecutorService executor;
    public Subtractor(Count count , ExecutorService executor)  {
        this.count = count;
        this.executor = executor;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 0 ; i <= 1000 ; i++){
            count.value -= 1 ;
        }
        return null;
    }
}
