package Mnogopotochnost;

public class VvedenieClass {
    public static void main(String[] args) throws InterruptedException {
         MyThread myThread = new MyThread();
    //   myThread.run();
        myThread.start(); //создание новый поток
        MyThread myThread2 = new MyThread();
        myThread2.start();
        Thread thread = new Thread(new Runner());
        thread.start();
        System.out.println("Hello");
        Thread.sleep(3000);  //Остановка потока
        for (int i = 0; i <10 ; i++) {
            System.out.println("Hello22222222222222222222222222222222222222222222222222");
        }

    //    System.out.println("Hello22222222222222222222222222222222222222222222222222");

    }

}


class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from RUN" + i);

        }
    }
}


class MyThread extends Thread {  //java.lang //поток
        public void run() {
            for (int i = 0; i <100 ; i++) {
                try {
                    Thread.sleep(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello from MyThread" + i);

            }
    }


}