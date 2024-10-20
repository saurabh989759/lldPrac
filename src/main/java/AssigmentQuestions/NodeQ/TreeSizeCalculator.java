import AssigmentQuestions.NodeQ.Node;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    Node node ;
    ExecutorService ex ;
    public TreeSizeCalculator(Node node , ExecutorService ex) {
        this.node = node;
        this.ex = ex;
    }
    public Integer call() throws Exception {
        if(node == null)return -1 ;
        TreeSizeCalculator o1 = new  TreeSizeCalculator(node.left , ex) ;
        TreeSizeCalculator o2 = TreeSizeCalculator(node.right , ex) ;
        Future<Integer> f1 = ex.submit(o1) ;
        Future<Integer> f2 = ex.submit(o2) ;

        int h1 = f1.get() ;
        int h2 = f2.get() ;
        return Math.max(h1 , h2)  + 1 ;
    }
}