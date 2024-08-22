package AdderSubtractorSyncronized;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Count count = new Count();
        ExecutorService ex = Executors.newCachedThreadPool();

        //Lock lock = new ReentrantLock();

        Adder add = new Adder(count );
        Subtractor sbb = new Subtractor(count );

        Future future = ex.submit(add);
        Future future2 = ex.submit(sbb);

        future2.get();
        future.get() ;
        System.out.println(count.value);


    }
}
