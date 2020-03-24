public class Opgave_01 {
    public static void main(String[] args) throws InterruptedException {
        Runnable print1 = new PrintInt(1);
        Runnable print2 = new PrintInt(2);
        Runnable print5 = new PrintInt(5);
        Runnable print8 = new PrintInt(8);

        Thread thread1 = new Thread(print8);
        Thread thread2 = new Thread(print1);
        Thread thread3 = new Thread(print2);
        Thread thread4 = new Thread(print5);

        thread2.start();
        thread1.sleep(3000);
        thread1.start();
        thread4.sleep(3000);
        thread4.start();
        thread3.sleep(3000);
        thread3.start();


    }
}

class PrintInt implements Runnable{
    private int n;

    public PrintInt(int n){
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println(n);
    }
}