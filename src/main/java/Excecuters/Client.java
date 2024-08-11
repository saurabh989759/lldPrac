package Excecuters;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        ExecutorService ex = Executors.newCachedThreadPool();

        for(int i = 0; i < 10; i++) {
           PrimeNumbers t = new PrimeNumbers(i);
           ex.execute(t);
        }
    }
}
