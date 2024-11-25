package abdulBari_java.lambdas;

interface MyLamda {
    public int lamda(int x , int y);
}
public class lambdademo {
    public static void main(String[] args) {
        abdulBari_java.lambdas.MyLamda myLamda = (a , b) -> {
            System.out.println(a+b);
           return a + b;
        };
        myLamda.lamda(34 , 35);
    }
}