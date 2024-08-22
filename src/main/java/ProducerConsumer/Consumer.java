package ProducerConsumer;

public class Consumer implements Runnable {
    private Store store;
    public Consumer(Store store) {
        this.store = store;
    }
    public void run() {
        while (true) {
            if(store.getItems().size() > 0) {
              //  System.out.println("Consumer " );
                store.removeItem();
            }
        }
    }
}
