package Excecuters;

public class PrimeNumbers implements Runnable  {
    int noToPrint ;
    PrimeNumbers(int noToPrint) {
        this.noToPrint = noToPrint;
    }
    @Override
    public void run() {
       System.out.println("Printing" + noToPrint + " in thiread : - " + Thread.currentThread().getName());
    }
}
