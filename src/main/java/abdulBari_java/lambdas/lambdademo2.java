package abdulBari_java.lambdas;

interface  mLambda {
    public void display() ;
}
class useLambda{
    int temp = 10 ;
    public void method1(){
        int count = 0 ;
         // count++; same as the reason in line 16
        // and we cannot modify it
        mLambda lambda = ()->{
           // int count = 0 ;
           // count++ ;         // this is alloed inside of the lambda expression
            System.out.println(count + (temp++));
            // yes we can modify the instance variable but we cannot modify the localvariable
            // where the lambda exp is defined
        };
       // count++ ;  this is wrong because the lambda expression can ony have variables
        //           inside it those are final or seems to be final here it does not
        //           seems to be final
    }
}