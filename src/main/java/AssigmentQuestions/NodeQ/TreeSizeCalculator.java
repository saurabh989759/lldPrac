import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
//mport AssigmentQuestions.NodeQ.Node;
 class Node{
    public Node left, right;
    public int data;
    public Node(){
        this.left= null; this.right=null; this.data=0;
    }
    public Node(int data){// Note 1:
        this.data=data; this.left=this.right=null;
    }
}
;

public class TreeSizeCalculator implements Callable<Integer> {
    Node node ;
    ExecutorService ex ;
    public TreeSizeCalculator(Node node , ExecutorService ex) {
        this.node = node;
        this.ex = ex;
    }
    public Integer call() throws Exception {
        if(node == null)return -1 ;
        TreeSizeCalculator t1 = new TreeSizeCalculator(node, ex) ;
        TreeSizeCalculator t2 = new TreeSizeCalculator(node, ex) ;
        Future<Integer> f1 = ex.submit(t1);
        Future<Integer> f2 = ex.submit(t2);
        int h1 = f1.get();
        int h2 = f2.get();
        return Math.max(h1 , h2)  + 1 ;
    }
}