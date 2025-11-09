package myexamples.callbacks.another_example;

public class Worker {
private Callback callback;

public Worker(Callback callback) {

}
public void doWork() {
    System.out.println("Работа началась!");
    try {
Thread.sleep(1000);
    } catch (InterruptedException e) {
e.printStackTrace();
    }
    callback.onComplete("работа завершена");
}
}
