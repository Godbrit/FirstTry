package Mnogopotochnost;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReentrantLockClas {
    public static void main(String[] args) throws InterruptedException {
        //количество раз вызываемое метод countDown, после отсчёта await начинает пропускать команду.
        CountDownLatch countDownLatch = new CountDownLatch(6);  //Отчёт назад, количество итераций, потокобезопасный

        ExecutorService executorService = Executors.newFixedThreadPool(6);  //количество потоков
        for (int i = 0; i < 6 ; i++) {
            executorService.submit(new Processor(i, countDownLatch));  //задание

        }

        executorService.shutdown(); //закрытие потоков

        /*
        countDownLatch.await();
        System.out.println("Latch has been opened");
           */

        for (int i = 0; i <3 ; i++) {
            Thread.sleep(3000);
            countDownLatch.countDown();

        }


    }
}


class Processor implements Runnable {
    private int id;
   private CountDownLatch countDownLatch;

   public Processor (int id, CountDownLatch countDownLatch){
       this.id = id;
       this.countDownLatch = countDownLatch;
   }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread with id " + id);

    }
}