package Mnogopotochnost;

import java.util.Scanner;

public class VolatileClass {
    public static void main(String[] args) {
        MyThrea myThrea = new MyThrea();
        myThrea.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThrea.shutdown();


        scanner.nextLine();
        myThrea.wakeup();


    }
}

class MyThrea extends Thread {
    private volatile boolean running = true; //некэшируемая переменная


    public void run() {
        while (running)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void shutdown(){
        this.running = false;
    }
    public void wakeup(){
        this.running = true;
    }
}

