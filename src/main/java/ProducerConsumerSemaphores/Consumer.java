package ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;
    private Semaphore prodSemaphore;
    private Semaphore consumeSemaphore;

    public Consumer(Store store , Semaphore prodSemaphore, Semaphore consumeSemaphore) {
        this.consumeSemaphore =consumeSemaphore;
        this.prodSemaphore = prodSemaphore;
        this.store = store;
    }
    public void run() {
        while (true) {
            try {
                consumeSemaphore.acquire();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.removeItem();

            prodSemaphore.release();
        }
    }
}
