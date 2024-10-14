import AssigmentQuestions.NodeQ.Node;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class TreeSizeCalculator implements Callable<Integer> {
    Node node ;
    ExecutorService ex ;
    public TreeSizeCalculator(Node node , ExecutorService ex) {
        this.node = node;
        this.ex = ex;
    }
    public Integer call() throws Exception {
        return 1 ;
    }
}