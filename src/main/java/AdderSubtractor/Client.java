package AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Count count = new Count();
        ExecutorService ex = Executors.newCachedThreadPool();

        Adder add = new Adder(count , ex) ;
        Subtractor subtractor = new Subtractor(count , ex) ;

        Future <Void> fuur = ex.submit(subtractor);
        Future <Void> future1 = ex.submit(add);

        fuur.get();
        future1.get() ;
    }


}
