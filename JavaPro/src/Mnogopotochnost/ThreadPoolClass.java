package Mnogopotochnost;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolClass {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService =  Executors.newFixedThreadPool(5);  //пул из n потоков


        for (int i = 0; i < 5; i++)
            executorService.submit(new Work(i)); // количество заданий i, которое будет равным id, переедача заданий

            executorService.shutdown(); // прекращение передачи заданий, начало выполнения

            System.out.println("All tasks submitted");

            executorService.awaitTermination(1, TimeUnit.DAYS); //ожидание выполнения потока 1 день

    }
}

class Work implements Runnable {
    private int id;
    public Work(int id){
        this.id = id;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Work " + id + " was complited");

    }
}
