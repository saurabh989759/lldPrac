package MergeSortMultiThreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    ExecutorService ex  ;
    List<Integer> list;
    Sorter( List<Integer> list ,ExecutorService ex) {
        this.list = list;
        this.ex = ex;

    }

    @Override
    public List<Integer> call() throws Exception {
        if(list.size() <= 1){
            return list;
        }
        int mid = list.size()/2;
        List<Integer> left = new ArrayList<>(list.subList(0,mid));
        List<Integer> right = new ArrayList<>(list.subList(mid,list.size()));

        Sorter s1 = new Sorter(left,ex);
        Sorter s2 = new Sorter(right,ex);

        Future<List<Integer>> f1 = ex.submit(s1);
        Future<List<Integer>> f2 = ex.submit(s2);

        left = f1.get();
        right = f2.get();
        List<Integer> result = new ArrayList<>(left);

        int i = 0 ;
        int j = 0 ;
        while(i < left.size() && j < right.size()){
            if(left.get(i) < right.get(j)){
                result.add(left.get(i));
            }else {
                result.add(right.get(j));
            }
            i++ ;
            j++ ;
        }
        while(i < left.size()){
            result.add(left.get(i));
            i++;
        }
        while(j < right.size()){
            result.add(right.get(j));
            j++ ;
        }
        return result;
    }
}
