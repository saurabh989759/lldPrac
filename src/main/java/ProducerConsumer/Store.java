package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize ;
    private List<Object> items;

    Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>(maxSize);
    }
    public int getMaxSize(){
        return maxSize;
    }
    public List<Object> getItems(){
        return items;
    }
    public void addItem(){
        System.out.println("Producer , Current size : " + items.size());
        items.add(new Object());
    }

    public synchronized void removeItem(){
        System.out.println(
                "Consumer , Current size : " + items.size()
        );
        items.remove(items.size()-1);
    }
}
