package abdulBari_java.lambdas;

// in this example we can pass th lambda as the function or as the method

interface  myLambda {
    public void display() ;
}
class useLamda {
    public void callLambda(myLambda lambda) {
        lambda.display();
    }
}
class Demo {
    public void method1(){
        useLamda lambda = new useLamda();
        lambda.callLambda(() -> {
            System.out.println("new changes");
        });
    }
}
public class lambdademo3 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.method1();
    }
}