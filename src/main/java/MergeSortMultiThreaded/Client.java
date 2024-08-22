package MergeSortMultiThreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();

        List< Integer> list = List.of(1 ,4 ,56 , 45 ,6 ,78  , 32 , 100000);


        Sorter sorter = new Sorter(list , ex);

        Future<List<Integer>> future = ex.submit(sorter);

        list = future.get() ;

        System.out.println(list);
    }
}
