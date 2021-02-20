package Mnogopotochnost;

import java.util.Random;
import java.util.concurrent.*;

public class CallbleFutureClass {
    private static int result = 0;


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        /*executorService.submit(()  -> {    //создание потока
            System.out.println("Starting");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");
             return  random.nextInt(10);
        })  ;
                */



        /*
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished");
                result ++;
            }
        });


         */

        Future<Integer> future =  executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception { //возможность возвращения значения
                Random random = new Random();
                System.out.println("Starting");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished");
                int randomValue = random.nextInt();
                if (randomValue<5)
                    throw new Exception("Something Bad ");
                return  random.nextInt(10);

            }

        });


        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    //    int result = 0;
        try {
            result = future.get();   //ожидание окончания потока
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("Oh my");
            Throwable ex = e.getCause(); //причина
            System.out.println(ex.getMessage());  //текст исключения
      //      e.printStackTrace();
        }

        System.out.println(result);
    }

    public static int calculate() {
        return 5;

    }

}
