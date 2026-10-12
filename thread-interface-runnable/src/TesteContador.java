import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TesteContador {

    public static void main(String[] args) throws InterruptedException {

        Runnable contagem = () -> {
            String nome = Thread.currentThread().getName();

            for (int i = 1; i <= 5; i++) {
                System.out.println(nome + " -> " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        };

        Thread t1 = new Thread(contagem, "Thread-A");
        Thread t2 = new Thread(contagem, "Thread-B");
        Thread t3 = new Thread(contagem, "Thread-C");

        t1.start();
        t2.start();
        t3.start();






    }

}
