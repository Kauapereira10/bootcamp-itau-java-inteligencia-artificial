public class MinhaThread extends Thread implements Runnable{

    @Override
    public void run() {
        System.out.println("Executando em: " + Thread.currentThread().getName());
    }
}
