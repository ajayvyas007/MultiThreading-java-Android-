import java.util.concurrent.atomic.AtomicBoolean;

public class Worker implements Runnable {

    private Thread thread;
    private Runnable task;
    private AtomicBoolean started;

    public Worker(Runnable task){
        thread = new Thread(this);
        started = new AtomicBoolean(false);
    }

    public void start(){
        if (!started.getAndSet(true))
        thread.start();
    }

    @Override
    public void run() {
        thread.run();
    }
}
