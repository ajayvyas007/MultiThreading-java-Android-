import java.util.concurrent.ConcurrentLinkedQueue;

public class Executer extends Thread {

    private ConcurrentLinkedQueue<Worker> workers;
    private Callback callback;




    public interface Callback{
        void onComplete();
    }
}
