package myexamples.callbacks.another_example;

public class Runner {
    public static void main(String[] args) {
        Worker worker = new Worker(new Callback() {
            @Override
            public void onComplete(String result) {

            }
        });
        worker.doWork();

    }
}
