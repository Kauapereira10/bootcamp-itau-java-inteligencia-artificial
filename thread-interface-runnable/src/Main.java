import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void chamarApi(String nome) {
        try {
            System.out.println("Chamando "  +nome + "...");
            Thread.sleep(2000);
            System.out.println(nome + " Respondeu!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    public static void main(String[] args) throws InterruptedException {

        long inicio = System.currentTimeMillis();

        Thread t1 = new Thread(() -> chamarApi("API de pagamento"));
        Thread t2 = new Thread(() -> chamarApi("API de estoque"));

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        long total = System.currentTimeMillis() - inicio;
        System.out.println("Tempo total: " + total + "ms");
    }

}
