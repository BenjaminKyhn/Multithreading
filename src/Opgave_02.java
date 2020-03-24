public class Opgave_02 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintName(1));
        Thread thread2 = new Thread(new PrintName(2));
        Thread thread3 = new Thread(new PrintName(3));
        Thread thread4 = new Thread(new PrintName(4));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

class PrintName implements Runnable{
    private int n;

    public PrintName(int n){
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("Hallo, jeg hedder thread #" + n);
    }
}