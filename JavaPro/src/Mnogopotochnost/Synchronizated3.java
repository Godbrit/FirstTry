package Mnogopotochnost;

import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Synchronizated3 {


    public static void main(String[] args) throws InterruptedException {


        ProducerConsumer22 pc = new ProducerConsumer22();


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread3.start();
        thread4.start();

        thread3.join();
        thread4.join();


    }
}

class ProducerConsumer22 {
    private Queue<Integer> queue = new LinkedList<>(); //не потоковая очередь
    private final int LIMIT = 10;
    private final Object lock = new Object(); //объект для синхронизации

    public void produce() throws InterruptedException {
        int value = 0;

        while (true) {
            synchronized (lock) {
                while (queue.size()==LIMIT - 2){
                    lock.wait();
                }

                queue.offer(value++);
                lock.notify();
            }

        }
    }


        public void consume () throws InterruptedException {
            while (true){
            synchronized (lock) {
                while (queue.size() == 0) {
            lock.wait();
        }

            int value = queue.poll();
            System.out.println(value);
        System.out.println(queue.size());
                lock.notify();
    }
    Thread.sleep(1000);
}


        }


    }



